package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Context c = new Context();
        String ip = "";
        Scanner sc = new Scanner(System.in);
        List<String> saveword = new ArrayList<>();

        //check last substring is . or >.
        System.out.print("Enter your sentence: ");
        ip = sc.nextLine();
        sc.close();
        if (ip != null && ip.length() > 0 && ip.charAt(ip.length() - 1) != '.'){
            if (ip.charAt(ip.length() - 1) != '>'){
                System.out.println("Error in expression.");
            }
        }
        // split word and add to array list.
        if (ip != null && ip.length() > 0 && ip.charAt(ip.length() - 1) == '.' || ip.charAt(ip.length() - 1) == '>'){
            if (ip.charAt(ip.length() - 1) == '.'){
                ip = deletedot(ip);
                String[] wordarr = ip.split(" ");
                for ( String s : wordarr){
                    saveword.add(s);
                }
            }else if (ip.substring(0,9).equalsIgnoreCase("<subject>") ||
                    ip.substring(10,16).equalsIgnoreCase("<verb>")  ||
                    ip.substring(ip.length()-12).equalsIgnoreCase("<complement>")){
                String[] wordarr = ip.split(" ");
                for ( String s : wordarr){
                    saveword.add(s);
                }
            }
        }

        //check no. of word.
        if (saveword.size() == 3){
            if (!saveword.get(0).substring(0,1).equals("<") &&
                    !saveword.get(1).substring(0,1).equals("<") &&
                    !saveword.get(2).substring(0,1).equals("<")){
                Expression e1 = new TerminalExpression(saveword.get(0), saveword.get(1), saveword.get(2) );
                System.out.println(e1.interpreter(c));
            }

            if (saveword.get(0).substring(0,1).equals("<") ||
                    saveword.get(1).substring(0,1).equals("<") ||
                    saveword.get(2).substring(0,1).equals("<")){
                Expression e2 = new NonTerminalExpression(saveword.get(0), saveword.get(1), saveword.get(2) );
                System.out.println(e2.interpreter(c));
            }
        }
    }
    public static String deletedot(String str) {
        if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == '.') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}


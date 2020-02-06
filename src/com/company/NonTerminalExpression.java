package com.company;

public class NonTerminalExpression implements Expression {
   private String sj;
    private String v;
    private String n;
    private String ms = "";


    public NonTerminalExpression(String sj, String v, String n) {
        this.sj = sj;
        this.v = v;
        this.n = n;
    }

    @Override
    public String interpreter(Context con) {
        if (sj.contains("<subject>") || v.contains("<verb>") || n.contains("<complement>")){
            if (sj.contains("<subject>") && v.contains("<verb>") && n.contains("<complement>")){
                for (int i = 0; i < con.getSubject().size(); i++) {
                    System.out.println(con.getSubject().get(i) +" "+ con.getVerb().get(i) +" "+ con.getNoun().get(i) +".");
                    ms = "Interpret 0 error.";
                }
            }else if (sj.contains("<subject>") && v.contains("<verb>")){
                if (con.getNoun().contains(n.toLowerCase())){
                    for (int i = 0; i < con.getSubject().size(); i++) {
                        System.out.println(con.getSubject().get(i) +" "+ con.getVerb().get(i) +" "+ n +".");
                    }
                    ms = "Interpret 0 error.";
                }
            }else if (v.contains("<verb>") && n.contains("<complement>")){
                if (con.getSubject().contains(sj.toLowerCase())){
                    for (int i = 0; i < con.getSubject().size(); i++) {
                        System.out.println(sj +" "+ con.getVerb().get(i) +" "+ con.getNoun().get(i) +".");
                    }
                    ms = "Interpret 0 error.";
                }
            }else if (sj.contains("<subject>") && n.contains("<complement>")){
                if (con.getVerb().contains(v.toLowerCase())){
                    for (int i = 0; i < con.getSubject().size(); i++) {
                        System.out.println(con.getSubject().get(i) +" "+ v +" "+ con.getNoun().get(i) +".");
                    }
                    ms = "Interpret 0 error.";
                }
            }else if (sj.contains("<subject>")){
                if (con.getVerb().contains(v.toLowerCase()) && con.getNoun().contains(n.toLowerCase())){
                    for (int i = 0; i < con.getSubject().size(); i++) {
                        System.out.println(con.getSubject().get(i) +" "+ v +" "+ n +".");
                    }
                    ms = "Interpret 0 error.";
                }
            }else if (v.contains("<verb>")){
                if (con.getSubject().contains(sj.toLowerCase()) && con.getNoun().contains(n.toLowerCase())){
                    for (int i = 0; i < con.getSubject().size(); i++) {
                        System.out.println(sj +" "+ con.getVerb().get(i) +" "+ n +".");
                    }
                    ms = "Interpret 0 error.";
                }
            }else if (n.contains("<complement>")){
                if (con.getSubject().contains(sj.toLowerCase()) && con.getVerb().contains(v.toLowerCase())){
                    for (int i = 0; i < con.getSubject().size(); i++) {
                        System.out.println(sj +" "+ v +" "+ con.getNoun().get(i) +".");
                    }
                    ms = "Interpret 0 error.";
                }
            }
        }else {
            ms = "Expression not found.";
        }
        return ms;
    }
}

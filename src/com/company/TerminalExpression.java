package com.company;

public class TerminalExpression implements Expression {
    private String sj;
    private String v;
    private String n;

    public TerminalExpression(String sj, String v, String n) {
        this.sj = sj;
        this.v = v;
        this.n = n;
    }

    @Override
    public String interpreter(Context con) {
        if(con.getSubject().contains(sj.toLowerCase()) && con.getVerb().contains(v.toLowerCase()) && con.getNoun().contains(n.toLowerCase())) {
            String message = "Interpret 0 error.";
            return message;
        }
        else {
            String message = "Expression not found.";
            return message;
        }
    }

}

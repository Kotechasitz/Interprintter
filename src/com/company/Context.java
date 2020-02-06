package com.company;

import java.util.ArrayList;

public class Context {
    private ArrayList subject = new ArrayList();
    private ArrayList verb = new ArrayList();
    private ArrayList noun = new ArrayList();

    public Context() {
        setSubject();
        setVerb();
        setNoun();
    }

    private void setSubject(){
        subject.add("josh");
        subject.add("jim");
        subject.add("kane");
        subject.add("ice");
        subject.add("min");
        subject.add("not");
        subject.add("pid");
        subject.add("top");
        subject.add("jack");
        subject.add("yen");
    }

    private void setVerb(){
        verb.add("love");
        verb.add("eat");
        verb.add("kick");
        verb.add("like");
        verb.add("send");
        verb.add("play");
        verb.add("drink");
        verb.add("feed");
        verb.add("rent");
        verb.add("read");
    }

    private void setNoun(){
        noun.add("mom");
        noun.add("cake");
        noun.add("dog");
        noun.add("tea");
        noun.add("gift");
        noun.add("basketball");
        noun.add("beer");
        noun.add("dog");
        noun.add("condo");
        noun.add("news");
    }

    public ArrayList getSubject() {
        return subject;
    }

    public ArrayList getVerb() {
        return verb;
    }

    public ArrayList getNoun() {
        return noun;
    }
}

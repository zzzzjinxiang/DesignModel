package com.DesignModels.VisitorModel;

public class test {
    public static void main(String[] args) {

        Visitor visitor = new UserVisitor();
        Subject sub = new UserSubject();
        sub.action(visitor);
    }
}

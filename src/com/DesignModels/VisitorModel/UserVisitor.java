package com.DesignModels.VisitorModel;

public class UserVisitor implements Visitor{
    @Override
    public void visit(Subject sb) {
        System.out.println("visit sub"+sb.getSubject());
    }
}

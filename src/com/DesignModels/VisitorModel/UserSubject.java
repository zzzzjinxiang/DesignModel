package com.DesignModels.VisitorModel;

public class UserSubject implements Subject {

    @Override
    public void action(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "";
    }
}

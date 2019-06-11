package com.DesignModels.VisitorModel;

public interface Subject {

    public void action(Visitor visitor);
    public String getSubject();
}

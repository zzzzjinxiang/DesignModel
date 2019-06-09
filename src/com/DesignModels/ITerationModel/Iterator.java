package com.DesignModels.ITerationModel;

public interface Iterator {
    Object previous();
    Object next();
    boolean hasNext();
    Object first();
}

package com.DesignModels.ITerationModel;

import java.util.Iterator;

public interface Collection {
    Iterator iterator();
    Object get(int i);
    int size();
}

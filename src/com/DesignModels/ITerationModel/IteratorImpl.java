package com.DesignModels.ITerationModel;

public class IteratorImpl<E> implements Iterator{

    private Object object;
    public IteratorImpl(E e){
        this.object = e;
    }

    @Override
    public Object previous() {
        return null;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object first() {
        return null;
    }
}

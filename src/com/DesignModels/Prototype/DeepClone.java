package com.DesignModels.Prototype;

import java.io.*;

public class DeepClone implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private ProductA productA;

    public DeepClone(String name,ProductA productA){
        this.productA = productA;
        this.name = name;
    }

    public void updateName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone proto = (DeepClone) super.clone();
        return proto;
    }

    public Object deepClone() throws IOException,ClassNotFoundException{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}

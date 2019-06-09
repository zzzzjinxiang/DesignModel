package com.DesignModels.AdapterModels.AdapterInt;

public class test {
    public static void main(String[] args) {
        Sourceable source1 = new Source1();
        Sourceable source2 = new Source2();
        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}

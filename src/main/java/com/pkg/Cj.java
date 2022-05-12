package com.pkg;

import org.junit.jupiter.api.Test;

public class Cj {
    public static void main(String []args) {

  Singleton s=Singleton.getInstance();
  Singleton s2=Singleton.getInstance();
  s.increment();
        s2.increment();
        s2.increment();
        System.out.println(s.geti());
    }


    @Test
    public void testCj() {
        Singleton s=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        org.junit.jupiter.api.Assertions.assertEquals(s,s2);


    }
}

 class Singleton {

    private static Singleton singleton = null;
    private static int i = 0;

    private Singleton() {


    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void increment() {
        i++;
    }

    public int geti() {
        return i++;
    }




}

package dsa;// Java program to reverse a string using recursion

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClimbingStairs {

    public static void main(String[] args) {
MyThread t=new MyThread();
t.run();
       // Thread.currentThread().setName("Bhaskar Thread");
System.out.println(  Thread.currentThread().getName());

    }
}

class MyThread extends Thread{
    @Override
    public void run() {

        System.out.println("Child thread");
        System.out.println(Thread.currentThread().getName()+" Beta");
          }
}
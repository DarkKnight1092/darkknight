//import java.nio.channels.ScatteringByteChannel;
//import java.util.List;
//
//public class PracExceptions {
//public static void main(String []args) {
//    try {
//        int i = 9;
//        int j = 0;
//       // int k = i / j;
//        //System.out.print(k);
//        List l=null;
//        System.out.print(l.get(0));
//    } catch (Exception e) {
//        System.out.print(e);
//    }
//
//}
//}

// Java program to illustrate Serializable interface
import java.io.*;

// By implementing Serializable interface
// we make sure that state of instances of class A
// can be saved in a file.
class Apple  {
    int i;
    String s;
public Apple(){

}
    // A class constructor
    public Apple(int i, String s)
    {
        this.i = i;
        this.s = s;
    }
}

public class PracExceptions {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        Apple a = new Apple();
        a.i=10;

       Apple b= new Apple();
       b.i=20;
        System.out.println(a.i+"  "+b.i);
    }
}

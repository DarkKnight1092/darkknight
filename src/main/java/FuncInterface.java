import java.security.PublicKey;

public class FuncInterface {

    public static void main(String[] args) {

        Integer a=9;
        Integer b=56;
   Cab c= (j, i)-> {
       System.out.print(i+j);
   };
   c.add(a,b);
    }
}
@FunctionalInterface
interface Cab{
    void add(Integer i,Integer j);
    default void anyOther(){
        System.out.println( "Iam another method");
    }
}
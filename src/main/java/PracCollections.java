import java.lang.reflect.Array;
import java.util.*;

public class PracCollections {

    public static void main(String []args) {
        //List<Integer> c=new ArrayList<>();
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Ball");
        map.put(3,"Cat");
        //Collections val= new Collections();
        System.out.println(map.keySet());
        for(Integer i:map.keySet()){
            System.out.println(map.get(i));
        }



               }
    }



class Employee{
    public String name;
}

class Manager extends Employee{
    public String role;
}
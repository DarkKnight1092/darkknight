import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lists {

    public static void main (String []args){

        String sft="ABC";
        String tst="ABC";

        System.out.println(sft.equals(tst));

        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> p=new Predicate<Integer>() {

            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        System.out.println(values.stream().filter(p).map(i->i*10).findFirst().orElse(0));

        // List<Integer> modi= (List<Integer>) values.stream().map(i->i*2);
//        Function<Integer,Integer> f = new Function<Integer, Integer>() {
//            public Integer apply(Integer in) {
//              return in * 2;
//          }
//
//        };

//        BinaryOperator<Integer> b= new BinaryOperator<Integer>(){
//
//            public Integer apply(Integer i,Integer j){
//                return i+j;
//            }
//        };
        Stream<Integer>s= values.stream();
        Stream<Integer>s1=s.map( in->in * 2);
        Integer result =(Integer)s1.reduce(0, (i,j)-> i+j);
        //System.out.println(result);
        //values.stream().map(f).forEach(System.out::println);
//       Lists a= new Lists();
//       a.fltr(values).stream().forEach(System.out::println);
//

    }




    public List<Integer> fltr(List<Integer> values) {
        List<Integer> newList=new ArrayList<>();
        for (int i: values){
            if(i%2==0){
                newList.add(i);
            }
        }
        return newList;
    };

}

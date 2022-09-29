import lombok.*;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lists {

    public static void main(String[] args) {

       Map l= new HashMap();
//       l.add("Snake");
//       l.add(1453);
        System.out.println(l.get(0)+"         "+l.get(1));

    }

}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
class Carry {
    String name;
    String place;

//    @Override
//    public String toString(){
//        return this.name+"  "+this.place;
//}
    }
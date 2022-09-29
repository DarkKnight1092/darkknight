import lombok.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Enums{

    public static void main(String []args){

        Object st ="Tis is object of type string";
        System.out.println(st);


       }
    }
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
    class BindClass{
@NonNull
    String userName;
    String city;



    }
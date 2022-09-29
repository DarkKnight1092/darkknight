import java.util.ArrayList;
import java.util.List;

public class threeexactnumbers {

    public static void main(String[] args){

        String s="12a"; //w6or2l4b
        boolean isValid=true;
        boolean result=true;
        int i;
        List<Character> lst = new ArrayList<>();

        for(i=0; i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                  if((!lst.contains(s.charAt(i))) && isValid && lst.size()<3){
                    isValid=false;
                    lst.add(s.charAt(i));
                   }
                   else{
                    result=false;
                    break;
                   }
            }else
            { isValid=true;
            }
//            for(char c:lst){
//                System.out.println(c+" list members");
//            }
        }
          result= result && (lst.size()==3 );
        System.out.println(result);



    }
}

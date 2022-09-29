public class MultiplyStrings {

    public static void main(String[] args){
        String s1="9133";
        String s2="0";
        if(s1.length()<s2.length()){
    String temp;
    temp=s1;
    s1=s2;
    s2=temp;
        }

        String temp1="",tepm2="",result="0";
        for(int i=s2.length()-1;i>=0;i--) {
             temp1=multiply(s1,s2.charAt(i));
           // System.out.println("Present mul "+temp1);
             int runs=s2.length()-1-i;
             for(int r=0;r<runs;r++){
                 temp1=temp1+"0";
             }
            result=addStrings(temp1,result);
           // System.out.println("resu upto "+result);
        }
        System.out.println(result);
       // multiply("9133",s2.charAt(0));
       // addStrings("123","0");

    }
public static String addStrings(String a,String b){
        int i,j,l,sum=0;
        int len1=a.length()-1;
        int len2=b.length()-1;
        int min= len1<len2?len1:len2;
        int carry=0;
        String newres="";
        for( l=0;l<=min;l++){
            i=Integer.parseInt(String.valueOf(a.charAt(len1--)));
            j=Integer.parseInt(String.valueOf(b.charAt(len2--)));
           // System.out.println("i and j"+i+" "+j);
            sum=i+j+carry;
            carry=sum/10;
            newres=newres+String.valueOf(sum%10);
           // System.out.println("added to string"+String.valueOf(sum%10));
        }
    //System.out.println("carry is"+String.valueOf(carry));
        while(len1>=0){
            i=Integer.parseInt(String.valueOf(a.charAt(len1--)));
            sum=i+carry;
            carry=sum/10;
            newres=newres+String.valueOf(sum%10);
            //System.out.println("added to string in loop first"+String.valueOf(sum%10));
        }

    while(len2>=0){
        i=Integer.parseInt(String.valueOf(b.charAt(len2--)));
        sum=i+carry;
        carry=sum/10;
        newres=newres+String.valueOf(sum%10);
       // System.out.println("added to string in loop second"+String.valueOf(sum%10));
    }

    if(carry!=0){
        newres=newres+String.valueOf(carry);
      // System.out.println("added to string"+String.valueOf(carry));
    }
    //System.out.println("FInal result is"+newres);
    StringBuffer sbr = new StringBuffer(newres);
    // To reverse the string
    sbr.reverse();
    //System.out.println(sbr.toString());
        return sbr.toString();
}



    public static String multiply(String a,char b) {
 if(b=='0'){
    // System.out.println("0"+" zero is answer");
     return "0";
 }
        else{
        int i = Integer.parseInt(String.valueOf(b));
        int j, sum = 0;
        String newres = "";
        // System.out.println("integer is "+i);
        int carry = 0;
        for (int l = a.length() - 1; l >= 0; l--) {
            j = Integer.parseInt(String.valueOf(a.charAt(l)));
            sum = i * j + carry;
            carry = sum / 10;
            newres = newres + String.valueOf(sum % 10);
            System.out.println("added to string" + String.valueOf(sum % 10));
        }
        if (carry != 0) {
            newres = newres + String.valueOf(carry);
            //  System.out.println("added to string"+String.valueOf(sum%10));
        }
        //System.out.println(newres+ "result is");
        StringBuffer sbr = new StringBuffer(newres);
        // To reverse the string
        sbr.reverse();
        //System.out.println(sbr.toString());

        return sbr.toString();
    }
    }
    }

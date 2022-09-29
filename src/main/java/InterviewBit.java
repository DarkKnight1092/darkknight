import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

//police catching thief
public class InterviewBit {
    public static void main(String[] args) {
        int n=2,k=1;
        int num,prev=0;
        Deque<Integer> dq= new LinkedList<>();
          dq.add(1);dq.add(2);dq.add(3);dq.add(4);dq.add(5);dq.add(6);dq.add(7);
             dq.add(8);dq.add(9);

            while(dq.peek()*10< (int)Math.pow(10,n)){
                num=dq.peek();
                for(int j=0;j<=9;j++){
                    int dif=Math.abs((num%10)-j);
                    if(dif==k){
                        dq.add(num*10+j);
                        //System.out.println("added"+(num*10+j));
                    }
                }
                int popped=dq.pop();
                //System.out.println("popped is"+popped);
            }
            //System.out.println(dq.size()+"Size of dq");
        System.out.println(dq);


    }
}
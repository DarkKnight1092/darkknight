package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trains {
public  static void main(String[] args){
    int n = 3;
    int[] arr = new int[]{900, 1000, 1100};
   int[]  dep = new int[]{1200, 1200, 1200};
int maxsize=1;
    List<Integer> lst=new ArrayList<>();
    lst.add(dep[0]);

    for(int i=1;i<n;i++)
    {
        int pres=arr[i];
        lst.stream().forEach(a->System.out.print(a+" "));
        System.out.println();
       lst= lst.stream().filter(p->p>pres ).collect(Collectors.toList());
       lst.add(dep[i]);
       if(lst.size()>maxsize)
           maxsize=lst.size();

    }
    System.out.print(maxsize+" Max size");
}
}

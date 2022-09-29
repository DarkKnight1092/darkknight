public class MethodRef {
    public static void main(String []args){
//        Calculator cref=Calc::addSomething;
//        cref.add(11,33);
////        Calc cr=new Calc();
////        Calculator cm =cr::letsAdd;
////        cm.add(400,598);
        Calculator c=(a,b)-> {System.out.println("Addition result is "+(a+b)); };
        c.add(10,16);
    }
}

@FunctionalInterface
interface Calculator{
    void add(int a,Integer b);
}
class Calc{
    public  static void addSomething(int a , int b){
        System.out.println("a+ bi is "+(a+b));

    }
    public void letsAdd(Integer a,Integer b){
        System.out.println("a+ bi is "+(a+b));
    }
}

import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;


public class Demo {


    public static void main(String []args) {

        String str="Apple";
        System.out.println(str.toUpperCase());
    List<Laptop> laptops=new ArrayList<Laptop>();
    laptops.add(new Laptop("Dell",3000));
        laptops.add(new Laptop("Lenovo",2000));
        laptops.add(new Laptop("Apple",6000));
        laptops.add(new Laptop("hp",4000));

      // Comparator<Laptop> cmp =new Comparator<Laptop>() {
//            @Override
//            public int compare(Laptop o1, Laptop o2) {
//                if(o1.getPrice()<o2.getPrice())
//                    return 1;
//                else
//                    return -1;
//
//            }
//        };
    //Collections.sort(laptops);
        //Sorts the laptops according to brand name;
//    Collections.sort(laptops,(Laptop o1, Laptop o2) ->{
//            if(Integer.valueOf(Character.toUpperCase(o1.getBrand().charAt(0) ))<Integer.valueOf(Character.toUpperCase(o2.getBrand().charAt(0) )))
//                return -1;
//            else
//                return 1;
//
//        });
//    for(Laptop l:laptops) {
//        System.out.println(l);
//    }


    }
}

class Laptop{
    private String brand;
    private Integer price;

    public Laptop(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", Price=" + price +
                '}';
    }


}
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class JsonPrac {

    public static void main(String[] args) throws JsonProcessingException {

//        String jsonCarArray =
//                "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
//
//        listCar.stream().forEach(car -> {
//            System.out.println(car.getColor()+"  "+car.getType());
//        });

        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
       ObjectMapper objectMapper=new ObjectMapper();
        Map<String, Object> map
                = objectMapper.readValue(json, new TypeReference<Map<String,Object>>(){});
        for(String s: map.keySet()){
            System.out.println(s+"    "+map.get(s));
        }
    }


}

class Car{
    String color;
    String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }
    public Car(){

    }
}
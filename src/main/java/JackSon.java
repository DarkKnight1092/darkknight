import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

public class JackSon {


        public static void main(String[] args) throws Exception{
            String json_str = "{\"name\":\"John\", \"age\":21 , \"place\":\"Nevada\"}";
            ObjectMapper mapper = new ObjectMapper();
            try {
                JsonNode node = mapper.readTree(json_str);
                String name = node.get("name").asText();
                Integer place = node.get("age").asInt();
                System.out.println("node"+node);
                System.out.println("name: "+name +", place: "+place);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            try {
                String str = "[{\"rollNo\":1234,\"age\":123,\"name\":\"Ramu\",\"courseId\":\"Archery\"}]";
                String strnew = str.replace("[","").replace("[","");
                JSONObject jsonObject = new JSONObject(strnew);
                System.out.println("OBJECT : "+jsonObject.get("age"));
            } catch (JSONException err) {
                System.out.println("Exception : "+err.toString());
            }
    }
}

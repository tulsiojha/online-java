import org.json.JSONObject;

class JsonTest{

    String data = "{\"students\":{\"123\":{\"detail\":{\"name\":\"abc\",\"roll no\":\"123\"},\"marks\":{\"1\":10,\"2\":30}},\"234\":{\"detail\":{\"name\":\"xyz\",\"roll no\":\"234\"},\"marks\":{\"1\":100,\"2\":300}}},\"subjects\":{\"1\":\"Python\",\"2\":\"Java\"}}";
    JsonTest(){

        System.out.println(data);
    }

    public static void main(String[] args){
        new JsonTest();
    }


}
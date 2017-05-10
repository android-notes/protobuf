import com.google.gson.Gson;
import com.gpb.JsonData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by wanjian on 2017/5/10.
 */

public class GsonParse {

    public static void main(String[] args) throws Exception {
        File josnFile = new File("lib/src/main/java/data.json");
        BufferedReader reader = new BufferedReader(new FileReader(josnFile));

        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        reader.close();
        System.out.println("------------BEGIN-----------");
        String json = builder.toString();
        System.out.println(json);
        System.out.println("------------END-----------");
        byte[] data = json.getBytes();
        JsonData jsonData = null;
        long s = System.currentTimeMillis();
        jsonData = new Gson().fromJson(new String(data), JsonData.class);
        long e = System.currentTimeMillis();
        System.out.println("gson to obj finished : " + (e - s));

        s = System.currentTimeMillis();
        json = new Gson().toJson(jsonData);
        data = json.getBytes();
        e = System.currentTimeMillis();
        System.out.println("gson to json finished : " + (e - s));

        System.out.println("gson size (bytes) : " + data.length);

        System.out.println("\n\n<---------  byte[] -> obj ->  byte[] ---------> \n\n"+new String(data));

    }
}

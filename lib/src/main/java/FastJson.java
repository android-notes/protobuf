import com.alibaba.fastjson.JSON;
import com.gpb.JsonData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by wanjian on 2017/5/10.
 */

public class FastJson {

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
        jsonData = JSON.parseObject(data, JsonData.class);
        long e = System.currentTimeMillis();
        System.out.println("fastJson to obj finished : " + (e - s));

        s = System.currentTimeMillis();
        data = JSON.toJSONBytes(jsonData);
        e = System.currentTimeMillis();
        System.out.println("fastJson to json finished : " + (e - s));



        System.out.println("fastJson size (bytes) : " + data.length);

        System.out.println("\n\n<---------  byte[] -> obj ->  byte[] ---------> \n\n"+new String(data));

    }
}

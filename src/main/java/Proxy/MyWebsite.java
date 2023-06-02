package Proxy;

import java.util.HashMap;
import java.util.Map;

public class MyWebsite implements Website{
    private final Map<String,String> mapOfContent;

    public MyWebsite(){
        mapOfContent=new HashMap<>();
        mapOfContent.put("123","aaa");
    }
    @Override
    public void downloadVideo(String password) {
        System.out.println(mapOfContent.get(password));

    }
    public boolean isContent(String key){
        return mapOfContent.containsKey(key);
    }
}

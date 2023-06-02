package Decorator;

import java.util.ArrayList;
import java.util.List;

public class MyComp implements Computer{
    private List<String> list;
    public MyComp(){
        list=new ArrayList<>();
    }
    @Override
    public String getDescription() {
        return "my comp: ";
    }
}

package Decorator;

import bridgePattern.Component;

import java.util.ArrayList;
import java.util.List;

public abstract class MyComputerDecorator implements Computer {
    private Computer myComp;

    public MyComputerDecorator(Computer myComp) {
        this.myComp = myComp;
    }
    public String getDescription(){
        return "";
    }
    public Computer getMyComp() {
        return myComp;
    }
}

package Observer;

import Decorator.Computer;
import bridgePattern.Component;

import java.util.ArrayList;

public interface Subscribers {
    void update(Computer computer);
    boolean favoriteComp(ArrayList<String> list);
}

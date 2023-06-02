package Observer;

import ChainOfResp.Alta;
import ChainOfResp.Shops;
import ChainOfResp.Zoomer;
import Decorator.Computer;

import java.util.ArrayList;
import java.util.List;

public class People implements Subscribers{
    private Computer computer;
    private ArrayList<String> list;
    public People(ArrayList<String> list){
        this.list=list;
    }
    @Override
    public void update(Computer computer) {
        this.computer=computer;
        if(favoriteComp(list)){
            Shops alta=goToAlta();
            Shops zoomer=goToZoomer();
            alta.setNextShop(zoomer);
            alta.buildComp(computer);
        }
    }
    @Override
    public boolean favoriteComp(ArrayList<String> list) {
        for (String s : list) {
            if (!computer.getDescription().contains(s)) {
                return false;
            }
        }
        return true;
    }
    private Shops goToAlta(){
        return new Alta();
    }
    private Shops goToZoomer(){
        return new Zoomer();
    }



}

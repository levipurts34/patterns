package Observer;

import Decorator.CPU;
import Decorator.Computer;
import Decorator.MyComp;
import Decorator.RAM;

import java.util.ArrayList;
import java.util.List;

public class PCShopReal implements PCShop{
    private List<Subscribers> list;
    public PCShopReal(){
        list=new ArrayList<>();
    }
    @Override
    public void addSubscription(Subscribers subscribers) {
        list.add(subscribers);
    }
    @Override
    public void removeSubscription(Subscribers subscribers) {
        list.remove(subscribers);

    }
    @Override
    public void notifySubscribers(Computer computer) {
        for(Subscribers s: list){
            s.update(computer);
        }
    }

    @Override
    public Computer createContent() {
        Computer computer=new MyComp();
        computer=new CPU(computer);
        computer=new RAM(computer);
        return computer;
    }
}

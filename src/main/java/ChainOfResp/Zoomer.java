package ChainOfResp;

import Decorator.Computer;

import java.util.function.Predicate;

public class Zoomer implements Shops{
    private Shops shop;
    @Override
    public void buildComp(Computer computer) {
        Predicate p=(a)->computer.getDescription().contains((String)a);
        if(p.test("RAM") && p.test("CPU") && p.test("GPU") &&  p.test("HDD")){
            System.out.println("we can do it");
        }else if(shop!=null){
            shop.buildComp(computer);
        }else{
            System.out.println("in Georgia we can't build that computer :( ");
        }
    }

    @Override
    public void setNextShop(Shops shop) {
        this.shop=shop;
    }
}

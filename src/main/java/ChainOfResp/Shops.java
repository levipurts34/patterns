package ChainOfResp;

import Decorator.Computer;

public interface Shops {
    void buildComp(Computer computer);
    void setNextShop(Shops shop);
}

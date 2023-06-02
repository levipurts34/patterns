package Command;

import ChainOfResp.Shops;

public class CompWithSDD implements ComputerBuilder{
    private LocalShop shop;

    public CompWithSDD(LocalShop shop) {
        this.shop = shop;
    }

    @Override
    public void buildComputer() {
        shop.buildWithSDD();
    }
}

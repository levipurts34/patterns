package Command;

import ChainOfResp.Shops;

public class CompWithHDD implements ComputerBuilder{
    private LocalShop shop;

    public CompWithHDD(LocalShop shop) {
        this.shop = shop;
    }

    @Override
    public void buildComputer() {
        shop.buildWithHDD();
    }
}

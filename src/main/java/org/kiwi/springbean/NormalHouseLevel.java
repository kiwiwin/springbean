package org.kiwi.springbean;

public class NormalHouseLevel implements HouseLevel {
    @Override
    public int getPrice(int originalPrice) {
        return originalPrice;
    }
}

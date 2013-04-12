package org.kiwi.springbean;

public class LuxuryHouseLevel implements HouseLevel {
    @Override
    public int getPrice(int originalPrice) {
        return originalPrice * 2;
    }
}

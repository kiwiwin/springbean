package org.kiwi.springbean;

public class House {
    private HouseLevel level;
    private int originalPrice;

    public House(HouseLevel level, int originalPrice) {
        this.level = level;
        this.originalPrice = originalPrice;
    }

    public int getPrice() {
        return level.getPrice(originalPrice);
    }
}

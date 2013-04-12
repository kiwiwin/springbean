package org.kiwi.springbean;

public class House {
    private HouseLevel level;
    private int originalPrice;

    public House(HouseLevel level) {
        this.level = level;
    }

    public int getPrice() {
        return level.getPrice(originalPrice);
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setLevel(HouseLevel level) {
        this.level = level;
    }
}

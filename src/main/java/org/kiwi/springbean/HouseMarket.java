package org.kiwi.springbean;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class HouseMarket {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("house-config.xml");
        House house = (House) context.getBean("house");
        System.out.println(house.getPrice());
    }
}

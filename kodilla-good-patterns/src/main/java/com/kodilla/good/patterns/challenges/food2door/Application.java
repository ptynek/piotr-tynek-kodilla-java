package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class Application {

    Manufacturer manufacturer = new Manufacturer("Extra Food Shop");
    ProductOrder productOrder = new ProductOrder( "Coffe", 5);
    LocalDateTime orderTime = LocalDateTime.of(2022, 9, 20, 12,33);


}

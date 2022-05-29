package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        Order order = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new GlutenFreeShop());
        orderProcessor.process(order);



    }


}

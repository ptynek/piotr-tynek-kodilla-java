package com.kodilla.good.patterns.challenges.orders;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformCustomerService(), new ProductOrderService(), new OrderRepostitoryService());
        orderProcessor.process(orderRequest);
    }


}

package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private MailServiceProcess mailServiceProcess;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(MailServiceProcess mailServiceProcess,
                          OrderService orderService,
                          OrderRepository orderRepository) {
        this.mailServiceProcess = mailServiceProcess;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }


}

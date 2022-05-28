package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop {

    private MailServiceProcess mailServiceProcess;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getManufacturer(),
                orderRequest.getProductOrder(), orderRequest.getOrderTime());

        if (isOrdered) {
            mailServiceProcess.inform(orderRequest.getManufacturer());
            orderRepository.createOrder(orderRequest.getManufacturer(),
                    orderRequest.getProductOrder(), orderRequest.getOrderTime());
            return new OrderDto(orderRequest.getManufacturer(), orderRequest.getProductOrder(), true);
        } else {
            return new OrderDto(orderRequest.getManufacturer(), orderRequest.getProductOrder(), false);
        }
    }
}

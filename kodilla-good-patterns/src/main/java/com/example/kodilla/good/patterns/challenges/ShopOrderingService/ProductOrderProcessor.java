package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

public class ProductOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor (final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDTO process(final ProductOrderRequest productOrderRequest) {
        boolean isSuccesfullySold = orderService.sold(productOrderRequest.getUser(), productOrderRequest.getProduct(), productOrderRequest.getData());

        if (isSuccesfullySold){
            informationService.informatioin(productOrderRequest.getUser());
            orderRepository.createOrder(productOrderRequest.getUser(), productOrderRequest.getProduct(), productOrderRequest.getData());
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getProduct(),true);
        } else {
            return new ProductOrderDTO(productOrderRequest.getUser(),productOrderRequest.getProduct(), false);
        }
    }

    /*public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            productOrderRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }*/



}

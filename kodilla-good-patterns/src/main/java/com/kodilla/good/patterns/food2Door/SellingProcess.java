package com.kodilla.good.patterns.food2Door;

public class SellingProcess {

    private final Order order;
    private final InformationService informationService;
    private final SellingService sellingService;

    public SellingProcess(Order order, InformationService informationService, SellingService sellingService) {
        this.order = order;
        this.informationService = informationService;
        this.sellingService = sellingService;
    }

    public SellingDto process(final Order order) {
        boolean isRented = sellingService.sell(order);

        if (isRented){
            informationService.inform(order.getCustomer());
            return new SellingDto(order, true);
        }else {
            return new SellingDto(order, false);
        }
    }
}

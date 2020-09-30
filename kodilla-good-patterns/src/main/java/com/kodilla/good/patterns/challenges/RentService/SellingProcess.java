package com.kodilla.good.patterns.challenges.RentService;

public class SellingProcess {

    private final InformationService informationService;
    private final SellingService sellingService;
    private final SellRepository sellRepository;

    public SellingProcess(final InformationService informationService,
                          final SellingService sellingService,
                          final SellRepository rentalRepository) {
        this.informationService = informationService;
        this.sellingService = sellingService;
        this.sellRepository = rentalRepository;
    }

    public SellingDto process(final RentRequest rentRequest) {
        boolean isRented = sellingService.sell(rentRequest.getUser(), rentRequest.getBuyTime(), rentRequest.getIdSellingItem());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            sellRepository.createOrder(rentRequest.getUser(), rentRequest.getBuyTime(), rentRequest.getIdSellingItem());
            return new SellingDto(rentRequest.getUser(), true);
        } else {
            return new SellingDto(rentRequest.getUser(), false);
        }
    }
}
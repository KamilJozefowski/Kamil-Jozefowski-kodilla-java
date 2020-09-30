package com.kodilla.good.patterns.challenges.RentService;

public class SellingProcess {

    private InformationService informationService;
    private SellingService rentalService;
    private RentalRepository sellRepository;

    public SellingProcess(final InformationService informationService,
                          final SellingService rentalService,
                          final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.sellRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.sell(rentRequest.getUser(), rentRequest.getBuyTime(), rentRequest.getIdSellingItem());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            sellRepository.createOrder(rentRequest.getUser(), rentRequest.getBuyTime(), rentRequest.getIdSellingItem());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
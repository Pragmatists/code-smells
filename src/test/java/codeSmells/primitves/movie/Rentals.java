package codeSmells.primitves.movie;

import java.util.ArrayList;
import java.util.List;

public class Rentals {
    private List<Rental> rentalsList = new ArrayList<Rental>();

    double getTotalCharge() {
        double totalCharge = 0;
        for (Rental rental : rentalsList) {
            totalCharge += rental.getCharge();
        }
        return totalCharge;
    }
    public void add(Rental rental) {
        rentalsList.add(rental);
    }
}

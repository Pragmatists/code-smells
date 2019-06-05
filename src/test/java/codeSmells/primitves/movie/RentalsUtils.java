package codeSmells.primitves.movie;

import java.util.List;

public class RentalsUtils {
    public static double getTotalCharge(List<Rental> rentalList) {
        double totalCharge = 0;
        for (Rental rental : rentalList) {
            totalCharge += rental.getCharge();
        }
        return totalCharge;
    }

}

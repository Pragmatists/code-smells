package codeSmells.primitves.movie;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static codeSmells.primitves.movie.RentalsUtils.getTotalCharge;

public class RentalsTest {

    @Test
    public void calculate_total_charge_for_customer() throws Exception {
        List<Rental> rentals = new ArrayList<Rental>();
        Movie regularMovie = new Movie("Matrix", Movie.REGULAR);
        Movie newReleaseMovie = new Movie("Shrek", Movie.NEW_RELEASE);

        rentals.add(new Rental(newReleaseMovie, 2));
        rentals.add(new Rental(regularMovie, 3));

        Assertions.assertThat(getTotalCharge(rentals)).isEqualTo(9.5);
    }
}

package codeSmells.demeter;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RentalsTest {

    @Test
    public void calculate_total_charge_for_rentals() throws Exception {
        Movie newReleaseMovie = new Movie("Matrix", new NewReleasePrice());
        Movie childrenMovie = new Movie("Shrek", new ChildrenMoviePrice());
        Customer aCustomer = new Customer("");
        aCustomer.addRental(new Rental(newReleaseMovie, 2));
        aCustomer.addRental(new Rental(childrenMovie, 3));

        Assertions.assertThat(aCustomer.getTotalCharge()).isEqualTo(7.5);
    }
}

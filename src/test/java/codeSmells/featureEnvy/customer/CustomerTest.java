package codeSmells.featureEnvy.customer;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    @Test
    public void phoneNumber() {
        Customer customer = new Customer(new Phone("+48567564234"));

        String mobilePhoneNumber = customer.getMobilePhoneNumber();

        assertThat(mobilePhoneNumber).isEqualTo("(+48) 567-5642");
    }
}



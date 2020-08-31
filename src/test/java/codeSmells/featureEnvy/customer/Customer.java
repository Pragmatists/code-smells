package codeSmells.featureEnvy.customer;

class Customer {

    private Phone mobilePhone;
    
    Customer(Phone mobilePhone,String mobilePhoneNumber) {
        this.mobilePhone = mobilePhone;
    }
        
    String mobilePhoneNumber = mobilePhone.getMobilePhoneNumber();
}


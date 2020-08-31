package codeSmells.primitves.movie;

public class Movie {
    public PriceCode Price;
    String title;

    public Movie(String title, PriceCode Price) {
        this.title = title;
        this.Price = Price;
    }

    public PriceCode getPriceCode() {
        return Price;
    }

    public void setPrice(PriceCode Price) {
        this.Price = Price;
    }
    
    public double getCharge(int daysRented) {
        return Price.getCharged(daysRented);
        }
}

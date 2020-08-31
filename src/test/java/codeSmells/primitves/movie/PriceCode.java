/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeSmells.primitves.movie;

/**
 *
 * @author Andrea
 */
public abstract class PriceCode {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public abstract int getPrice();
        
    public static PriceCode Create(int priceCode){
        switch (priceCode) {
            case REGULAR:
                return new Regular();
            case NEW_RELEASE:
                return new Release();
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    
    public abstract double getCharged(int daysRented);
}


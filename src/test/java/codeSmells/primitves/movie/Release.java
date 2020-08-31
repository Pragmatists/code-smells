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
public class Release extends PriceCode{

    public Release() {
    }
    
    @Override
    public int getPrice() {
        return NEW_RELEASE;
    }

    @Override
    public double getCharged(int daysRented) {
        return daysRented * 3;
    }
}

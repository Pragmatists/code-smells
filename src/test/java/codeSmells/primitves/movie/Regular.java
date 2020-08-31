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
 public class Regular extends PriceCode{
        
    @Override
    public int getPrice() {
        return REGULAR;
    }

    @Override
    public double getCharged(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
 }

package codeSmells.manyParameters;

import org.junit.Test;

public class CircleTest {

    @Test
    public void circle() {
        Circle.make(10, 20, 15);
    }


    static class Circle {

        static Circle make(double x, double y, double radius) {
            return new Circle(x, y, radius);
        }

        private Circle(double x, double y, double radius) {
        }
    }

}

package com.company;

public class Main {
    static class Formula {
        public double x;
        public double y;

        public Formula(double x, double y) {
            this.x = x;
            this.y = y;
        }

         public void displayformula() {
             double z = (x + y) / (y + 1);
             System.out.println(z);
             System.out.println(x);
             System.out.println(y);
         }
    }

    public static void main(String[] args) {
        Formula formula=new Formula(3,5);
        formula.displayformula();
        formula.x=3;
        formula.displayformula();
        formula.y=5;


    }
}

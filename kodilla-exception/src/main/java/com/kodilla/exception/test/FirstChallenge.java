package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException{
        if (b==0) {
            throw new ArithmeticException();
        }
        return a/b;
    }

        /**
         * This main can throw an ArithmeticExcetion!!!
         * @param args
         */
        public static void main(String[] args){
            FirstChallenge firstChallenge = new FirstChallenge();
            try {
                double result = firstChallenge.divide(3,0);
                System.out.println("It's good" + result);
            }catch (ArithmeticException e){
                System.out.println("Error! You can't divide for zero!");
            } finally {
                System.out.println("Learn math");
            }

        }

}

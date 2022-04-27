package com.kodilla;

public class calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAToB(int a, int b) {
        return a - b;

    }

    public static void main(String[] args){
        calculator calc = new calculator();
        calc.addAToB(4, 4);
    }
}
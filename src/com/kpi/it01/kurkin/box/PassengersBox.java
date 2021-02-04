package com.kpi.it01.kurkin.box;

public class PassengersBox {
    private final int maxAmount;
    private int currentAmount;

    public PassengersBox(int maxPassengersAmount) {
        maxAmount = maxPassengersAmount;
        currentAmount = 0;
    }

    public void takePassengers(int amount) throws TooMuchPassengersException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Passengers amount to take can`t be less or equal 0");
        }
        if (currentAmount + amount < maxAmount) {
            currentAmount += amount;
        } else {
            throw new TooMuchPassengersException("EXCEPTION! Can`t take "+amount+" passengers. Current amount is "+currentAmount);
        }
    }

    public int getCurrentAmount() {
        return currentAmount;
    }
}

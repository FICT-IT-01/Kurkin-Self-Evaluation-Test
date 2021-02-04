package com.kpi.it01.kurkin.position;

public class Position {
    private int height;
    private int totalDistance;
    private final int maxHeigth;

    public Position(int maxHeigth) {
        this.maxHeigth = maxHeigth;

        height = 0;
        totalDistance = 0;
    }

    public void goUp(int meters) throws InvalidPositionChangeException {
        if (meters <= 0) {
            throw new IllegalArgumentException("EXCEPTION! Distance can`t be less or equal 0");
        }
        if (height + meters > maxHeigth) {
            throw new InvalidPositionChangeException("EXCEPTION! Can`t go higher than "+maxHeigth);
        }
        if (height == 0) {
            totalDistance = 0;
        }

        height += meters;
        totalDistance += meters;
    }

    public void goDown(int meters) throws InvalidPositionChangeException {
        if (meters <= 0) {
            throw new IllegalArgumentException("EXCEPTION! Distance can`t be less or equal 0");
        }
        if (height - meters < 0) {
            throw new InvalidPositionChangeException("EXCEPTION! Can`t go lower than 0");
        }

        height -= meters;
        totalDistance += meters;
    }

    public int getHeight() {
        return height;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public boolean isOnGround(){
        return height == 0;
    }
}

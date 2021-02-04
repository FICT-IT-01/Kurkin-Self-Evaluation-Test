package com.kpi.it01.kurkin.balloon;

import com.kpi.it01.kurkin.box.PassengersBox;
import com.kpi.it01.kurkin.box.PassengersBoxIsUnavaibleException;
import com.kpi.it01.kurkin.position.Position;
import com.kpi.it01.kurkin.position.PositionIsUnavaibleException;

public class Balloon {

    private final PassengersBox passengersBox;
    private final Position position;

    private boolean isFireOn;

    public Balloon(int maxPassengersAmount, int maxHeight) {
        passengersBox = new PassengersBox(maxPassengersAmount);
        position = new Position(maxHeight);
        isFireOn = false;
    }

    public Position getPosition() throws PositionIsUnavaibleException {
        if (!isFireOn) {
            throw new PositionIsUnavaibleException("EXCEPTION! Fire is off. Position changes is unavailable");
        }
        return position;
    }

    public PassengersBox getPassengersBox() throws PassengersBoxIsUnavaibleException {
        if (!position.isOnGround()){
            throw new PassengersBoxIsUnavaibleException("EXCEPTION! Balloon is flying now. Can`t access passenger box");
        }
        return passengersBox;
    }

    public void putOutFire() throws FireIsUnAnavaibleException {
        if (!position.isOnGround()){
            throw new FireIsUnAnavaibleException("EXCEPTION! Fire is not on ground! Can`t take out fire");
        }
        isFireOn = false;
    }

    public void lightFire() throws FireIsUnAnavaibleException {
        if (!position.isOnGround()){
            throw new FireIsUnAnavaibleException("EXCEPTION! Fire is not on ground! Can`t take out fire");
        }
        isFireOn = true;
    }

    @Override
    public String toString() {
        return "Balloon{passengers = "+passengersBox.getCurrentAmount()+
                ", heigth="+position.getHeight()+
                ", totalDistance="+position.getTotalDistance()+
                ", is fire on="+isFireOn+
                "}";
    }
}

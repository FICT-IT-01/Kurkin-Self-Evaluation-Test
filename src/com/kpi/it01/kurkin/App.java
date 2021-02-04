package com.kpi.it01.kurkin;

import com.kpi.it01.kurkin.balloon.Balloon;
import com.kpi.it01.kurkin.balloon.FireIsUnAnavaibleException;
import com.kpi.it01.kurkin.box.PassengersBoxIsUnavaibleException;
import com.kpi.it01.kurkin.box.TooMuchPassengersException;
import com.kpi.it01.kurkin.position.InvalidPositionChangeException;
import com.kpi.it01.kurkin.position.PositionIsUnavaibleException;

public class App {
    public static void main(String[] args) {
        Balloon balloon = new Balloon(
                10,
                5000
        );

        try {
            balloon.getPassengersBox().takePassengers(7);
            balloon.getPassengersBox().takePassengers(4);
        } catch (TooMuchPassengersException | PassengersBoxIsUnavaibleException | IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("\n"+balloon+"\n");

        try{
            balloon.getPosition().goDown(20);
        } catch (PositionIsUnavaibleException | IllegalArgumentException | InvalidPositionChangeException e){
            System.out.println(e.getLocalizedMessage());
        }

        try {
            balloon.lightFire();
        } catch (FireIsUnAnavaibleException e){
            System.out.println(e.getLocalizedMessage());
        }

        try{
            balloon.getPosition().goDown(20);
        } catch (PositionIsUnavaibleException | IllegalArgumentException | InvalidPositionChangeException e){
            System.out.println(e.getLocalizedMessage());
        }

        try{
            balloon.getPosition().goUp(6000);
        } catch (PositionIsUnavaibleException | IllegalArgumentException | InvalidPositionChangeException e){
            System.out.println(e.getLocalizedMessage());
        }

        try{
            balloon.getPosition().goUp(100);
            balloon.putOutFire();
        } catch (PositionIsUnavaibleException | IllegalArgumentException | InvalidPositionChangeException | FireIsUnAnavaibleException e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("\n"+balloon+"\n");

        try {
            balloon.getPassengersBox().takePassengers(2);
        } catch (TooMuchPassengersException | PassengersBoxIsUnavaibleException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("\n"+balloon);

        try{
            balloon.getPosition().goDown(100);
            balloon.putOutFire();
        } catch (PositionIsUnavaibleException | IllegalArgumentException | InvalidPositionChangeException | FireIsUnAnavaibleException e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println(balloon);

    }
}

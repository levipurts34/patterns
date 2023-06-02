package org.example;

import Adapter.Area;
import Adapter.adapter;
import ChainOfResp.Alta;
import ChainOfResp.Shops;
import ChainOfResp.Zoomer;
import Command.*;
import Command.Delivery;
import Decorator.*;
import Memento.MementoHolder;
import Memento.Memento;
import Memento.Student;
import Observer.People;
import Proxy.MyWebsiteProxy;
import Proxy.Website;
import Strategy.BubbleSort;
import Strategy.SortingContext;
import Strategy.SortingStrategy;
import Visitor.*;
import bridgePattern.*;

import java.lang.annotation.Target;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Computer computer=new MyComp();
        computer=new CPU(computer);
        computer=new RAM(computer);
        Shops alta=new Alta();
        Shops zoom=new Zoomer();
        alta.setNextShop(zoom);
        alta.buildComp(computer);

        Student levan=new Student();
        levan.setGPA(3.5);
        Memento firstSemester=levan.saveToMemento();
        MementoHolder mementoHolderFirst=new MementoHolder();
        mementoHolderFirst.saveMemento(firstSemester);
        levan.setGPA(3.7);
        Memento secondSemester=levan.saveToMemento();
        MementoHolder mementoHolderSecond=new MementoHolder();
        mementoHolderSecond.saveMemento(secondSemester);
        levan.setGPA(3.1);
        Memento thirdSemester=levan.saveToMemento();
        MementoHolder mementoHolderThird=new MementoHolder();
        mementoHolderThird.saveMemento(thirdSemester);
        levan.setGPA(4.3);
        double[] list=new double[4];
        list[0]=mementoHolderFirst.getSavedState().getPreviousGPA();
        list[1]=mementoHolderSecond.getSavedState().getPreviousGPA();
        list[2]=mementoHolderThird.getSavedState().getPreviousGPA();
        list[3]=levan.getGPA();
        Component resistor=new Resistor(4.7);
        Component inductor=new Inductor(2.7);
        Component capacitor=new Capacitor(6.7);
        Electronic circuit1=new Circuit(resistor);
        Electronic circuit2=new Circuit(inductor);
        Electronic circuit3=new Circuit(capacitor);
        double[] listOfPrice=new double[3];
        listOfPrice[0]=resistor.getPrice();
        listOfPrice[1]=capacitor.getPrice();
        listOfPrice[2]=inductor.getPrice();
        for(double i: listOfPrice){
            System.out.println(i);
        }
        SortingStrategy sortingStrategy=new BubbleSort();
        SortingContext sortingContext=new SortingContext(sortingStrategy);
        sortingContext.executeSort(listOfPrice);
        for(double i: listOfPrice){
            System.out.println(i);
        }
    }
}
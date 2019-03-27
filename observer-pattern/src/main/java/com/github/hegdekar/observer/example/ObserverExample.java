package com.github.hegdekar.observer.example;

import com.github.hegdekar.observer.impl.Observer;
import com.github.hegdekar.observer.impl.SubjectImpl;

public class ObserverExample {

  public static void main(String[] args){
    System.out.println("***Observer Pattern Demo***\n");

    Observer o1 = new Observer("O1");
    Observer o2 = new Observer("o2");

    SubjectImpl sub1 = new SubjectImpl();

    System.out.println("Registering "+o1);
    sub1.register(o1);
    System.out.println("Registering "+o2);
    sub1.register(o2);

    System.out.println("Setting Flag = 15 ");
    sub1.setFlag(5);
    System.out.println("Setting Flag = 23 ");
    sub1.setFlag(25);

    System.out.println(o1+" Unregistering");
    sub1.unregister(o1);

    //No notification this time to o1 .Since it is unregistered.
    System.out.println("Setting Flag = 50 ");
    sub1.setFlag(50);
  }
}

package com.github.hegdekar.observer.impl;

public class Observer {
  private String name;

  public Observer(String name){
    this.name = name;
  }
  public void update(){
    System.out.println("Observer "+name +" notified with change in flag value");
  }

  @Override
  public String toString() {
    return "Observer{" +
        "name='" + name + '\'' +
        '}';
  }
}

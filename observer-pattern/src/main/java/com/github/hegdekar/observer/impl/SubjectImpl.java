package com.github.hegdekar.observer.impl;

import com.github.hegdekar.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

  private List<Observer> observerList = new ArrayList<>();
  private int flag;

  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
    //flag value has been changed notify observers
    notifyObservers();
  }

  @Override
  public void register(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observerList.forEach(Observer::update);
  }
}

package com.github.hegdekar.observer;

import com.github.hegdekar.observer.impl.Observer;

public interface Subject {

  void register(Observer observer);

  void unregister(Observer observer);

  void notifyObservers();
}

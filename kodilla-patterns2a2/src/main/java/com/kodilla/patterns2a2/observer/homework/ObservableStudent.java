package com.kodilla.patterns2a2.observer.homework;

import com.kodilla.patterns2a2.observer.forum.Observer;

public interface ObservableStudent {
    void registerObserver (ObserverStudent observerStudent);
    void notifyObservers();
    void removeObserver (ObserverStudent observerStudent);
}

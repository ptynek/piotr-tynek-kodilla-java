package com.kodilla.patterns2.observer.homework;;

public interface Observable {

    void registerObserverx(Observer observer);
    void notifyObserversx();
    void removeObserverx(Observer observer);

}

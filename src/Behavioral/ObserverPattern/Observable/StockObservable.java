package Behavioral.ObserverPattern.Observable;

import Behavioral.ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver observer);
    void remove(NotificationObserver observer);
    void notifySubscribers();
    void setStockCount(int stockCount);
    int getStockCount();
    String getProductName(); // NEW method
}


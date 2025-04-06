package Behavioral.ObserverPattern.Observable;

import Behavioral.ObserverPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable {
    private List<NotificationObserver> observers = new ArrayList<>();
    private int stockCount = 0;
    private String productName;

    public IPhoneStockObservable(String productName) {
        this.productName = productName;
    }

    @Override
    public void add(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (this.stockCount == 0 && newStockCount > 0) {
            notifySubscribers();
        }
        this.stockCount = newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public String getProductName() {
        return productName;
    }
}
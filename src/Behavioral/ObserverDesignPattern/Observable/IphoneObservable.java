package Behavioral.ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    List<NotificationObserver> observers = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationObserver obj){
        observers.add(obj);
    }
    @Override
    public void remove(NotificationObserver obj){
        observers.remove(obj);
    }
    @Override
    public void notifySubscribers(){
        for(NotificationObserver obj : observers) {
            obj.update();
        }
    }
    @Override
    public void setStockCount(int newStockCount){
        if(stockCount==0){
            stockCount += newStockCount;
            notifySubscribers();
        }else {
            stockCount += newStockCount;
        }
    }
    @Override
    public int getStockCount(){
        return stockCount;
    }
}

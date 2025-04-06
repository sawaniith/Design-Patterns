package Behavioral.ObserverPattern.Observer;

import Behavioral.ObserverPattern.Observable.StockObservable;

public class MobileNotificObserver implements NotificationObserver{
    String phoneNumber;
    StockObservable observable;

    public MobileNotificObserver(StockObservable observable, String phoneNumber){
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void update(){
        sendSMS();
    }
    public void sendSMS(){
        System.out.println("send SMS to:" + phoneNumber);
        System.out.println("stock count to sms is:" + observable.getStockCount());
    }
}

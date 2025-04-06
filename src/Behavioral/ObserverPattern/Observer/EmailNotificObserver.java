package Behavioral.ObserverPattern.Observer;

import Behavioral.ObserverPattern.Observable.StockObservable;

public class EmailNotificObserver implements NotificationObserver{
    String emailId;
    StockObservable observable;

    public EmailNotificObserver(StockObservable observable, String emailId){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update(){
        sendEmail();
    }
    public void sendEmail(){
        System.out.println("send email to:" + emailId);
        System.out.println("stock count is:" + observable.getStockCount());
    }
}

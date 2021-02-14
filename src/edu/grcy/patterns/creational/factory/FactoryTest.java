package edu.grcy.patterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
       // fabryka jest po to aby nie robic wywolan jak ponizej
       // MacBook macBook = new MacBook()

       //jak mamy fabryke obiektow to robimy nastepujaco:

       MacBook macBookAir1 = MacBookFactory.getMacBook("Air", "64", "256", 13 );
       MacBook macBookPro1 = MacBookFactory.getMacBook("Pro", "512", "1TB", 16 );

       MacBook nonExisting = MacBookFactory.getMacBook("Air", "64", "256", 13 );

    }
}

package edu.grcy.patterns.creational.singleton;

public class SingletonUsage {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
       // EagerSingleton eagerSingleton2 = new EagerSingleton(); = konstruktor jest prywatny, nie da rady

        System.out.println(eagerSingleton.getOtherField());

        System.out.println(EagerSingleton.getInstance().getOtherField());

        EagerSingleton anotherSingleton = EagerSingleton.getInstance();
        System.out.println(anotherSingleton.getOtherField());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        /**
         * double lock singleton - laz ale z podowjnym sprawdzniem
         * nadaje sie do watkow Enim - obecnie czesniej spotykany typ singletona
         */
    }
}

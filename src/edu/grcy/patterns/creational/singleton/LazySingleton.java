package edu.grcy.patterns.creational.singleton;

//lazy czeli "inicjowanie przy pierwszym uzyciu"
public class LazySingleton {


	private static LazySingleton instance;

	private LazySingleton(){
		System.out.println("Lazy Singleton initialization");
	}

	public static LazySingleton getInstance(){
		//przy pierwszym wywolaniu getInstance() nastapi utworzenie obiektu przez konstruktor
		if (instance == null){
			/**
			 * lazy Singleton nie powinien byc uzywany w aplikacjach wielowatkowych bo
			 * kilka watkow moze utworzyc odrebne instacje obiektu
			 * klasy
			 */


			instance = new LazySingleton();
		}
		return instance;
	}



}

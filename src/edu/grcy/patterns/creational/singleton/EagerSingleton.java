package edu.grcy.patterns.creational.singleton;

//Eager oznaczna utworzenie "od razu"
public class EagerSingleton {

	//prywatne pole klast EagerSingleton - od razu inicjowane
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	private String  otherField;
	//prywatny konstruktor - czyli z zewnatrz nie utworzymy nowego obiektu **
	// * no chyba ze np. REFLEKCJA
	private EagerSingleton(){
		System.out.println("Eager singleton initialisation");
		otherField = "aaa";
	}

	//publiczna metoda wystawiajaca utworzeone wczesniej pole
	public static EagerSingleton getInstance(){
		System.out.println("Get instance");
		return INSTANCE;
	}

	public String getOtherField() {
		return otherField;
	}

	// ..... kolejne pola i metody
}

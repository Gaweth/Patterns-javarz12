package edu.grcy.solid.srp.fixed;

public class DriveingLicanceRules  {

    //zastepujemy "magic number' zmiennymi winalnymi
    private static final int DRIVING_LICANSE_REQUIRED_AGE = 18;

    /**
     *  metoda sprawdzająca kiedy można przyznać prawo jazdy
     *  łamie SRP klasy Person bo logika sprawdzania to drugi powód do zmiany
     *  klasy Person - pierwszym jest dodanie nowych pól
     */
    public boolean canGetDrivingLicense(Person person) {
        return person.getAge() >= DRIVING_LICANSE_REQUIRED_AGE;
    }

}

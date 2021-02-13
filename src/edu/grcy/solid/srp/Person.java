package edu.grcy.solid.srp;

public class Person {
    private String name;
    private String surname;
    private int age;

    private String snake_case_type_variable; // z podrekslnikiem, najczesciej w bazach danych
    private String camelCaseTypeVariable; //duze litery odznaczaja kolejne slowa - w jezykach obiektowych
    private String PascalCaseTypeVariable; //jak wyzej ale tez pierwszy wyraz od duzej litery - jezyk pascal
    private String kebabCaseTypeVariable;//kolejneslowa nabijane jak do rozen kebabowy - projekty frontendowe

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *  metoda sprawdzająca kiedy można przyznać prawo jazdy
     *  łamie SRP klasy Person bo logika sprawdzania to drugi powód do zmiany
     *  klasy Person - pierwszym jest dodanie nowych pól
     */
    public boolean canGetDrivingLicense() {
        return age >= 18;
    }

}

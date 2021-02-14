package edu.grcy.patterns.creational.prototype;

import java.util.List;

public class ShoppingsData {
    public static void main(String[] args) {

        ShoppingList original = new ShoppingList();

        try {
            ShoppingList shoppingListForMonday = (ShoppingList) original.clone();
            List<String> mondayList = shoppingListForMonday.getShopping();
            mondayList.remove("chleb");
            mondayList.add("sok pomidorowy");
            mondayList.add("mars x6");
            shoppingListForMonday.setShopping(mondayList);
            System.out.println("monday shopping list");
            shoppingListForMonday.getShopping().forEach(System.out::println);

            System.out.println("================");
            ShoppingList shoppingListFriday = (ShoppingList) original.clone();
            List<String> fridayList = shoppingListFriday.getShopping();
            fridayList.remove("pomidory");
            fridayList.add("ballentice");
            fridayList.add("cola x16");
            fridayList.add("baton");
            shoppingListFriday.setShopping(fridayList);
            System.out.println("friday shopping list");
            shoppingListFriday.getShopping().forEach(System.out::println);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

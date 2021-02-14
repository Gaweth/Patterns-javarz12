package edu.grcy.patterns.creational.builder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class HouseBuilderDemo {
    public static void main(String[] args) {

        House smallHouse = new House.HouseBuilder("blocks", "Solber", "blacha").build();

        House vilageHouse = new House.HouseBuilder("wylewany", "cegla", "papadachowka").withGarden("dzialka na warzywa").build();

        House residence = new House.HouseBuilder("wylewany + bloczki", "balle drewniane", "dachowka").withGarden("park z baseben").getGarage("wolnostojacy"). build();

        House mediumHouse = new House.HouseBuilder("jakis", "brak", "dziurawy").withGarden("dziura w ziemi").getGarage("stodola").build();

        List<House> houses = Arrays.asList(smallHouse, vilageHouse,residence,mediumHouse);
        houses.forEach(x -> System.out.println("\n" + x.getHouseInfo()));




    }

}

package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color){
        List<String> beers = new ArrayList<>();

        switch (color){
            case "light":
                beers.add("Aguila light");
                beers.add("Aguila zero");
                break;
            case "amber":
                beers.add("Club roja");
                beers.add("Tecate");
                break;
            case "brown":
                beers.add("Club trigo");
                beers.add("Poker");
                break;
            case "dark":
                beers.add("Club negra");
                beers.add("Leona");
                break;
        }
        return beers;
    }
}

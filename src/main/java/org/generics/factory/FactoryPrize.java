package org.generics.factory;

import org.generics.objects.great.BoardGame;
import org.generics.objects.great.Figure;
import org.generics.objects.great.VideoGame;
import org.generics.objects.legendary.Laptop;
import org.generics.objects.legendary.Vehicle;
import org.generics.prize.*;

import java.util.Locale;

public class FactoryPrize {

    public static String FIGURE_GOW = "GODOFWARFIGURE";
    public static String FIGURE_DB = "DRAGONBALLFIGURE";
    public static String FIGURE_GOKU = "GOKUFIGURE";
    public static String FIGURE_POKEMON = "POKEMONFIGURE";
    public static String FIGURE_PIKA = "PIKAFIGURE";
    public static String MONEY_100 = "100";
    public static String MONEY_500 = "500";
    public static String MONEY_1000 = "1000";
    public static String MONEY_2000 = "2000";
    public static String BOARDGAME_MONOPOLY= "MONOPOLY";
    public static String BOARDGAME_CARCASONE= "CARCASONE";
    public static String BOARDGAME_CATAN= "CATAN";
    public static String VIDEOGAME_GOW= "GODOFWAR";
    public static String VIDEOGAME_TBOI= "THEBINDINGOFISAAC";
    public static String VEHICLE_AUDI= "AUDI";
    public static String LAPTOP_MSI= "MSI";
    public static String GROUPSIMPLEPRIZES= "GROUPSIMPLEPRIZES";
    public static String GROUPFIGUREPRIZES= "GROUPSIMPLEPRIZES";


    private static FactoryPrize instance;

    private FactoryPrize(){

    }

    public static FactoryPrize getInstance(){
        if(instance==null)
            instance = new FactoryPrize();
        return instance;
    }

    public Prize createPrize(String code) throws Exception {

        if(code.equals(FIGURE_GOW)){
            return new GreatPrize<>(new Figure(FIGURE_GOW));
        } else if (code.equals(FIGURE_DB)) {
            return new GreatPrize<>(new Figure(FIGURE_DB));
        } else if (code.equals(FIGURE_GOKU)) {
            return new GreatPrize<>(new Figure(FIGURE_GOKU));
        }else if (code.equals(FIGURE_POKEMON)) {
            return new GreatPrize<>(new Figure(FIGURE_POKEMON));
        }else if (code.equals(FIGURE_PIKA)) {
            return new GreatPrize<>(new Figure(FIGURE_PIKA));
        }else if (code.equals(MONEY_100)) {
            return new SimplePrize(100.);
        }else if (code.equals(MONEY_500)) {
            return new SimplePrize(500.);
        }else if (code.equals(MONEY_1000)) {
            return new SimplePrize(1000.);
        }else if (code.equals(MONEY_2000)) {
            return new SimplePrize(2000.);
        }else if (code.equals(BOARDGAME_MONOPOLY)) {
            return new GreatPrize<>(new BoardGame(BOARDGAME_MONOPOLY));
        }else if (code.equals(BOARDGAME_CARCASONE)) {
            return new GreatPrize<>(new BoardGame(BOARDGAME_CARCASONE));
        }else if (code.equals(BOARDGAME_CATAN)) {
            return new GreatPrize<>(new BoardGame(BOARDGAME_CATAN));
        }else if (code.equals(VIDEOGAME_GOW)) {
            return new GreatPrize<>(new VideoGame(VIDEOGAME_GOW));
        }else if (code.equals(VIDEOGAME_TBOI)) {
            return new GreatPrize<>(new VideoGame(VIDEOGAME_TBOI));
        } else if (code.equals(LAPTOP_MSI)) {
            return new LegendaryPrize<>(new Laptop(LAPTOP_MSI));
        }else if (code.equals(VEHICLE_AUDI)) {
            return new LegendaryPrize<>(new Vehicle(VEHICLE_AUDI));
        }else if (code.equals(GROUPSIMPLEPRIZES)){
            return new Composite<>(createPrize(MONEY_100),createPrize(FIGURE_DB) );
        } else if (code.equals(GROUPFIGUREPRIZES)){
            return new Composite<>(createPrize(FIGURE_GOW),createPrize(FIGURE_DB) );
        }else{
            throw new Exception("code not found");
        }

    }



}

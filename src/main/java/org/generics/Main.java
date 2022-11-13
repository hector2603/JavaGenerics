package org.generics;

import org.generics.factory.FactoryPrize;
import org.generics.objects.great.Figure;
import org.generics.objects.legendary.Vehicle;
import org.generics.prize.GreatPrize;
import org.generics.prize.Prize;
import org.generics.prize.SimplePrize;
import org.generics.roulette.Roulette;

public class Main {
    public static String FIGURE_GOW = "GODOFWARFIGURE";
    public static String FIGURE_DB = "DRAGONBALLFIGURE";
    public static String FIGURE_GOKU = "GOKUFIGURE";
    public static String FIGURE_POKEMON = "POKEMONFIGURE";
    public static String FIGURE_PIKA = "PIKAFIGURE";
    public static String MONEY_100 = "100";
    public static String MONEY_500 = "500";
    public static String MONEY_1000 = "1000";
    public static String MONEY_2000 = "2000";

    public static String VEHICLE_AUDI= "AUDI";
    public static String LAPTOP_MSI= "MSI";


    public static void main(String[] args) throws Exception {
        FactoryPrize factory = FactoryPrize.getInstance();


        //Roulette<GreatPrize<Figure>> simpleRoulette = new Roulette<>();
        Roulette<SimplePrize> simpleRoulette = new Roulette<>();
        simpleRoulette(simpleRoulette);

        //----------------------------

        Roulette<GreatPrize<Figure>> greatRouletteFigure = new Roulette<>();
        //greatRouletteFigure.addPrize((GreatPrize<Vehicle>) factory.createPrize(VEHICLE_AUDI));
        greatRoulette(greatRouletteFigure);

        //----------------------------

        Roulette<GreatPrize<?>> greatRoulette = new Roulette<>();
        greatRoulette(greatRoulette);

        //----------------------------

        Roulette<?> totalRoulette = new Roulette<>();
        totalRoulette(totalRoulette);

    }

    public  static <T extends SimplePrize> void simpleRoulette(Roulette<T> simpleRoulette) throws Exception {
        FactoryPrize factory = FactoryPrize.getInstance();
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_100));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_500));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_1000));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_500));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_100));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_500));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_1000));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_100));
        simpleRoulette.addPrize((T) factory.createPrize(MONEY_2000));

        SimplePrize prize = simpleRoulette.spin();

        System.out.println(prize.getPrizeText());
    }

    public  static <T extends GreatPrize> void greatRoulette(Roulette<T> greatRoulette) throws Exception {
        FactoryPrize factory = FactoryPrize.getInstance();
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_GOW));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_DB));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_GOKU));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_POKEMON));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_PIKA));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_GOW));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_DB));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_GOKU));
        greatRoulette.addPrize((T) factory.createPrize(FIGURE_PIKA));

        GreatPrize prize = greatRoulette.spin();

        System.out.println(prize.getPrizeText());
    }

    public  static  void totalRoulette(Roulette totalRoulette) throws Exception {
        FactoryPrize factory = FactoryPrize.getInstance();
        totalRoulette.addPrize( factory.createPrize(FIGURE_GOW));
        totalRoulette.addPrize( factory.createPrize(FIGURE_DB));
        totalRoulette.addPrize( factory.createPrize(FIGURE_GOKU));
        totalRoulette.addPrize( factory.createPrize(FIGURE_POKEMON));
        totalRoulette.addPrize( factory.createPrize(FIGURE_PIKA));
        totalRoulette.addPrize( factory.createPrize(FIGURE_GOW));
        totalRoulette.addPrize( factory.createPrize(FIGURE_DB));
        totalRoulette.addPrize( factory.createPrize(FIGURE_GOKU));
        totalRoulette.addPrize( factory.createPrize(FIGURE_PIKA));
        totalRoulette.addPrize( factory.createPrize(MONEY_100));
        totalRoulette.addPrize( factory.createPrize(LAPTOP_MSI));
        totalRoulette.addPrize( factory.createPrize(MONEY_1000));
        totalRoulette.addPrize( factory.createPrize(MONEY_500));
        totalRoulette.addPrize( factory.createPrize(MONEY_100));
        totalRoulette.addPrize( factory.createPrize(MONEY_500));
        totalRoulette.addPrize( factory.createPrize(MONEY_1000));
        totalRoulette.addPrize( factory.createPrize(MONEY_100));
        totalRoulette.addPrize( factory.createPrize(MONEY_2000));
        totalRoulette.addPrize( factory.createPrize(VEHICLE_AUDI));
        totalRoulette.addPrize( factory.createPrize(MONEY_2000));

        Prize prize = totalRoulette.spin();

        System.out.println(prize.getPrizeText());
    }
}
package org.generics.prize;


import org.generics.objects.great.GreatPrizeObject;

public class GreatPrize<E extends GreatPrizeObject> implements Prize {

    protected E greatPrize;

    public GreatPrize(E greatPrize) {
        this.greatPrize = greatPrize;
    }

    @Override
    public String getPrizeText() {
        return "GreatPrize{" +
                "greatPrize=" + greatPrize +
                "}\n";
    }

    @Override
    public String toString() {
        return "GreatPrize{" +
                "greatPrize=" + greatPrize +
                "}\n";
    }

    public E getGreatPrize() {
        return greatPrize;
    }

    public void setGreatPrize(E greatPrize) {
        this.greatPrize = greatPrize;
    }
}

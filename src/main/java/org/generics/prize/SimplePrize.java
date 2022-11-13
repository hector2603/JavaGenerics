package org.generics.prize;

public class SimplePrize implements Prize<SimplePrize> {

    protected Double money;

    public SimplePrize(Double money) {
        this.money = money;
    }

    @Override
    public String getPrizeText() {
        return "SimplePrize{" +
                "money=" + money +
                "}\n";
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SimplePrize{" +
                "money=" + money +
                "}\n";
    }
}

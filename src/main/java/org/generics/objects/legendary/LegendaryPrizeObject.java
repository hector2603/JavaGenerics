package org.generics.objects.legendary;

public class LegendaryPrizeObject {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LegendaryPrizeObject{" +
                "name='" + name + '\'' +
                '}';
    }
}

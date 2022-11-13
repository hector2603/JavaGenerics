package org.generics.prize;

import org.generics.objects.legendary.LegendaryPrizeObject;

public class LegendaryPrize<G extends LegendaryPrizeObject> implements Prize<G> {

    protected G legendaryPrize;

    public LegendaryPrize( G legendaryPrize) {
        this.legendaryPrize = legendaryPrize;
    }

    @Override
    public String toString() {
        return "LegendaryPrize{" +
                "legendaryPrize=" + legendaryPrize +
                "}\n";
    }

    @Override
    public String getPrizeText() {
        return "LegendaryPrize{" +
                "legendaryPrize=" + legendaryPrize +
                "}\n";
    }

    public G getLegendaryPrize() {
        return legendaryPrize;
    }

    public void setLegendaryPrize(G legendaryPrize) {
        this.legendaryPrize = legendaryPrize;
    }
}

package org.generics.prize;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Composite<T extends Prize<T>> implements Prize<T> {

    List<T> Prizes;

    public Composite(T... prizes) {
        Prizes = List.of(prizes);
    }


    @Override
    public String getPrizeText() {
        return Prizes.stream()
                .map(Prize::getPrizeText)
                .collect(Collectors.joining());
    }

    public List<T> getPrizes() {
        return Prizes;
    }

    public void setPrizes(List<T> prizes) {
        Prizes = prizes;
    }
}

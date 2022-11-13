package org.generics.roulette;

import org.generics.prize.Prize;
import org.generics.collections.CyclicLinkedList;

public class Roulette<R extends Prize> {
    CyclicLinkedList<R> roulette;
    public Roulette(){
        roulette = new CyclicLinkedList<>();
    }

    public void addPrize(R prize){
        roulette.add(prize);
    }

    public R spin(){
        int positions = (int) (Math.random() * 100);
        return roulette.get(positions);
    }
}

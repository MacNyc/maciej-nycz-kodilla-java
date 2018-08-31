package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang. *;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminateList (ArrayList<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<>();
        for(int n : numbers) {
            if (n % 2 == 0) {
                even.add(n);
            }
        }
        return even;
    }
}

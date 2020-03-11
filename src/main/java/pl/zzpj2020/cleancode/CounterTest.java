package pl.zzpj2020.cleancode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @org.junit.jupiter.api.Test
    void countOccurencesNumber() {
    }

    @org.junit.jupiter.api.Test
    void p() {
    }

    @org.junit.jupiter.api.Test
    void updateMap() {
        Counter cnt = new Counter();
        cnt.updateOccurencesMap(1);
        cnt.updateOccurencesMap(1);
    }

    @org.junit.jupiter.api.Test
    void isCorrect() {
        Counter cnt = new Counter();
        List<Integer> numbers = Arrays.asList(2, 2, 4, 4, 4, 4, 5, 5);
        cnt.countOccurences(numbers);
        System.out.print(cnt.getWeightedAverage());
    }

    @org.junit.jupiter.api.Test
    void getMinInt() {
    }

    @org.junit.jupiter.api.Test
    void getMaxInt() {
    }

    @org.junit.jupiter.api.Test
    void getFizzBuzzNumber() {
    }
}
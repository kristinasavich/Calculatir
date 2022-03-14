package ru.ks.springcalculator;

public class SubtractProcessor implements Processor{
    @Override
    public int process(int i, int b){
        return i - b;
    }
}

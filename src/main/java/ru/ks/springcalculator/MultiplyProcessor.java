package ru.ks.springcalculator;

public class MultiplyProcessor implements Processor{
    @Override
    public int process(int i, int b){
        return i * b;
    }
}

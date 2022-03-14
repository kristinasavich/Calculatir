package ru.ks.springcalculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculator {
    ApplicationContext context = null;


    public int sum(int a, int b){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SumProcessor sumProcessor = context.getBean("sum", SumProcessor.class);
        return sumProcessor.process(a, b);
    }

    public int subtract(int a, int b){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SubtractProcessor subtractProcessor = context.getBean("subtract", SubtractProcessor.class);
        return subtractProcessor.process(a, b);
        }

    public int multiply (int a, int b){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MultiplyProcessor multiplyProcessor = context.getBean("multiply", MultiplyProcessor.class);
        return multiplyProcessor.process(a, b);
    }

    public int divide(int a, int b){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DivideProcessor divideProcessor = context.getBean("divide", DivideProcessor.class);
        return divideProcessor.process(a, b);
    }

}

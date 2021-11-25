package ru.emil.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        Computer computer2 = context.getBean("computer", Computer.class);
        System.out.println(computer2);
        context.close();
    }
}

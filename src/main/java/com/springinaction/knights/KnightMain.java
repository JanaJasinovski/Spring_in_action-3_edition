package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws QuestException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:knights.xml");

        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}

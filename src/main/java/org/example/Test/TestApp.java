package org.example.Test;

import org.example.Component.Voter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestApp {
    public static void main(String args[])
    {
      System.out.println("******Container Started******\n");
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Bean id information ::"+ Arrays.toString(context.getBeanDefinitionNames()));

        Voter voter=context.getBean(Voter.class);
        System.out.println(voter);
        System.out.println(voter.checkVotingEligibility());
        ((AbstractApplicationContext)context).close();
        System.out.println("\n***Container Stopped***");
    }
}

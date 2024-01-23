package org.example.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;
@Component(value = "voter")
@PropertySource("application.properties")
public class Voter {
    @Value("${voter.info.name}")
    private String Name;
    @Value("${voter.info.age}")
    private float age;
    private Date dov;
    static{
        System.out.println("voter.class file is loading..");
    }
    public Voter()
    {
        System.out.println("Voter object is instantiated..");
        System.out.println(this);
    }
  @PostConstruct
public void myinit()
{
    System.out.println("voter.myinit()");
    dov=new Date();
    boolean flag=false;
    if(Name==null)
    {
        System.out.println("Name must not be null..");
        flag=true;
    }
    if(age<0)
    {
        age=age*(-1);
    }
    if(age>100)
    {
        System.out.println("age must not be greater than 100..");
        flag=true;
    }
    if(flag)
    {
        throw new IllegalArgumentException("Invalid Inputs...");
    }
}
public String checkVotingEligibility()
{
    System.out.println("Voter.checkVotingEligibility()");
    if(age>=18)
        return "Mr/Miss/Mrs: " + Name + " u r eligibile for voting: " + age + " ---> on " + dov;
		else
        return "Mr/Miss/Mrs: " + Name + " u r not eligibile for voting: " + age + "---> on " + dov;
}
@PreDestroy
public void myDestroy()
{
 System.out.println("voter.destroy()");
 Name=null;
 age=0;
 dov=null;
}

    @Override
    public String toString() {
        return "Voter{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", dov=" + dov +
                '}';
    }
}

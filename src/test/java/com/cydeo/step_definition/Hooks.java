package com.cydeo.step_definition;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
//in the class we will be able to pass pre conditions and post to each scenario and each step

    //import from i.o cucumber java not junit
    @Before(order = 1)
    public void setupScenario(){
        System.out.println("==== setting up browser using cucumber @Before");
    }
    @Before(value = "@Login", order = 2)
    public void setUpScenarioForLogins(){
        System.out.println("======this will only apply to scenarios with @Login tag");

    }
    @Before(value = "@db",order = 0)
    public void setupForDataBaseScenarios(){
        System.out.println("====== this will only apply to scenarios with DB tag");
    }
    @After
    public void tearDownScenario(){
        System.out.println("==== closing browser using cucumber after");
        System.out.println("=== Scenario ended/ Take screenshot if failed");
    }

    @BeforeStep
    public void setupstep(){
        System.out.println("------applying setup using @BeforeStep");
    }
    @AfterStep
    public void afterstep(){
        System.out.println("------> applying tearDown using @AfterStep");
    }

}

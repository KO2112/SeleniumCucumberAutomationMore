package com.cydeo.step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }
    @When("user enters student name")
    public void user_enters_student_name() {
        System.out.println("user enters student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }
    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }
    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
    @Given("user is on the library login page")
    public void userisonthelibraryloginpage(){
        System.out.println("user is on the library login page");
    }

}

package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends GWD {

    @Before
    public  void before(){
        System.out.println("Test Basladi...");

    }

    @After
    public  void after(){
        quitDriver();
        System.out.println("Test Bitti.");
    }






}

package runnerfile;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//This is used when we have to run specific files.

@CucumberOptions(features={"C:\\Users\\Abhishek Bohra\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\Bddsample\\src\\test\\resources\\form\\simpleform.feature"},glue= {"steps"})


public class Runnerfile {
	


}

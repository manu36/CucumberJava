package StepDefinitions;

import Servicios.req_Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testServicio {

	public static String xml = "";
	public static req_Test rest = new req_Test();
	
	@Given("^Se ejecuta servicio$")
	public void se_ejecuta_servicio() throws Throwable {
		
		
		System.out.println("Se ejecuta servicio: ");
		xml = rest.resApiService("GET", "", "https://reqres.in/api/users");
    
	    
	}

	@Then("^response de servicio$")
	public void response_de_servicio() throws Throwable {
	
		System.out.println("RESPONSE SERVICIO: ");
		System.out.println(xml);
	
	}
	
	
}

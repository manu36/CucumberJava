package StepDefinitions;

import java.io.IOException;

import Servicios.req_Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testServicioRandom01 {

	public static String xml = "";
	public static req_Test rest = new req_Test();
	
	@Given("Se ejecuta servicio random")
	public void se_ejecuta_servicio_pokemon() throws IOException {
		
		System.out.println("Se ejecuta servicio Pokemon: ");
		xml = rest.resApiService("GET", "", "https://randomuser.me/api/");
	  
	}

	@Then("response de servicio random")
	public void response_de_servicio_pokemon() {
		
		if (xml == "OK") {
			System.out.println("RESPONSE SERVICIO POKEMON: OK!");
		}else {
			System.out.println(xml);
		}
		
	}
}

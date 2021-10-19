package StepDefinitions;

import java.io.IOException;

import Servicios.req_Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testServicioPokemon {

	
	public static String xml = "";
	public static req_Test rest = new req_Test();
	
	@Given("Se ejecuta servicio pokemon")
	public void se_ejecuta_servicio_pokemon() throws IOException {
		
		System.out.println("Se ejecuta servicio Pokemon: ");
		xml = rest.resApiService("GET", "", "https://pokeapi.co/api/v2/pokemon/pikachu");
	  
	}

	@Then("response de servicio pokemon")
	public void response_de_servicio_pokemon() {
		
		if (xml == "OK") {
			System.out.println("RESPONSE SERVICIO POKEMON: OK!");
		}else {
			System.out.println(xml);
		}
		
	}
	
	
}

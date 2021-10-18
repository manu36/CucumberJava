package Servicios;

import java.io.IOException;

import Util.FunctionGeneric;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class req_Test {

	
	public String resApiService(String tipo, String valor, String url) throws IOException {
		
	String xml = "";
	String msg = "";
	
	try {
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url(url)
				  .method(tipo, null)
				  .addHeader("Content-Type", "application/x-www-form-urlencoded")
				  .build();
				Response response = client.newCall(request).execute();
				xml = response.body().string();
				
				if (response.isSuccessful()) {
					FunctionGeneric.imrpimirConsola("isSuccessful funciona y es igual a true");
				}
				if (response.message().equals("OK")) {
					FunctionGeneric.imrpimirConsola("Message funciona y es OK");
				}
				FunctionGeneric.imrpimirConsola("isSuccessful: " + response.isSuccessful());
				FunctionGeneric.imrpimirConsola("Message: " + response.message());
				FunctionGeneric.imrpimirConsola("NetworkResponse: " + response.networkResponse());
				FunctionGeneric.imrpimirConsola("Request body: " + response.request());
				FunctionGeneric.imrpimirConsola("Response body: " + xml);
				msg = "OK";
	} catch (Exception e) {
		msg = e.getMessage();
	}

			
			return msg;				

	}
	
	
	
}

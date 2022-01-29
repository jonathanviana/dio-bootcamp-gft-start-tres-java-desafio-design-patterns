package br.com.designpatterns.gof.facade;

import sub.crm.CrmService;
import sub.cep.CepApi;

public class Facade {

	public void migrateClient(String name, String cep) {
		String city = CepApi.getInstance().recoverCity(cep);
		String state = CepApi.getInstance().recoverState(cep);
		
		CrmService.saveClient(name, cep, city, state);
	}
}

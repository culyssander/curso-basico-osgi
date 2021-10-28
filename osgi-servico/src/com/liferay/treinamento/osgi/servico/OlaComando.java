package com.liferay.treinamento.osgi.servico;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = {
		"osgi.command.function=ola",
		"osgi.command.function=dizertempo",
		"osgi.command.scope=treinamento"
	},
	service = OlaComando.class
)
public class OlaComando {
	
	public void ola(String nome) {
		System.out.println(_olaServico.ola(nome));
	}
	
	public void dizertempo() {
		System.out.println(_olaServico.relegio());
	}
	
	@Reference
	private OlaServico _olaServico;

}

package com.liferay.treinamento.osgi.servico;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

@Component(
	service = OlaServico.class
)
public class OlaServicoImpl implements OlaServico {

	@Override
	public String ola(String nome) {
		return String.format("Ola %s", nome);
	}
	
	@Override
	public String relegio() {
		// TODO Auto-generated method stub
		return new Date().toString();
	}
}

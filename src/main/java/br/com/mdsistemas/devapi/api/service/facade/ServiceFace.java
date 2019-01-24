package br.com.mdsistemas.devapi.api.service.facade;

import java.util.List;

import br.com.mdsistemas.devapi.api.dto.PlanetaDto;

public interface ServiceFace {
	
	public List<PlanetaDto> listarPlanetaDto() throws Exception;
	

}

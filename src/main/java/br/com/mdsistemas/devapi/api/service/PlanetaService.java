package br.com.mdsistemas.devapi.api.service;

import java.util.List;

import br.com.mdsistemas.devapi.api.dto.PlanetaDto;

public interface PlanetaService {
	
	public List<PlanetaDto> listarPlanetaDto() throws Exception;
	
	
}

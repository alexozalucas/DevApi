package br.com.mdsistemas.devapi.api.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mdsistemas.devapi.api.dto.PlanetaDto;
import br.com.mdsistemas.devapi.api.service.PlanetaService;

@RestController
@RequestMapping("/planeta")
public class PlanetaController {
	
	
	@Autowired
	private PlanetaService planetaService;
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/listar", 
			 produces = { "application/json" }, 
			 method = RequestMethod.GET
	)
	
		
	//Lista todos os planetas
	public ResponseEntity<?> listarTodos() {
		
		List<PlanetaDto> planeta = new ArrayList<PlanetaDto>();
		try {
			planeta = planetaService.listarPlanetaDto();
			return new ResponseEntity(planeta, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity(planeta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	

}






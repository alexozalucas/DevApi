package br.com.mdsistemas.devapi.api.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mdsistemas.devapi.api.dto.PlanetaDto;
import br.com.mdsistemas.devapi.api.entity.PlanetaEntity;
import br.com.mdsistemas.devapi.api.repository.PlanetaRepository;
import br.com.mdsistemas.devapi.api.service.PlanetaService;



@Service
public class PlanetaServiceImpl implements PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;
		
	
	@Override
	public List<PlanetaDto> listarPlanetaDto() throws Exception {
		
		List<PlanetaDto> planetas = new ArrayList<PlanetaDto>();
		
		Iterable <PlanetaEntity> iterable = planetaRepository.findAll();
			
		iterable.forEach(planetaEntity->{
			PlanetaDto planetaDto = new PlanetaDto();
			planetaDto.setId_Planeta(planetaEntity.getId_Planeta());
			planetaDto.setNome(planetaEntity.getNome());
			planetaDto.setDiametro(planetaEntity.getDiametro());
			planetaDto.setColonizado(planetaEntity.getColonizado());
			planetaDto.setMassa(planetaEntity.getMassa());
			planetaDto.setDataDescobrimento(planetaEntity.getDataDescobrimento());
			
			planetas.add(planetaDto);
		});
		return planetas;
		
	}
	
	/*List<PlanetaEntity> planeta = new ArrayList<PlanetaEntity>();
	iterable.iterator().forEachRemaining(planeta::add);
	
	return planetas;*/
	
		

}

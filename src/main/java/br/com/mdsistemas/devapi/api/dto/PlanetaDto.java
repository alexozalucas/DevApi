package br.com.mdsistemas.devapi.api.dto;

import java.sql.Date;

public class PlanetaDto {
	
	private int id_Planeta;
	private String nome;
	private Integer massa;
	private Integer diametro;
	private Boolean colonizado;
	private Date dataDescobrimento;
	private AtmosferaDto atmosferaDto;
	private ClasseDto classeDto;
	private QuadranteDto quadrantedto;
	
	
	

	
	
	
	public int getId_Planeta() {
		return id_Planeta;
	}
	public void setId_Planeta(int id_Planeta) {
		this.id_Planeta = id_Planeta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMassa() {
		return massa;
	}
	public void setMassa(Integer massa) {
		this.massa = massa;
	}
	public Integer getDiametro() {
		return diametro;
	}
	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}
	public Boolean getColonizado() {
		return colonizado;
	}
	public void setColonizado(Boolean colonizado) {
		this.colonizado = colonizado;
	}
	public Date getDataDescobrimento() {
		return dataDescobrimento;
	}
	public void setDataDescobrimento(Date dataDescobrimento) {
		this.dataDescobrimento = dataDescobrimento;
	}
	
	public AtmosferaDto getAtmosferaDto() {
		return atmosferaDto;
	}
	public void setAtmosferaDto(AtmosferaDto atmosferaDto) {
		this.atmosferaDto = atmosferaDto;
	}
	public ClasseDto getClasseDto() {
		return classeDto;
	}
	public void setClasseDto(ClasseDto classeDto) {
		this.classeDto = classeDto;
	}
	public QuadranteDto getQuadrantedto() {
		return quadrantedto;
	}
	public void setQuadrantedto(QuadranteDto quadrantedto) {
		this.quadrantedto = quadrantedto;
	}
	
	

}

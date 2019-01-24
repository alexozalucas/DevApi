package br.com.mdsistemas.devapi.api.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="atmosfera")
public class AtmosferaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_atmosfera")
	private int id_atmosfera;
	
	@Column(name = "tipoAtmosfera")
	private String tipoAtmosfera;
	
	@OneToMany(mappedBy="atmosferaEntity", fetch=FetchType.LAZY)// 
	private List<PlanetaEntity> planetas;
	
	
	
	public int getId_atmosfera() {
		return id_atmosfera;
	}
	public void setId_atmosfera(int id_atmosfera) {
		this.id_atmosfera = id_atmosfera;
	}
	public String getTipoAtmosfera() {
		return tipoAtmosfera;
	}
	public void setTipoAtmosfera(String tipoAtmosfera) {
		this.tipoAtmosfera = tipoAtmosfera;
	}
	public List<PlanetaEntity> getPlanetas() {
		return planetas;
	}
	public void setPlanetas(List<PlanetaEntity> planetas) {
		this.planetas = planetas;
	}

	
}

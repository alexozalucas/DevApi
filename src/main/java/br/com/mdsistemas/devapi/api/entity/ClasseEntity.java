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
@Table(name="classe")
public class ClasseEntity {
	
	@Id	
	@Column(name = "id_classe")	
	private char id_classe;
	
	
	@OneToMany(mappedBy="classeEntity", fetch=FetchType.LAZY)// Não traz a lista de computadores
	private List<PlanetaEntity> planetas;
	
	
	@Column(name = "tipoClasse")
	private String tipoClasse;

	public int getId_classe() {
		return id_classe;
	}

	public void setId_classe(char id_classe) {
		this.id_classe = id_classe;
	}

	public String getTipoClasse() {
		return tipoClasse;
	}

	public void setTipoClasse(String tipoClasse) {
		this.tipoClasse = tipoClasse;
	}

	public List<PlanetaEntity> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(List<PlanetaEntity> planetas) {
		this.planetas = planetas;
	}
	
	

}

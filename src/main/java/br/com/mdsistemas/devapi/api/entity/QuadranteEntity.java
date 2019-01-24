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
@Table(name="quadrante")
public class QuadranteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_quadrante")
	private int id_quadrante;
	
	@Column(name = "tipoQuadrante")
	private String tipoQuadrante;
	

	@OneToMany(mappedBy="quadrante", fetch=FetchType.LAZY)// 
	private List<PlanetaEntity> planetas;
	
	

	public int getId_quadrante() {
		return id_quadrante;
	}

	public void setId_quadrante(int id_quadrante) {
		this.id_quadrante = id_quadrante;
	}

	public String getTipoQuadrante() {
		return tipoQuadrante;
	}

	public void setTipoQuadrante(String tipoQuadrante) {
		this.tipoQuadrante = tipoQuadrante;
	}

	public List<PlanetaEntity> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(List<PlanetaEntity> planetas) {
		this.planetas = planetas;
	}
	
	
	
	
	
	
	
	
	
	

}

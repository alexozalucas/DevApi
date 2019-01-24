package br.com.mdsistemas.devapi.api.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
@Table(name="planeta")
public class PlanetaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_planeta")
	private int id_Planeta;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="massa")
	private Integer massa;
	
	@Column(name="diametro")
	private Integer diametro;
	
	@Column(name="colonizado")
	private Boolean colonizado;

	@Column(name="dataDescobrimento")
	private Date dataDescobrimento;
	
	
	@ManyToOne(fetch=FetchType.LAZY)// 	
	@JoinColumn(name="id_atmosfera")
	private AtmosferaEntity atmosferaEntity;
	
	@ManyToOne(fetch=FetchType.LAZY)// 	
	@JoinColumn(name="id_classe")
	private ClasseEntity classeEntity;
	
	@ManyToOne(fetch=FetchType.LAZY)// 	
	@JoinColumn(name="id_quadrante")
	private QuadranteEntity quadrante;

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

	public AtmosferaEntity getAtmosferaEntity() {
		return atmosferaEntity;
	}

	public void setAtmosferaEntity(AtmosferaEntity atmosferaEntity) {
		this.atmosferaEntity = atmosferaEntity;
	}

	public ClasseEntity getClasseEntity() {
		return classeEntity;
	}

	public void setClasseEntity(ClasseEntity classeEntity) {
		this.classeEntity = classeEntity;
	}

	public QuadranteEntity getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(QuadranteEntity quadranteEntity) {
		this.quadrante= quadranteEntity;
	}


	

	
	
	
	
	

}

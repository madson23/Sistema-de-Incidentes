package Entidades;


import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Formulario  {

	@Id
	@GeneratedValue
	private Integer id;	
	@Column
	private String nomeVit;
	@Column
	private String sexoVit;
	@Column
	private Integer idadeVit;
	@Column
	private String serieVit;
	@Column
	private String turnoVit;
	@Column
	private String enderecoVit;
	@Column
	private String emailVit;
	@Column
	private String nome;
	@Column
	private String sexo;
	@Column
	private Integer idade;
	@Column
	private String grauParentesco;
	@Column
	private String profissao;
	@Column
	private String racaCor;
	@Column
	private String genero;
	@Column
	private String orientacaoSexual;
	@Column
	private String formacao;
	@Column
	private String incidente;
	@Column
	private String tipoInfracao;
	@Column
	private String providencia;
	@Column
	@Temporal (value = TemporalType.TIMESTAMP)
	private Date dataRegistro;
	
	
	
	//get set Agressor
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRacaCor() {
		return racaCor;
	}
	public void setRacaCor(String racaCor) {
		this.racaCor = racaCor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getOrientacaoSexual() {
		return orientacaoSexual;
	}
	public void setOrientacaoSexual(String orientacaoSexual) {
		this.orientacaoSexual = orientacaoSexual;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	
	//get set da Vitima
	
	public String getNomeVit() {
		return nomeVit;
	}
	public void setNomeVit(String nomeVit) {
		this.nomeVit = nomeVit;
	}
	public String getSexoVit() {
		return sexoVit;
	}
	public void setSexoVit(String sexoVit) {
		this.sexoVit = sexoVit;
	}
	public Integer getIdadeVit() {
		return idadeVit;
	}
	public void setIdadeVit(Integer idadeVit) {
		this.idadeVit = idadeVit;
	}
	public String getSerieVit() {
		return serieVit;
	}
	public void setSerieVit(String serieVit) {
		this.serieVit = serieVit;
	}
	public String getTurnoVit() {
		return turnoVit;
	}
	public void setTurnoVit(String turnoVit) {
		this.turnoVit = turnoVit;
	}
	public String getEnderecoVit() {
		return enderecoVit;
	}
	public void setEnderecoVit(String enderecoVit) {
		this.enderecoVit = enderecoVit;
	}
	public String getEmailVit() {
		return emailVit;
	}
	public void setEmailVit(String emailVit) {
		this.emailVit = emailVit;
	}
	
	//get set de Açao

	public String getIncidente() {
		return incidente;
	}
	public void setIncidente(String incidente) {
		this.incidente = incidente;
	}
	public String getTipoInfracao() {
		return tipoInfracao;
	}
	public void setTipoInfracao(String tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}
	public String getProvidencia() {
		return providencia;
	}
	public void setProvidencia(String providencia) {
		this.providencia = providencia;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}


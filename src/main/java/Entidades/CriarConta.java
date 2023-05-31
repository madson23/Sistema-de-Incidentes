package Entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CriarConta {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String nome;
	@Column
	private String login;
	@Column
	private String senha;
	@Column
	@Temporal(value = TemporalType.DATE)
	private Date dataDecadastro;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataDecadastro() {
		return dataDecadastro;
	}
	public void setDataDecadastro(Date dataDecadastro) {
		this.dataDecadastro = dataDecadastro;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}

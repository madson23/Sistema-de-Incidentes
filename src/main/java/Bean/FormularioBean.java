package Bean;

import static Util.MensagemUtil.erro;
import static Util.MensagemUtil.sucesso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;


import DAO.Formulario_DAO;

import Entidades.Formulario;


@ManagedBean (name = "formularioBean")
@ViewScoped
public class FormularioBean {
	
	private Formulario formulario = new Formulario();
	private List<Formulario> formularios = new ArrayList<>();
	
	public String salvar() {
		try {
			
			Date dataRegistro = new Date();
			formulario.setDataRegistro(dataRegistro);
			
			Formulario_DAO.salvar(formulario);
			sucesso("Sucesso", "Conta cadastrada com sucesso");
			formulario = new Formulario();
		} catch (Exception e) {
			erro("Erro", "Erro ao cadastrar a Conta");
		}
		return null;
	}
	

	public String excluir() throws Exception {
		try {
			Formulario_DAO.excluir(formulario);
			sucesso("Sucesso!", "Formulario removido.");
			formularios = Formulario_DAO.listarTodos();
			return null;
		} catch (Exception e) {
			throw new Exception("Id do Email:" + formulario.getId());
		}
	}

	
	public void listar() {
		setFormularios(new ArrayList<Formulario>(Formulario_DAO.listarTodos()));
	}
	
	public List<Formulario> getFormularios() {
		if (formularios == null) {
			setFormularios(Formulario_DAO.listarTodos());
		}
		return formularios;

	}
	
	 public Formulario getFormulario() {
			return formulario;
		}

		public void setFormulario(Formulario formulario) {
			this.formulario = formulario;
		}

		public void setFormularios(List<Formulario> formularios) {
			this.formularios = formularios;
		}

}

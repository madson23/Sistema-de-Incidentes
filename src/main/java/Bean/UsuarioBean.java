package Bean;

import static Util.MensagemUtil.erro;
import static Util.MensagemUtil.sucesso;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import DAO.Formulario_DAO;
import DAO.UsuarioDAO;
import Entidades.CriarConta;

import Entidades.Formulario;

@ManagedBean(name = "usuarioBean")
@ViewScoped
public class UsuarioBean {
	
	private EntityManager em;
	private CriarConta conta = new CriarConta();
	private List<CriarConta> contas = new ArrayList<>();

	
	public String salvar() {
		try {
			UsuarioDAO.salvarr(conta);
			sucesso("Sucesso", "Conta cadastrada com sucesso");
			conta = new CriarConta();
		} catch (Exception e) {
			erro("Erro", "Erro ao cadastrar a Conta");
		}
		return null;
	}


	public String excluir() throws Exception {
		try {
			UsuarioDAO.excluir(conta);
			sucesso("Sucesso!", "Conta removida.");
			contas = UsuarioDAO.listarTodos();
			return null;
		} catch (Exception e) {
			throw new Exception("Id do Email:" + conta.getId());
		}
	}

	
	public void listar() {
		setContas(new ArrayList<CriarConta>(UsuarioDAO.listarTodos()));
	}
	
	public List<CriarConta> getContas() {
		if (contas == null) {
			contas = UsuarioDAO.listarTodos();
		}
		return contas;

	}
	
	 public CriarConta getCriarConta() {
			return conta;
		}

		public void setCriarConta(CriarConta conta) {
			this.conta = conta;
		}

		public void setContas(List<CriarConta> contas) {
			this.contas = contas;
		}



	
	/*public String logar() {
		Usuario usuario = null;
		String consulta;
		try {
			consulta = "SELECT u FROM CriarConta u.login =1? and u.senha =2?";
			Query query = em.createQuery(consulta);
			List<CriarConta> lista = query.getResultList();
		}catch(Exception e) {
		
			throw e;
		}finally {
			
		}
		return usuario;
	}*/
	
	public CriarConta getConta() {
		return conta;
	}

	public void setConta(CriarConta conta) {
		this.conta = conta;
	}

}

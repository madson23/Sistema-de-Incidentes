package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entidades.CriarConta;

import Util.JPAUtil;

public class UsuarioDAO {
	
	public static void salvarr(CriarConta conta) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static List<CriarConta> listarTodos(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select e from CriarConta e");
		List<CriarConta> contas = q.getResultList();
		em.close();
		return contas;
	}
	
	public static void excluir(CriarConta conta) throws Exception {
		try {
			EntityManager em = JPAUtil.criarEntityManager();
			em.getTransaction().begin();
			conta = em.find(CriarConta.class, conta.getId());
			em.remove(conta);
			em.getTransaction().commit();
			em.close();
		}catch(Exception e) {
			throw new Exception("Id do Email v2:" + conta.getId());
		}
		}

/*	public static Usuario getUsuario(String usuario, String senha ) {
		EntityManager em = JPAUtil.criarEntityManager();
		if() {
			Usuario usuarioEncontrado = em.createQuery(SELECT u FROM CriarConta u WHERE u.email = :usuario and u.senha)
		}
		
		
	}*/
}

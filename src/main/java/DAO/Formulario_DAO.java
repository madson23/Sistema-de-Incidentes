package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import Entidades.Formulario;
import Util.JPAUtil;

public class Formulario_DAO {

	public static void salvar(Formulario formulario) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(formulario);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static List<Formulario> listarTodos(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select e from Formulario e");
		List<Formulario> formularios = q.getResultList();
		em.close();
		return formularios;
	}
	
	public static void excluir(Formulario formulario) throws Exception {
		try {
			EntityManager em = JPAUtil.criarEntityManager();
			em.getTransaction().begin();
			formulario = em.find(Formulario.class, formulario.getId());
			em.remove(formulario);
			em.getTransaction().commit();
			em.close();
		}catch(Exception e) {
			throw new Exception("Id do Email v2:" + formulario.getId());
		}
	}
	
}

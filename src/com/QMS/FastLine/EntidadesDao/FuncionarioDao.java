package com.QMS.FastLine.EntidadesDao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FuncionarioDao {

    private static FuncionarioDao instance;
    protected EntityManager entitymanager;

    public static FuncionarioDao getInstance() {

        if (instance == null) {
            instance = new FuncionarioDao();
        }

        return instance;
    }

    private FuncionarioDao() {
        entitymanager = getEntitymanager();

    }

    private EntityManager getEntitymanager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.QMS.FastLinePU2");
        if (entitymanager == null) {
            entitymanager = factory.createEntityManager();

        }

        return entitymanager;

    }

    public Funcionario getById(final int id) {

        return entitymanager.find(Funcionario.class, id);

    }

    @SuppressWarnings("unchecked")
    public List<Funcionario> findAll() {

        return entitymanager.createQuery("FROM" + Funcionario.class.getName()).getResultList();

    }

    public void persist(Funcionario funcionario) {
        try {
            entitymanager.getTransaction().begin();
            entitymanager.persist(funcionario);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void merge(Funcionario funcionario) {

        try {
            entitymanager.getTransaction().begin();
            entitymanager.merge(funcionario);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void remove(Funcionario funcionario) {
        try {
            entitymanager.getTransaction().begin();
            funcionario = entitymanager.find(Funcionario.class, funcionario.getId());
            entitymanager.remove(funcionario);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            Funcionario funcionario = getById(id);
            remove(funcionario);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public List<Funcionario> procurartodos() {

        List<Funcionario> funcionario = null;

        try {

            funcionario = entitymanager.createQuery("from Funcionario a").getResultList();
        } catch (Exception e) {
        }

        return funcionario;

    }
}

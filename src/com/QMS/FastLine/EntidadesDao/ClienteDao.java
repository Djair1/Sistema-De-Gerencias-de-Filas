package com.QMS.FastLine.EntidadesDao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDao {

    private static ClienteDao instance;
    protected EntityManager entitymanager;

    public static ClienteDao getInstance() {

        if (instance == null) {
            instance = new ClienteDao();
        }

        return instance;
    }

    private ClienteDao() {
        entitymanager = getEntitymanager();

    }

    private EntityManager getEntitymanager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.QMS.FastLinePU");
        if (entitymanager == null) {
            entitymanager = factory.createEntityManager();

        }

        return entitymanager;

    }

    public Clientes getById(final int id) {

        return entitymanager.find(Clientes.class, id);

    }

    @SuppressWarnings("unchecked")
    public List<Clientes> findAll() {

        return entitymanager.createQuery("FROM" + Clientes.class.getName()).getResultList();

    }

    public void persist(Clientes clientes) {
        try {
            entitymanager.getTransaction().begin();
            entitymanager.persist(clientes);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void merge(Clientes clientes) {

        try {
            entitymanager.getTransaction().begin();
            entitymanager.merge(clientes);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void remove(Clientes clientes) {
        try {
            entitymanager.getTransaction().begin();
            clientes = entitymanager.find(Clientes.class, clientes.getId());
            entitymanager.remove(clientes);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            Clientes clientes = getById(id);
            remove(clientes);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public List<Clientes> procurartodos() {

        List<Clientes> clientes = null;

        try {

            clientes = entitymanager.createQuery("from Clientes cl").getResultList();
        } catch (Exception e) {
        }

        return clientes;

    }
}

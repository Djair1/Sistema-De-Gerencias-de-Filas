package com.QMS.FastLine.EntidadesDao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDaoPrioritario {

    private static ClienteDaoPrioritario instance;
    protected EntityManager entitymanager;

    public static ClienteDaoPrioritario getInstance() {

        if (instance == null) {
            instance = new ClienteDaoPrioritario();
        }

        return instance;
    }

    private ClienteDaoPrioritario() {
        entitymanager = getEntitymanager();

    }

    private EntityManager getEntitymanager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.QMS.FastLinePU3");
        if (entitymanager == null) {
            entitymanager = factory.createEntityManager();

        }

        return entitymanager;

    }

    public ClientePrioritario getById(final int id) {

        return entitymanager.find(ClientePrioritario.class, id);

    }

    @SuppressWarnings("unchecked")
    public List<ClientePrioritario> findAll() {

        return entitymanager.createQuery("FROM" + ClientePrioritario.class.getName()).getResultList();

    }

    public void persist(ClientePrioritario clienteP) {
        try {
            entitymanager.getTransaction().begin();
            entitymanager.persist(clienteP);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void merge(ClientePrioritario clienteP) {

        try {
            entitymanager.getTransaction().begin();
            entitymanager.merge(clienteP);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void remove(ClientePrioritario clienteP) {
        try {
            entitymanager.getTransaction().begin();
            clienteP = entitymanager.find(ClientePrioritario.class, clienteP.getId());
            entitymanager.remove(clienteP);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            ClientePrioritario clienteP = getById(id);
            remove(clienteP);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public List<ClientePrioritario> procurartodos() {

        List<ClientePrioritario> clienteP = null;

        try {

            clienteP = entitymanager.createQuery("from ClientePrioritario cpo").getResultList();
        } catch (Exception e) {
        }

        return clienteP;

    }
}

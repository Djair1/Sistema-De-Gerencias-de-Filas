package com.QMS.FastLine.EntidadesDao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdministradorDao {

    private static AdministradorDao instance;
    protected EntityManager entitymanager;

    public static AdministradorDao getInstance() {

        if (instance == null) {
            instance = new AdministradorDao();
        }

        return instance;
    }

    private AdministradorDao() {
        entitymanager = getEntitymanager();

    }

    private EntityManager getEntitymanager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.QMS.FastLinePU2");
        if (entitymanager == null) {
            entitymanager = factory.createEntityManager();

        }

        return entitymanager;

    }

    public Administrador getById(final int id) {

        return entitymanager.find(Administrador.class, id);

    }

    @SuppressWarnings("unchecked")
    public List<Administrador> findAll() {

        return entitymanager.createQuery("FROM" + Administrador.class.getName()).getResultList();

    }

    public void persist(Administrador admin) {
        try {
            entitymanager.getTransaction().begin();
            entitymanager.persist(admin);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void merge(Administrador admin) {

        try {
            entitymanager.getTransaction().begin();
            entitymanager.merge(admin);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void remove(Administrador admin) {
        try {
            entitymanager.getTransaction().begin();
            admin = entitymanager.find(Administrador.class, admin.getId());
            entitymanager.remove(admin);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entitymanager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            Administrador admin = getById(id);
            remove(admin);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public List<Administrador> procurartodos() {

        List<Administrador> administrador = null;

        try {

            administrador = entitymanager.createQuery("from Administrador a").getResultList();
        } catch (Exception e) {
        }

        return administrador;

    }
}

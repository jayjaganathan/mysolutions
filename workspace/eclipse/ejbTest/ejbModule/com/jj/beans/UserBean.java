package com.jj.beans;
 
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import model.User1;

/**
 * Session Bean implementation class UserBean
 */

@Stateless(name="UserBean")
public class UserBean implements UserBeanLocal {

    /**
     * Default constructor. 
     */
    public UserBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceUnit(unitName="jdbc/HRPU")
    private EntityManagerFactory emf;
    private EntityManager em;
	
    public void insert(User1 user) {
        // EntityManager em = DBUtil.getEmFactory().createEntityManager();
    	EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();        
        try {
            em.persist(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
    
	public  User1 selectUser(String email) {
        // EntityManager em = DBUtil.getEmFactory().createEntityManager();
		em = emf.createEntityManager();
        String qString = "SELECT u FROM User1 u WHERE u.email = :email";
       
        try {
            return em.createQuery(qString, User1.class).setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
}

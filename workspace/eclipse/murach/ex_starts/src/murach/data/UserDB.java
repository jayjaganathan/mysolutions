package murach.data;

 
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

// import model.User1;
import murach.business.*;
import murach.data.DBUtil; 

public class UserDB   {
	
    public static void insert(User2 user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
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

    public static void update(User2 user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();       
        try {
            em.merge(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }

    public static void delete(User2 user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();        
        try {
            em.remove(em.merge(user));
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }       
    }
    
    /* (non-Javadoc)
	 * @see murach.data.IUserDB#selectUser(java.lang.String)
	 */
   
	public static User2 selectUser(String email) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT u FROM User2 u WHERE u.email = :email";
        TypedQuery<User2> q = em.createQuery(qString, User2.class);
        q.setParameter("email", email);
        try {
            User2 user = q.getSingleResult();
            return user;
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    /* (non-Javadoc)
	 * @see murach.data.IUserDB#emailExists(java.lang.String)
	 */
    
	public boolean emailExists(String email) {
        User2 u = selectUser(email);   
        return u != null;
    }
}
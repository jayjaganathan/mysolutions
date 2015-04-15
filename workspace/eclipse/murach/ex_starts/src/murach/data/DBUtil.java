package murach.data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("jdbc/HRPU1");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
} 
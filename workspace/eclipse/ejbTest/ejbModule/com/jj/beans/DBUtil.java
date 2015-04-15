package com.jj.beans;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("jdbc/HRPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
} 
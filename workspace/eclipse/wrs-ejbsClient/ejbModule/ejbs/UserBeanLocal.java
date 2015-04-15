package ejbs;

import javax.ejb.Local;
import javax.naming.NamingException;

@Local({UserBeanLocal.class})
public interface UserBeanLocal {
	public String getName() throws NamingException;
}

package ejbs;

import javax.ejb.Remote;

@Remote({UserBeanRemote.class})
public interface UserBeanRemote {
	public String getName();

}

package fileManagement;

import javax.ejb.Local;

 
@Local({FileLocal.class})
public interface FileLocal {
	public String getName();
}

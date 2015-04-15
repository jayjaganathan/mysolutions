package fileManagement;

import javax.ejb.Remote;
 

@Remote({FileRemote.class})
public interface FileRemote {
 public String getFileName();
}

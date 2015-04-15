package beans;

import javax.ejb.Local;

@Local
public interface HelloWorldBeanLocal {
    public String GetLocalName() ;
}

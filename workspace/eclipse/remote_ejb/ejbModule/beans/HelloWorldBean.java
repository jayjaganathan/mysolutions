package beans;

import java.util.Date;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless(name="HelloWorldBean", mappedName = "HelloWorldBean")
public class HelloWorldBean implements HelloWorldBeanRemote, HelloWorldBeanLocal {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
     
    }
    
    public String GetLocalName() { return "Local Hello World!"; }   
    
    public String GetRemoteName() { 
    	Date dt = new Date();
    	return dt.toString() + ": Remote Hello World!"; 
    }   

}

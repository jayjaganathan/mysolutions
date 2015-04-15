package model;

public class userid implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4673995363555170274L;
	long userId;
	
	@Override
	public int hashCode()
	{
		return (int)userId;
	}
	
}


public class Request 
{
	String _name;
	String _hash;
	
	public Request() 
	{
		_name = "";
		_hash = "";
	}
	
	public Request(String name, String hash) 
	{
		_name = name;
		_hash = hash;
	}

	public String getNewName(String currentName ,int count)
	{
		String newName = currentName + count++ ;
		return newName;
	}
	
	public String getName() 
	{
		return _name;
	}
	
	public String getHash() 
	{
		return _hash;
	}
	
	public void setName(String name) 
	{
		_name = name;
	}
	
	public void setHash(String hash)
	{
		_hash = hash;
	}
	
	// ????? add the real calc
	public String CalcHash(String name)
	{
		return name;
	} 
	
}

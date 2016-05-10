import javax.tools.FileObject;


public class RequestArr 
{
	final private int ARR_LENGTH = 10000;
	final private String METHOD_NAME = "ThrowExcep";

	
	Request[] _requestArr = new Request[ARR_LENGTH];
	
	public RequestArr() 
	{
		for (int i = 0; i < _requestArr.length; i++) 
		{
			_requestArr[i] = new Request("n" ,"h");
		}
	}
	
	public Request[] getArr() 
	{
		return _requestArr;
	}
	
	//Returns copy of current array 
	public Request[] getCopyArr() 
	{
		Request[] tempArr = new Request[ARR_LENGTH];

		for (int i = 0; i < _requestArr.length; i++) 
		{
			tempArr[i].setName(_requestArr[i].getName());
			tempArr[i].setHash(_requestArr[i].getHash());
		}
		
		return tempArr;
	}
	
	public void printArr() 
	{
		for (int i = 0; i < _requestArr.length; i++) 
		{
			System.err.println(i + ": " + "\t" +_requestArr[i].getName() + "\t" + _requestArr[i].getHash());
		}	
	}
		
	// Set new names  
	public Request[] setNames(Request[] requestArr) 
	{		
		for (int i = 0; i < requestArr.length; i++) 
		{
			String name = METHOD_NAME;
			requestArr[i].setName(requestArr[i].getNewName(name, i));
		}
		
		return requestArr;
	}
	
	public Request[] setHashs(Request[] requestArr) 
	{
		for (int i = 0; i < requestArr.length; i++) 
		{
			requestArr[i].setHash(requestArr[i].CalcHash(requestArr[i].getName()));
		}
		return requestArr;
	}
}

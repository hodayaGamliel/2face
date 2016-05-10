

public class Face2 {
	
	final static private int RUN_TIMES = 10000;
		
	public static void main(String[] args) throws InterruptedException 
	{
		Thread[] t = new Thread[2];
		
		for (int i = 0; i < t.length; i++)
		{
			t[i] = new Thread(new Runnable() 
			{
				
				@Override
				public void run() 
				{
					runException();
				}
			});
		}
		
		t[0].start();
		t[0].join();
		t[1].start();
		t[1].join();
		System.out.println(":):):)");
	}	


	public static void runException()
	{
		for (int i = 0; i < RUN_TIMES; i++)
		{
			try 
			{
				throw new Exception();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}



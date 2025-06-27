
public class External_call {
	private External ex;
	External_call(External ex)
	{
		this.ex=ex;
	}
	public void fetch()
	{
		System.out.println("Fetching the data from External...");
		ex.dummy();
	}
	
}

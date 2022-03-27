
public class Counter
{
	String name=" ";
	int i=0;
	
	public Counter(String str)
	{
		this.name=str;
		System.out.println("print the name "+str);
	}

	public void increment()
	{
		i=i+2;
		System.out.println(i);
	}
	public int getCurrentValue()
	{

		return i;
	}
	
	public String toString()
	{
		
		return name+" "+ i;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c=new Counter("Abhishek");
		c.increment();
		System.out.println(c.getCurrentValue());
		System.out.println(c.toString());
	
		
		

	}

}

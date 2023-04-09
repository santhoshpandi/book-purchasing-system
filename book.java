public class book{

	static int temp = 101;
	String name;
	int price;
	int bid;
	String status;

	public book()
	{

	}

	public book(String name,int price)
	{
		this.bid=temp++;
		this.name=name;
		this.price=price;
		this.status="available";
	}
}
public class Customer{

	static int temp = 1;
	String name;
	int age;
	int id;

	public Customer()
	{

	}

	public Customer(String name,int age)
	{
		this.id=temp++;
		this.name=name;
		this.age=age;
	}
}
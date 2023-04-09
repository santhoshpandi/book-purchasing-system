import java.util.*;
public class order{
	static int temp=1001;
	int oid;
	int bid;
	int cid;
	public order()
	{

	}
	public order(int bid,int cid)
	{
		this.oid=temp++;
		this.bid=bid;
		this.cid=cid;
	}

	static Map<Integer,Customer> cc = new HashMap<>();
	static Map<Integer,book> bb = new HashMap<>();
	static Map<Integer,order> oo = new HashMap<>();

	LinkedList<Integer> orders = new LinkedList<>();

	public void storeBooks(book b,int id)
	{
		bb.put(id,b);
	}

	public void display()
	{
		for(book b : bb.values())
		{
			System.out.println("---------------------------------");
			System.out.println("Book id : "+b.bid);
			System.out.println("Book name : "+b.name);
			System.out.println("Book price : "+b.price);
			System.out.println("Book status : "+b.status);
			System.out.println("---------------------------------");
		}
	}

	public void buy(int bid,Customer c)
	{
		try{
		book bk = bb.get(bid);
		if(bk.status.equals("available"))
		{
		cc.put(c.id,c);
		order o = new order(bid,c.id);
		oo.put(o.oid,o);
		orders.add(1);		
		bk.status="Not available";
		System.out.println("Book purchases successfully :)\n");
	}
	
		else{
		System.out.println("Book not available :(\n");
	}
	
	}

	catch(Exception e)
	{
		System.out.println("enter correct book id !\n");
	}
	
	
	}

	public void displayOrder(){
		for(order b : oo.values())
		{
			System.out.println("---------------------------------");
			System.out.println("order id  : "+b.oid);
			Customer c = cc.get(b.cid);
			System.out.println("---------------------------------");
			System.out.println("customer id : "+c.id);
			System.out.println("customer name : "+c.name);
			System.out.println("customer : "+c.age);
			System.out.println("---------------------------------");
			book b1 = bb.get(b.bid);
			System.out.println("Book id : "+b1.bid);
			System.out.println("Book name : "+b1.name);
			System.out.println("Book price : "+b1.price);
			System.out.println("---------------------------------");

		}
	}
}
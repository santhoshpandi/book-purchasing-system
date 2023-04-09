import java.util.*;

public class Main{

	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		order o = new order();
		book b1 = new book("SpiderMan part 1",1034);
		o.storeBooks(b1,b1.bid);
		book b2 = new book("ponniyin selvan 1",434);
		o.storeBooks(b2,b2.bid);
		book b3 = new book("ponniyin selvan 2",834);
		o.storeBooks(b3,b3.bid);



		while(true)
		{
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Enter the choice:\n1.Order books 2.display available books 3.display order 4.exit");
			System.out.println("----------------------------------------------------------------------------");
			switch(c.nextInt())
			{
			case 1:
				{

					System.out.println("Enter the id of the book");
					int id = c.nextInt();
					System.out.println("Enter the name and age");
					String name = c.next();
					int age = c.nextInt();
					Customer cc = new Customer(name,age);
					order o1 = new order();
					o1.buy(id,cc);
					break;
				}
			case 2:
				{
					order b = new order();
					b.display();
					break;
				}
			case 3:
				{
					order b = new order();
					o.displayOrder();
					break;
				}
			case 4:
				{
					return;
				}
			}
		}
	}
}
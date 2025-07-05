/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		Product p=new Product(false,false);
		p.name="gmeo";
		p.quantity = 7;
		System.out.println(p.name);
		Cart c = new Cart();
		c.add(p,8);
		
			
	}
}
 

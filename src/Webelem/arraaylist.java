package Webelem;

import java.util.ArrayList;

public class arraaylist 
{

	public static void main(String[] args)
	{
		//ArrayList al=new ArrayList();    //initial default capacity=10
		
		ArrayList al=new ArrayList(8);    //initial calacity = 8  
		
		al.add("rahul");
		al.add(200);
		al.add(65.5f);
		al.add('A');
		al.add(200);
		al.add(null);
		al.add(null);
		
		for(int i=0; i<=4; i++) 
//			{   //                    4
//				System.out.println(ar[i]);
//			}

		
		System.out.println(al.get(2));
	}
	
}

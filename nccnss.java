import java.util.*;
class nssncc{
	public static void main(String args[])
	{
		
		Scanner input=new Scanner(System.in);
	
		System.out.println("Enter how many students interested in NSS : ");

		int ns=input.nextInt();

		System.out.println("Enter how many students interested in NCC : ");

		int nc=input.nextInt();

		int nss[]=new int[ns];

		int ncc[]=new int[nc];

		System.out.println("Enter the student id's those who are interested in NSS ");

		for(int i=0;i<ns;i++)
		{
			nss[i]=input.nextInt();
		}
	
		System.out.println("Enter the student id's those who are interested in NCC ");
		for(int i=0;i<nc;i++)
		{
			ncc[i]=input.nextInt();
		}
		System.out.println();
		System.out.print("NSS students are : ");
		for(int i=0;i<ns;i++)
		{
			 System.out.print(nss[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.print("NCC students are : ");
		for(int i=0;i<nc;i++)
		{
			 System.out.print(ncc[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Students in both NSS and NCC : ");
		for(int i=0;i<ns;i++)
		{
			for(int j=0;j<nc;j++)
			{
				if(nss[i]==ncc[j])
				{
					System.out.print(nss[i]+" ");
				}
			}
		}
	}
}
			
		
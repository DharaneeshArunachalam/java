import java.util.*;

class hotelparticipants
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int male=0,female=0;
		System.out.println("How many participants : ");
		int participants=input.nextInt();
	
		System.out.println("Enter the participants id : ");
		
		int gender[] = new int[participants];

		for(int i=0;i<participants;i++)
		{
			gender[i]=input.nextInt();
		}
	
		for(int i=0;i<participants;i++)
		{
			if(gender[i]%2==0)
			{
				female+=1;
			}
			else{
				male+=1;
			}
		}
		
		System.out.print("Total male participants : "+male);
		System.out.println();
		System.out.print("Total female participants : "+female);
	}
}
import java.util.*;
import java.text.*;

class DayCalculation
{
	
	
	public void dayCalculate(String date)
	{	try
		{
			String []arr;
			arr=new String [7];
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date dt = null;
			dt = format.parse(date);
			long day = dt.getDay();
			
			arr[0]="Sunday";
			arr[1]="Monday";
			arr[2]="Tuesday";
			arr[3]="Wednesday";
			arr[4]="Thrusday";
			arr[5]="Friday";
			arr[6]="Saturday";
			
			for(int i=0;i<arr.length;i++)
			{
				if(i==day)
				{
					System.out.println (arr[i]);
					break;
				}
			}
		}

		catch(Exception e)
		{
			System.out.println (e);
		}
	}
	
} 
class TestDayCalculation
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String cd=sc.nextLine();
		
		DayCalculation ob=new DayCalculation();
		ob.dayCalculate(cd);
		
	}
}

import java.util.*;
import java.text.*;
class AgeCalculator
{
	AgeCalculator()
	{
		String date="dd/mm/yyyy";	
	}
	
	public void ageCalculate(String dob)
	{
		String dateStart = dob;
		String dateStop = "01/04/2020";

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		Date date1 = null;
		Date date2 = null;

		try
		{
			date1 = format.parse(dateStart);	
			date2 = format.parse(dateStop);	

			long year1= date1.getYear();
			long year2=date2.getYear();
			
			long month1=date1.getMonth();
			long month2= date2.getMonth();
			if(month2<month1)
			{
				month2=month2+12;
				year2=year2-1;
			}
			
			long day1=date1.getDate();
			long day2=date2.getDate();
			if(day2<day1)
			{
				day2=day2+30;
				month2=month2-1;
			}
				
			long diy = year2-year1;
			
			long dim = month2-month1;

			if(diy==0 && month1<month2)
			{
				System.out.println("Month : " +dim);
			}
			else if(year1<year2 && dim==0)
			{
				System.out.print("Years : "+diy );
			}
			else if(year1==year2 && month1==month2 && date1==date2)
			{
				System.out.println ("Year : 0, Month : 0, Day : 0");
			}
			else if((year1>year2) || (year1==year2 && month1>month2) || (year1==year2 && month1==month2 && date1!=date2))
			{
				System.out.println ("Invalid Date of birth");
			}
			else
			{
				System.out.print("Years : "+diy+ ", Month : " +dim);
			}
			
		} 
			
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

class TestAgeCalculator
{
	public static void main (String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String birthdate=sc.nextLine();
		
		AgeCalculator ob=new AgeCalculator();
		
		ob.ageCalculate(birthdate);
		
	}
}

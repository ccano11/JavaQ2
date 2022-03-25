
//CIS2235 Java Debugging problem


public class DateGenerator
{

	private int month, day;
	private String newDate;
	private String [] monthNames;
	private String [] dayNames;

	public DateGenerator()
	{
		String [] monthNames = { "Jan", "Feb", "Mar", "Apr","May",
					"Jun","Jul","Aug","Sept","Oct","Nov","Dec"};

		String [] dayNames = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};

		month = 1;
	}


	public void setMonth(int m)
	{
		month = m;
		calculate();
	}
	
	public String getRandomDate()
	{
		return newDate;
	}

	private void calculate()
	{
		switch(month)
		{
			case 2: //Feb 1-28 
			day = (int)(Math.random()*28);
			break;

			case 4: case 6: case 9: case 11:
			day = (int)(Math.random()*30);
			break;

			default:
			day = (int)(Math.random()*31);
			break;
		}
		if(day == 0) day = 1;
		int dayn = (int)(Math.random()*7);
		
		newDate = dayNames[dayn] + ", " + monthNames[month]+ "  " + day;

	}

}
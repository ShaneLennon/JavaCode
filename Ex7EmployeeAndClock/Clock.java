package Ex7EmployeeAndClock;

import java.util.concurrent.SynchronousQueue;

public class Clock 
{
	/*member variables*/
	private int hours;
	private int minutes;
	private int seconds;
	
	//Constructor
	public Clock(int hours,int minutes, int seconds)
	{
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	//getters
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public int getSeconds()
	{
		return seconds;
	}
	//setters
	public void setHours(int hours)
	{
		if(hours >= 0 && hours <= 23)
		{
			this.hours = hours;
		}
		else
		{
			System.out.println("Invalid hour");
		}
	}
	
	public void setMinutes(int minutes)
	{
		if(minutes >= 0 && minutes <= 59)
		{	
			this.minutes = minutes;
		}
		else
		{
			System.out.println("Invalid minutes");
		}
	}
	
	public void setSeconds(int seconds)
	{
		if(seconds >= 0 && seconds <=59)
		{
			this.seconds = seconds;
		}
		else
		{
			System.out.println("Invalid seconds");
		}
	}
	//method to set the complete time
	public void setCompleteTime(int hours,int minutes,int seconds)
	{
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	
	//increments the hours
	public void incrementHours(int hours)
	{
		int totalHours = this.hours + hours;
		int divisor = totalHours/24;
		if(this.hours + hours >= 24)
		{
			this.hours = this.hours + hours - 24*divisor;
		}
		else
		{
			this.hours = this.hours + hours;
		}
	}
	
	//increments the minutes
	public void incrementMinutes(int minutes)
	{
		int totalMinutes = this.minutes + minutes;
		int divisor = totalMinutes/60;
		if(this.minutes + minutes >= 60)
		{
			//e.g 59 + 2 = 61 - 60 = 1
			this.minutes = this.minutes + minutes -60*divisor;
			//call the incrementHours method and increment the hours by 1
			incrementHours(divisor);
		}
		else
		{
			this.minutes = this.minutes + minutes;
		}
	}
	
	//increments the seconds
	public void incrementSeconds(int seconds)
	{
		int totalSeconds = this.seconds + seconds;
		int divisor = totalSeconds/60;
		if(this.seconds + seconds >= 60)
		{
			this.seconds = this.seconds + seconds - 60*divisor;
			incrementMinutes(divisor);
		}
		else
		{
			this.seconds = this.seconds + seconds;
		}
	}
	//resets the time to midnight
	public void resetTime()
	{
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	//returns the time as a String
	public String toString()
	{
		return String.format("%02d : %02d : %02d\n",hours,minutes,seconds);
	}
}

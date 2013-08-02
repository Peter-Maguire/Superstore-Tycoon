package com.fightthetoast.superstore;

public class Forecast {

	
	public enum weatherType {FORECAST_SUNNY, FORCAST_RAINING, FORCAST_THUNDER, FORCAST_SNOW, FORCAST_CLOUDY};
	public int severity = 0;
	
	private weatherType[] weatherDays;
	private Integer[] severityDays;
	
	
	public Forecast(int days)
	{
		weatherDays = new weatherType[days];
		severityDays = new Integer[days];
	}
	
	public static Forecast generateForcast(int days)
	{
		Forecast f = new Forecast(days);
		for(int i = 0; i < days; i++)
		{
			
		}
		return f;
	}
}

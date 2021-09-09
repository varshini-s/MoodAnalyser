package com.brigelabz.moodanalyser;

public class MoodAnalyser 
{


	public String analyseMood(String message) throws MoodAnalysisException
	{
		try
		{
			if(message.contains("sad"))
			{
				return "SAD";
			}
			else
			{
				return "HAPPY";
			}

		}
		catch (NullPointerException e) 
		{
			throw new MoodAnalysisException("Please enter valid mood");
		}


	}


}
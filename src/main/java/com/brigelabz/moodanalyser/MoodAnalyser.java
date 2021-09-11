package com.brigelabz.moodanalyser;

import com.brigelabz.moodanalyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyser 
{


	public String analyseMood(String message) throws MoodAnalysisException
	{
		try
		{
			if(message.length()==0)
			{
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY,"Please enter valid mood");
			}
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
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL,"Please enter valid mood");
		}


	}


}
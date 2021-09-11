package com.brigelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.brigelabz.moodanalyser.MoodAnalysisException.ExceptionType;


public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a sad Message");
		assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenNoSad_ShouldReturnHappy() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a happy Message");
		assertEquals("HAPPY", mood);
	}


	@Test
	public void givenNullMood_ShouldThrowException() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();

		try 
		{
			moodAnalyser.analyseMood(null);

		} catch (MoodAnalysisException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL ,e.type);
		}

	}

	@Test
	public void givenEmptyMood_ShouldThrowException() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();

		try 
		{
			moodAnalyser.analyseMood("");

		} catch (MoodAnalysisException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}

	}
}
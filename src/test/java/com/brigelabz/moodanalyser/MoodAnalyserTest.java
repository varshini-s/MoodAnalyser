package com.brigelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood;
		try 
		{
			mood = moodAnalyser.analyseMood("This is a sad Message");
			assertEquals("SAD", mood);
		}
		catch (MoodAnalysisException e) 
		{

			e.printStackTrace();
		}

	}

	@Test
	public void givenMessage_WhenNoSad_ShouldReturnHappy() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood;
		try 
		{
			mood = moodAnalyser.analyseMood("This is a happy Message");
			assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) 
		{

			e.printStackTrace();
		}

	}

	@Test
	public void givenNullMood_ShouldThrowException() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood;
		try
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			mood = moodAnalyser.analyseMood(null);

		} catch (MoodAnalysisException e) 
		{
			e.printStackTrace();
		}

	}

	@Test
	public void givenEmptyMood_ShouldThrowException() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood;
		try
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			mood = moodAnalyser.analyseMood("");

		} catch (MoodAnalysisException e) 
		{
			e.printStackTrace();
		}

	}
}
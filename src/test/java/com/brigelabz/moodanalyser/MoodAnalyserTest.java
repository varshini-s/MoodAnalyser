package com.brigelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a sad Message");
		assertEquals("SAD", mood);
	}

}

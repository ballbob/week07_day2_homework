package com.codeclan.wordcountr;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/03/2017.
 */

public class WordCountTest {

    WordCount wordCount;
    String text;

    @Before
    public void before() {
        wordCount = new WordCount();
        text = "She sells seashells on the sea shore.";
    }

    @Test
    public void canCountTest(){
        assertEquals(7, wordCount.wordCount(text));
    }

}

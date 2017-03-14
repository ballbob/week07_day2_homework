package com.codeclan.wordcountr;


/**
 * Created by user on 14/03/2017.
 */

public class WordCount {

    public WordCount(){
    }

    public int wordCount(String words){
        String[] wordArray = words.trim().split("\\s+");
        int result = wordArray.length;
        return result;
    }
}

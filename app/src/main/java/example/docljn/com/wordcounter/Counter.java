package example.docljn.com.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lornanoble on 22/01/2018.
 */

class Counter {
    public String getWordCount(String phrase) {
        String words[] = phrase.split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        return String.valueOf(wordsList.size());
    }
}

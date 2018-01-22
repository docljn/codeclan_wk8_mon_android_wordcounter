package example.docljn.com.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lornanoble on 22/01/2018.
 */

class Counter {
    public int getWordCount(String phrase) {
        String words[] = phrase.split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        return wordsList.size();
    }
}

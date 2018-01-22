package example.docljn.com.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by lornanoble on 22/01/2018.
 */

class Counter {

    public ArrayList<String> getWordsList(String phrase){
        String words[] = phrase.split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        return wordsList;
    }

    public String getWordCount(String phrase) {
        return String.valueOf(getWordsList(phrase).size());
    }

    public HashMap<String, Integer> getWordOccurrence(String phrase) {
        HashMap<String, Integer> wordOccurrence = new HashMap<>();

        for (String word: getWordsList(phrase)) {
            if (wordOccurrence.get(word) != null){
                wordOccurrence.put(word, wordOccurrence.get(word) + 1);
            } else {
                wordOccurrence.put(word, 1);
            }
            // if key is in hashmap, add 1 to value
            // if key is not in hashmap, add key and value = 1
        }
        return wordOccurrence;
    }


    public String outputWordsOccurrence(String phrase) {
        String output = "";
        for (String word:getWordOccurrence(phrase).keySet()) {
            output = output + "\"" + word + "\": " + getWordOccurrence(phrase).get(word) + ", ";
        }

        return output;
    }
}

package example.docljn.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lornanoble on 22/01/2018.
 */

public class CounterTest {

    Counter counter;

    @Before
    public void before() {
        counter = new Counter();
    }

    @Test
    public void returnsWordCount(){
        assertEquals("2", counter.getWordCount("Hello World"));
    }

    @Test
    public void returnsWordsWithCount(){

    }
}

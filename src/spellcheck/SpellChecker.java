package spellcheck;

import java.io.IOException;
import java.net.URL;
import java.util.SortedMap;

public interface SpellChecker {
    public SortedMap<String, Integer> check(Object o) throws IOException;
}

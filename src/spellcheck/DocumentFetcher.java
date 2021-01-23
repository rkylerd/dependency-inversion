package spellcheck;

import java.io.IOException;

public interface DocumentFetcher {
    public String fetch(Object o)  throws IOException;
}

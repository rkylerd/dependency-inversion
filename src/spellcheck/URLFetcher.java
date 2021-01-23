
package spellcheck;

import java.net.*;
import java.io.*;


public class URLFetcher implements DocumentFetcher {

	public String fetch(Object o) throws IOException {
		URL url = (URL)o;
		URLConnection connection = url.openConnection();
		
		StringBuffer contentBuffer = new StringBuffer();
		
		InputStream input = connection.getInputStream();
		
		try {
			int c;
			while ((c = input.read()) >= 0) {
				contentBuffer.append((char)c);
			}
		}
		finally {
			input.close();
		}
	
		return contentBuffer.toString();
	}

}


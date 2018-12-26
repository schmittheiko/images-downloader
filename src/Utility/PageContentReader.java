package Utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class PageContentReader {

	public static String getPageContent(String urlInput) throws Exception {

		String https_url = urlInput;
		URL url;

		url = new URL(https_url);
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

		String pageContent = "";
		String input;

		while ((input = br.readLine()) != null) {
			pageContent = pageContent + input;
		}
		br.close();

		return pageContent;
	}
	
}

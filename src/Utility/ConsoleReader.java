package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	
	public static String readWebsiteFromConsole() throws IOException {

		System.out.println("please type in the url of the website where you want to download all images from:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String url = reader.readLine();
		System.out.println("tack sa mycket for specifying the website " + url);

		return url;
	}
}
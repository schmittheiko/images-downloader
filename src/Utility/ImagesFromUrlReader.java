package Utility;

import java.util.LinkedList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImagesFromUrlReader {

	public static String[] getImageUrls(String urlInput) throws Exception {

		Document doc = Jsoup.connect(urlInput).get();
		Elements images = doc.select("img");
		int numberOfImages = images.size();
		LinkedList<String> imageUrls = new LinkedList();

		System.out.println(urlInput + " has the following image landscape:");		
		
		for (int i = 0; i < numberOfImages; i++) {
			Element image = images.get(i);
			String imageUrl = image.attr("src");
			if(imageUrl.substring(0,4).equals("http")) {
				imageUrls.add(imageUrl);
				System.out.println(imageUrl);
			}
			else {
				System.out.println("filtered: "+ imageUrl);
			}
		}

		return imageUrls.toArray(new String[imageUrls.size()]);
	}	
}
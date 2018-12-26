package Utility;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImagesFromUrlReader {

	public static String[] getImageUrls(String urlInput) throws Exception {

		System.out.println(urlInput + " has the following images:");

		Document doc = Jsoup.connect(urlInput).get();
		Elements images = doc.select("img");

		String[] imageUrls = new String[images.size()];

		for (int i = 0; i < images.size(); i++) {
			Element image = images.get(i);
			System.out.println(image.attr("src"));
			imageUrls[i] = image.attr("src");
		}

		return imageUrls;
	}
	
}

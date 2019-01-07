package Utility;

import java.util.HashSet;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PagesFromUrlReader {

	public static HashSet<String> getAllPagesFromUrl(String urlInput, HashSet<String> pagesInput) throws Exception {

		HashSet<String> pages = new HashSet<String>();
		Document doc = Jsoup.connect(urlInput).data("lang", "de").get();
		Elements links = doc.select("a[href~=" + urlInput + "]");

		for (int i = 0; i < links.size(); i++) {
			Element link = links.get(i);
			pages.add(cleanUrl(link.attr("href")));
		}

		Iterator<String> iterator = pages.iterator();
		while (iterator.hasNext()) {
			String pageUrl = iterator.next();
			if (!pageUrl.equals(urlInput) && !pagesInput.contains(pageUrl)) {
				System.out.println("crawling for images in " + pageUrl);
				getAllPagesFromUrl(pageUrl, pagesInput);
			}
		}

		pagesInput.add(cleanUrl(urlInput));

		return pagesInput;
	}
	
	private static String cleanUrl(String url) {
		if(url.endsWith("/")) {
			url= url.substring(0, url.length()-1);
		}
		return url;
	}

}

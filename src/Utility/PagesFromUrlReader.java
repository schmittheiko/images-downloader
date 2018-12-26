package Utility;

import java.util.HashSet;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PagesFromUrlReader {

	public static HashSet<String> getAllPagesFromUrl(String urlInput, HashSet<String> pagesInput) throws Exception {

		HashSet<String> pages = new HashSet();
		Document doc = Jsoup.connect(urlInput).data("lang", "de").get();
		Elements links = doc.select("a[href~=" + urlInput + "]");

		for (int i = 0; i < links.size(); i++) {
			Element link = links.get(i);
			System.out.println(link.attr("href"));
			pages.add(link.attr("href"));
		}

		Iterator iterator = pages.iterator();
		while (iterator.hasNext()) {
			String pageUrl = (String) iterator.next();
			if (!pageUrl.equals(urlInput) && !pagesInput.contains(pageUrl))
				getAllPagesFromUrl(pageUrl, pagesInput);
		}

		pagesInput.add(urlInput);

		return pagesInput;
	}
	
}

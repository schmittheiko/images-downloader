import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Iterator;

import Utility.ConsoleReader;
import Utility.DirectoryCreator;
import Utility.ImageDownloader;
import Utility.ImagesFromUrlReader;
import Utility.PageUrlToDirectoryPathConverter;
import Utility.PagesFromUrlReader;

public class ImagesDownloader {

	public static void main(String[] args) {
		System.out.println("ImagesDownloader has started");

		try {
			String url = ConsoleReader.readWebsiteFromConsole();
			downloadImages(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("ImagesDownloader has finished");
		}
	}

	public static void downloadImages(String url) throws Exception {
		HashSet<String> pages = new HashSet<String>();
		pages = PagesFromUrlReader.getAllPagesFromUrl(url, pages);

		Iterator<String> iteratorPages = pages.iterator();

		while (iteratorPages.hasNext()) {

			String pageUrl = iteratorPages.next();
			String directoryPath = PageUrlToDirectoryPathConverter.convertPageUrlToDirectoryPath(pageUrl);
			directoryPath = "downloadedImages/" + directoryPath;
			DirectoryCreator.createDirectories(directoryPath);
			String[] imageUrls = ImagesFromUrlReader.getImageUrls(pageUrl);

			for (int i = 0; i < imageUrls.length; i++) {
				ImageDownloader.downloadImageToPath(imageUrls[i], directoryPath, "Image" + i + ".jpg");
			}
		}
	}
}
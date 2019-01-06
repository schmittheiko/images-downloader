package Utility;

public class PageUrlToDirectoryPathConverter {

	// converts the url of a page to a directory path
	// e.g. https://on-the-bike.eu/about-me/ to about-me/
	public static String convertPageUrlToDirectoryPath(String pageUrl) {
		String directoryPath = "";
		directoryPath = pageUrl.substring(pageUrl.indexOf("/", 8) + 1);

		// check if question mark is included
		// e.g. category/learning/page/2/?lang=de
		if (directoryPath.contains("?")) {
			directoryPath = directoryPath.substring(0, directoryPath.indexOf("?"));
		}

		return directoryPath;
	}

}

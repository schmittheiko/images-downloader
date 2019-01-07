package Utility;

public class ImageTypeExtractor {

	public static String getImageType(String url) {
		String imageFormat = url.substring(url.length() - 3);
		return imageFormat;
	}

}

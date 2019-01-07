package Utility;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class ImageDownloader {

	public static void downloadImage(String urlInput, String imageName) throws Exception {

		URL url = new URL(urlInput);
		InputStream in = new BufferedInputStream(url.openStream());
		OutputStream out = new BufferedOutputStream(new FileOutputStream(imageName));

		for (int i; (i = in.read()) != -1;) {
			out.write(i);
		}
		in.close();
		out.close();
	}

	public static void downloadImageToPath(String urlInput, String pathDownloadedImage, String imageName)
			throws Exception {

		URL url = new URL(urlInput);
		InputStream in = new BufferedInputStream(url.openStream());
		OutputStream out = new BufferedOutputStream(new FileOutputStream(new File(pathDownloadedImage, imageName)));

		for (int i; (i = in.read()) != -1;) {
			out.write(i);
		}
		in.close();
		out.close();

		System.out.println(imageName + " has been downloaded to " + pathDownloadedImage);
	}

	public static void downloadImageToPath(String urlInput, String pathDownloadedImage, String imageName,
			String imageFormat) throws Exception {
		downloadImageToPath(urlInput, pathDownloadedImage, imageName + "." + imageFormat);
	}

}

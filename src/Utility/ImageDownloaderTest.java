package Utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImageDownloaderTest {

	@Test
	void testDownloadImage() {
		try {
			ImageDownloader.downloadImage(
					"https://on-the-bike.eu/wp-content/uploads/2018/05/img-20180529-wa0018228974493.jpg",
					"Image001.jpg");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testDownloadImageToPathWithoutFormatParameter() {
		try {
			String path="downloadedImages";
			
			ImageDownloader.downloadImageToPath(
					"https://on-the-bike.eu/wp-content/uploads/2018/05/img-20180529-wa0018228974493.jpg",
					path,"Image001.jpg");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testDownloadImageToPathWithFormatParameter() {
		try {
			String path="downloadedImages";
			
			ImageDownloader.downloadImageToPath(
					"https://storage.googleapis.com/nc-public/hcp/cms-content/2018/07/45342acc-brains.svg",
					path,"Image001","svg");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}		
	
	

}

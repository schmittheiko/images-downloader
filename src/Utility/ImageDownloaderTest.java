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

}

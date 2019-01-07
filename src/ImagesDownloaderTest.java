import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImagesDownloaderTest {

	@Test
	void testDownloadImagesFromOnTheBike() {
		try {
			ImagesDownloader.downloadImages("https://on-the-bike.eu");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testDownloadImagesFromNaturalCycles() {
		try {
			ImagesDownloader.downloadImages("https://www.naturalcycles.com");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
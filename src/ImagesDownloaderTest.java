import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImagesDownloaderTest {

	@Test
	void testDownloadImages() {
		try {
			ImagesDownloader.downloadImages("https://on-the-bike.eu");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
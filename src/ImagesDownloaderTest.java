import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import Utility.DirectoryCreator;

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
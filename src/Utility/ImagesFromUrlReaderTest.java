package Utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImagesFromUrlReaderTest {

	@Test
	void testGetImageUrls() {
		try {
			ImagesFromUrlReader.getImageUrls("https://on-the-bike.eu/about-me");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
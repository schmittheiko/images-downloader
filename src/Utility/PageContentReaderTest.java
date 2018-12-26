package Utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PageContentReaderTest {

	@Test
	void testGetPageContent() {
		try {
			PageContentReader.getPageContent("https://on-the-bike.eu");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}

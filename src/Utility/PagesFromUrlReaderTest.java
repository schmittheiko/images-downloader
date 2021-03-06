package Utility;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class PagesFromUrlReaderTest {

	@Test
	void testGetAllPagesFromUrl1() {
		try {
			HashSet<String> pages = new HashSet<String>();
			assertEquals(6, (PagesFromUrlReader.getAllPagesFromUrl("https://on-the-bike.eu", pages).size()));

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	void testGetAllPagesFromUrl2() {
		try {
			HashSet<String> pages = new HashSet<String>();
			assertEquals(6, (PagesFromUrlReader.getAllPagesFromUrl("https://www.naturalcycles.com", pages).size()));

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	void testGetAllPagesFromUrl3() {
		try {
			HashSet<String> pages = new HashSet<String>();
			pages= PagesFromUrlReader.getAllPagesFromUrl("https://on-the-bike.eu", pages);
			assertFalse(pages.contains("https://on-the-bike.eu/") && pages.contains("https://on-the-bike.eu"));

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}	
	
}

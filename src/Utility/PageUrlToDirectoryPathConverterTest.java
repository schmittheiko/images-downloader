package Utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PageUrlToDirectoryPathConverterTest {

	@Test
	void testConvertPageUrlToDirectoryPath() {
		String pageUrl = "https://on-the-bike.eu/about-me/";
		String expectedDirectoryPath = "about-me/";
		assertEquals(expectedDirectoryPath, PageUrlToDirectoryPathConverter.convertPageUrlToDirectoryPath(pageUrl));
	}
	
	@Test
	void testConvertPageUrlToDirectoryPath2() {
		String pageUrl = "https://www.test.de/meintest/merkliste/";
		String expectedDirectoryPath = "meintest/merkliste/";
		assertEquals(expectedDirectoryPath, PageUrlToDirectoryPathConverter.convertPageUrlToDirectoryPath(pageUrl));
	}
	
	@Test
	void testConvertPageUrlToDirectoryPath3() {
		String pageUrl = "http://www.naturalcycles.com/en";
		String expectedDirectoryPath = "en";
		assertEquals(expectedDirectoryPath, PageUrlToDirectoryPathConverter.convertPageUrlToDirectoryPath(pageUrl));
	}	

	@Test
	void testConvertPageUrlToDirectoryPath4() {
		String pageUrl = "https://on-the-bike.eu/category/learning/page/2/?lang=de";
		String expectedDirectoryPath = "category/learning/page/2/";
		assertEquals(expectedDirectoryPath, PageUrlToDirectoryPathConverter.convertPageUrlToDirectoryPath(pageUrl));
	}
	
	
	
}

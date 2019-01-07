package Utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImageTypeExtractorTest {

	@Test
	public void testGetImageFormat() {
		String imageUrl="https://storage.googleapis.com/nc-public/hcp/cms-content/2018/07/45342acc-brains.svg";
		String expectedImageFormat="svg";
		assertEquals(expectedImageFormat,ImageTypeExtractor.getImageType(imageUrl));
	}

}

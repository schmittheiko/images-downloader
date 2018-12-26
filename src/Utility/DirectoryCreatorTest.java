package Utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DirectoryCreatorTest {

	@Test
	void testCreateDirectories() {
		try {
			String[] paths = { "downloadedImages/d1/d1a", "downloadedImages/d1/d1b", "downloadedImages" };
			DirectoryCreator.createDirectories(paths);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
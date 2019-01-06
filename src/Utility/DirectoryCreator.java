package Utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryCreator {

	public static void createDirectories(String[] paths) throws IOException {

		for (int i = 0; i < paths.length; i++) {
			// example for a path: /path/to/directory
			System.out.println("going to create the following directory: " + paths[i]);
			Files.createDirectories(Paths.get(paths[i]));
		}
	}

	public static void createDirectories(String pageUrl) throws IOException {
		createDirectories(new String[] { pageUrl });
	}
}
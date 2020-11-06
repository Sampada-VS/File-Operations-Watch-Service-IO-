package com.bridgelabz.javaio;

import java.io.File;

public class FileUtils {
	public static boolean deleteFiles(File contentstoDelete) {
		File[] allContents = contentstoDelete.listFiles();
		if (allContents != null) {
			for (File file : allContents)
				deleteFiles(file);
		}
		return contentstoDelete.delete();
	}
}

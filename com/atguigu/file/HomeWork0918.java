package com.atguigu.file;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class HomeWork0918 {
	public static void main(String[] args) {

		listAllFilesByPath("C:\\apache-maven-3.6.3");
	}

	public static void listAllFilesByPath(String path) {
		File dirPath = new File(path);
		File[] listFiles = dirPath.listFiles();
		for (File file : listFiles) {
			if (file.isFile()) {
				System.out.println(file.getAbsolutePath());
			} else {
				listAllFilesByPath(file.getAbsolutePath());
			}
		}
	}

	public static void listAllFilesByPath2(String path) {

		Queue<File> files = new LinkedList<File>();

	}
}

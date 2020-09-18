package com.atguigu.file;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/JMPX");
		f.mkdirs();// 创建文件夹
		File ff = new File(f, "HelloWorld.txt");
		ff.createNewFile();// 创建文件
		File f1 = new File("C:/JMPX/Copy");
		f1.mkdirs();// 创建文件夹 以备后面讲文件复制用
	}
}

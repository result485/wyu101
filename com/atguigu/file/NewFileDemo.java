package com.atguigu.file;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/JMPX");
		f.mkdirs();// �����ļ���
		File ff = new File(f, "HelloWorld.txt");
		ff.createNewFile();// �����ļ�
		File f1 = new File("C:/JMPX/Copy");
		f1.mkdirs();// �����ļ��� �Ա����潲�ļ�������
	}
}

package com.atguigu.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class DownLoad {
	public static void main(String[] args) throws IOException {
		// http://pic1.win4000.com/pic/1/5c/b19b23087f.jpg
		SocketChannel socketChannel = SocketChannel.open();

		socketChannel.connect(new InetSocketAddress("http://pic1.win4000.com/pic/1/5c/b19b23087f.jpg", 80));
		ByteBuffer buf = ByteBuffer.allocate(1024 * 10);

		int bytesRead = socketChannel.read(buf);
		File file = new File("D:\\ÎÒµÄÎÄµµ\\Documents\\Downloads");
		OutputStream outputStream = new FileOutputStream(file);
		buf.flip();

		while (buf.hasRemaining()) {
			System.out.print((char) buf.get());
		}
		socketChannel.close();

	}
}

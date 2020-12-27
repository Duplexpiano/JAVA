package three;

import java.io.*;

public class Viewer {
	private String filePath; // 文件路径

	public Viewer() {

	}

	public Viewer(String filePath) {
		this.filePath = filePath;
	}

	public void view() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
		byte[] bytes = new byte[16];
		int count = 1, row = 0;
		System.out.format("%010x  ", (row) * 16); // 当前行首字节地址以16进制输出
		bytes[0] = raf.readByte();
		while (raf.getFilePointer() < raf.length()) {

			bytes[count % 16] = raf.readByte();

			if (count % 16 == 0 && count != 0) {

				System.out.format("%02x", bytes[count % 16]);
				String str = new String(bytes, 0, 16, "UTF-8").replaceAll("\r", ".");// 替换所有'\r'为'.'
				str = str.replaceAll("\n", ".");// 替换所有'\n'为'.'
				System.out.println("  " + str);
				System.out.format("%010x  ", (++row) * 16);

			} else if (count == raf.length() - 1) { // 读取到最后一个字符时

				System.out.format("%02x", bytes[count % 16]);
				String str = new String(bytes, 0, count % 16 + 1, "UTF-8").replaceAll("\r", ".");// 替换所有'\r'为'.'
				str = str.replaceAll("\n", ".");// 替换所有'\n'为'.'

				if (count % 16 < 8) { // 若此行小于等于8个字符，填充空格至ASCII码表示与前行对其

					for (int i = 0; i < (16 - count % 16) * 3 + 3; i++) {
						System.out.print(" ");
					}
					System.out.println(str);

				} else { // 若此行大于8个字符，填充空格至ASCII码表示与前行对其

					for (int i = 0; i < (16 - count % 16) * 3 + 2; i++) {
						System.out.print(" ");
					}
					System.out.println(str);

				}

			} else {

				System.out.format("%02x", bytes[count % 16]); // 十六进制输出
				if (count % 8 == 0 && count != 0) { // 每八个byte空俩格，否之空一格+
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}

			}

			count++;
		}

		raf.close();
	}

	public String getFile() {
		return filePath;
	}

	public void setFile(String filePath) {
		this.filePath = filePath;
	}
}

package FileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D:\\test\\note.txt"); // 创建 FileReader 对象
			br = new BufferedReader(fr); // 创建 BufferedReader 对象

			System.out.println("D:\\test\\note.txt 文件中的内容如下：");
			String strLine = "";
			while ((strLine = br.readLine()) != null) { // 循环读取每行数据
				System.out.println(strLine);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close(); // 关闭 FileReader
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
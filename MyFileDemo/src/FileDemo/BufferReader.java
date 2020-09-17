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
			fr = new FileReader("D:\\test\\note.txt"); // ���� FileReader ����
			br = new BufferedReader(fr); // ���� BufferedReader ����

			System.out.println("D:\\test\\note.txt �ļ��е��������£�");
			String strLine = "";
			while ((strLine = br.readLine()) != null) { // ѭ����ȡÿ������
				System.out.println(strLine);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close(); // �ر� FileReader
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
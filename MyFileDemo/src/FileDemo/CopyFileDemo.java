package FileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	private static void CopyFile(String fileSrc, String fileDes) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputStream = new FileInputStream(fileSrc);
		File file = new File(fileDes);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = inputStream.read(buffer)) != -1) {
			for (int i = 0; i < c; i++) {
				out.write(buffer[i]);
			}
			inputStream.close();
			out.close();
		}
	}

	public static void main(String[] args) throws IOException {
		String fileSrc = "D:\\test\\myfile.txt";
		String fileDes = "D:\\test\\myfile_cp.txt";
		CopyFile(fileSrc, fileDes);// 调用文件复制方法
		System.out.println("文件复制成功");
	}
//	文件复制方法

}

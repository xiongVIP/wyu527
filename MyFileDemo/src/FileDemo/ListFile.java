package FileDemo;

import java.io.File;

public class ListFile {
	public static void main(String[] args) throws Exception {
		// �ݹ���ʾĿ¼�������ļ��м������ļ�
		File root = new File("D:\\");
		showAllFiles(root);
	}

	final static void showAllFiles(File dir) throws Exception {
		File[] fs = dir.listFiles();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getAbsolutePath());
			if (fs[i].isDirectory()) {
				try {
					showAllFiles(fs[i]);
				} catch (Exception e) {
				}
			}
		}
	}

}

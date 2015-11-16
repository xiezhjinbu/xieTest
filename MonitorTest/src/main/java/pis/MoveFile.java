package pis;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class MoveFile {
	public static void copyFile(File parentDir,File targetDir) throws IOException {

		if (parentDir.isDirectory()) {
			// 如果是目录，获取所有子项
			File[] subs = parentDir.listFiles();
			// 遍历子目录集，使用递归处理子目录集中的项
			for (File sub : subs) {
				copyFile(sub,targetDir);
			}
		} else {
			try {
				//移动文件至目标地址，并删除
				FileUtils.moveToDirectory(parentDir, targetDir,true);
				//FileUtils.deleteQuietly(parentDir);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package pis;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationObserver;

public class ListenerPis extends FileAlterationListenerAdaptor {

	private File targetDir;
	
	public File getTargetDir() {
		return targetDir;
	}

	public void setTargetDir(File targetDir) {
		this.targetDir = targetDir;
	}

	public ListenerPis(File targetDir) {
		super();
		this.targetDir = targetDir;
	}

	@Override
	public void onStart(FileAlterationObserver observer) {
		// TODO Auto-generated method stub
		super.onStart(observer);
		System.out.println("monitor start scan files..");
	}

	@Override
	public void onDirectoryCreate(File directory) {
		// TODO Auto-generated method stub
		super.onDirectoryCreate(directory);
		System.out.println("Directory has been created..");
	}

	@Override
	public void onDirectoryChange(File directory) {
		// TODO Auto-generated method stub
		super.onDirectoryChange(directory);
		System.out.println("Directory has been changed..");
	}

	@Override
	public void onDirectoryDelete(File directory) {
		// TODO Auto-generated method stub
		super.onDirectoryDelete(directory);
		System.out.println("Directory has been deleted..");
	}

	@Override
	public void onFileCreate(File file) {
		// TODO Auto-generated method stub
		super.onFileCreate(file);
		System.out.println(file.getName() + "被创建");
		try {
			MoveFile.copyFile(file,targetDir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onFileChange(File file) {
		// TODO Auto-generated method stub
		super.onFileChange(file);
		System.out.println(file.getName() + "被修改");
	}

	@Override
	public void onFileDelete(File file) {
		// TODO Auto-generated method stub
		super.onFileDelete(file);
		System.out.println(file.getName() + "被删除");
	}

	@Override
	public void onStop(FileAlterationObserver observer) {
		// TODO Auto-generated method stub
		super.onStop(observer);
		System.out.println("monitor stop scanning..");
	}

}

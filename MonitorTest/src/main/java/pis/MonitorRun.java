package pis;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

public class MonitorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			File parentDir = FileUtils.getFile("D:\\sendfail");
			File targetDir=FileUtils.getFile("E:\\send");

			FileAlterationObserver observer=new FileAlterationObserver(parentDir);
		
			ListenerPis listener = new ListenerPis(targetDir);
			
			observer.addListener(listener);
			
			FileAlterationMonitor monitor = new FileAlterationMonitor(5000,observer);
		
			monitor.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

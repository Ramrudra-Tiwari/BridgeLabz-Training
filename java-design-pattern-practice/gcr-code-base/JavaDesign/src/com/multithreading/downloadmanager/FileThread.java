
package com.multithreading.downloadmanager;

public class FileThread implements Runnable{
	
	FileDownloader filedownloader;
	
	public FileThread(FileDownloader f) {
		this.filedownloader = f;
	}
	
	@Override
	public void run() {
		filedownloader.download();
	}
}

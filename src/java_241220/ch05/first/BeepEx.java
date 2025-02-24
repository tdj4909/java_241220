package java_241220.ch05.first;

import java.awt.Toolkit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BeepEx {
	
	public static void main(String[] args) {
		
		Runnable runnable = new BeepPrintRunnable();
		Thread thread = new Thread(runnable);
		
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("12");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

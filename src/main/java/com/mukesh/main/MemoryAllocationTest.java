package com.mukesh.main;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{

	static final int MB = 1024 * 1024;
	@Override
	public void run() {
		 byte[] a1 = new byte[2 * MB];
         a1[1] = 1;
		 Runtime runtime = Runtime.getRuntime();
         System.out.print("total :" + (runtime.totalMemory() / 1024)+ " KB\n");
         long free = runtime.freeMemory() / 1024;
         System.out.print("free:" + free+ " KB\n");
              
	}
}

public class MemoryAllocationTest {
	static public void main(String[] arg){
		    Timer timer = new Timer();
		    timer.schedule(new MyTask(), 1, 1);
		   
		    
		}
	}
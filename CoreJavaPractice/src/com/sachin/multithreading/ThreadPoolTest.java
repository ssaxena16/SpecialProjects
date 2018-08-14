package com.sachin.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Task("task1");
		Runnable r2 = new Task("task2");
		Runnable r3 = new Task("task3");
		Runnable r4 = new Task("task4");
		Runnable r5 = new Task("task5");
		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);

		pool.shutdown();

	}

}

class Task implements Runnable {
	String name;

	Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				System.out.println("Date is " + name + "  " + sdf.format(d));
			} else {
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				System.out.println("Date is " + name + "  " + sdf.format(d));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
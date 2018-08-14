package com.sachin.multithreading;

public class SyncronizedMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RailWayLine line = new RailWayLine();
		Train train1 = new Train(line);
		Train train2 = new Train(line);
		train1.start();
		train2.start();

	}

}

class RailWayLine
{
	public synchronized void getLine()
	{
		for (int i = 1; i <= 2; i++) {
			System.out.println("Line: " + i);

		}
	}
}

class Train extends Thread {
	RailWayLine line;

	public Train(RailWayLine line) {
		// TODO Auto-generated constructor stub
		this.line = line;
	}

	public void run() {
		line.getLine();
	}
}
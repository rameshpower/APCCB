package com.apccb.VO;

public class UserThread {
	public static void main(String[] args) {
		new DaemonThread("T1");
		new DaemonThread("T2");
		new DaemonThread("T3");
		
		for(int i=0;i<10;i++){
			System.out.println("MAIN:"+i);
		}
		/*Thread t = new Thread(new DaemonThread(525.00f, 0.09f));
		t.setDaemon(true);
		t.start();
		try {
			Thread.sleep(250); // must give the deamon thread a chance to run!
		} catch (InterruptedException ei) { // 250 mills might not be enough!
			System.err.println(ei);
		}*/
	}
}

class DaemonThread implements Runnable {
	Thread t;
	DaemonThread(String name){
		t =new Thread(this,name);
		System.out.println("Created Thread:"+t.getName());
		t.start();
	}
	
	
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(t.getName()+":Thread Details:"+i);
			try {
				t.join(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*private float principal;

	private float futureval;

	private float rate;

	private float i;
*/
	/*public DaemonThread(float principal, float rate) {
		this.principal = principal;
		this.rate = rate;
	}

	public void run() {
		for (int year = 0; year <= 75; year++) {
			i = (1 + rate);
			futureval = principal * (float) Math.pow(i, year);
			System.out.print(principal + " compounded after " + year
					+ " years @ " + rate + "% = " + futureval);
			System.out.println();
		}
	}*/
}

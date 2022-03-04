package controller;

public class threadID extends Thread {
	
	private int idThread;
	
	public threadID(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		//só é executado o que ta aqui dentro
		System.out.println(getId());
	}
}

package view;

import controller.threadID;

public class Principal {

	public static void main(String[] args) {
		
		for (int idThread = 0 ; idThread <5 ; idThread++) {
			Thread TID = new threadID(idThread);
			TID.start();
		}

	}

}

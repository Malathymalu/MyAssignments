package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
	System.out.println("The Desktop Size is - " + "32 inches");	

	}

	public static void main(String[] args) {
	Desktop dk = new Desktop();
	dk.desktopSize();
	dk.computerModel();

	}

}

package com.abstraction;

public class PrinterMainMethod {
	public static void main(String[] args) {
		Printer Ink = new InkjetPrinter();
		Printer Laser = new LaserPrinter();
		
		Ink.print();
		Laser.print();
	}
}

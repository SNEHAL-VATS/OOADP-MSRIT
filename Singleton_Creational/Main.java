package Singleton_Creational;

public class Main {
	public static void main(String args[]) {
		HistoryTab ht1=HistoryTab.getInstance();
		HistoryTab ht2=HistoryTab.getInstance();
		ht1.addURL("www.github.com");
		ht1.addURL("www.instagram.com");
		ht1.addURL("www.msrit.edu");
		ht2.addURL("www.google.com");
		ht2.addURL("www.facebook.com");
		ht1.addURL("www.google.com");
		HistoryTab ht3=HistoryTab.getInstance();
		System.out.print("The history are as follows\n\n");
		ht3.showURL();
	}

}

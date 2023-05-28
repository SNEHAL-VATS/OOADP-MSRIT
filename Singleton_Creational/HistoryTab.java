package Singleton_Creational;
import java.util.*;
public class HistoryTab {
	public static HistoryTab ht;
	ArrayList<String> urls;
	
	HistoryTab(){
		urls = new ArrayList<String>();
	}
		
	public static HistoryTab getInstance() {
		if(ht==null) {
			ht=new HistoryTab();		
		}
		return ht;
	}
	public void addURL(String s) {
		urls.add(s);
		
	}
	public void showURL() {
		for (String u:urls) {
			System.out.println(u);
		}
	}
}

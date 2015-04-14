package lab11;

import java.util.HashMap;

public class Dictionary {
	private HashMap<String, String> words;
	
	public Dictionary() {
		this.words = new HashMap<String, String>();
		this.words.put("start", "run");
		this.words.put("aloita", "run");
		this.words.put("execute", "run");
		this.words.put("run", "run");
		this.words.put("quit", "quit");
		this.words.put("valmis", "quit");
		this.words.put("lopeta", "quit");
	}
	
	public String synonymFor(String s) {
		System.out.println("Finding mapping for " + s);
		return this.words.get(s);
	}
}

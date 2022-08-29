package org.all;

import org.english.English;

public class Language extends English {
	public void allLanguage() {
		System.out.println("all languages");
	}
	
	public static void main(String[] args) {
		Language language = new Language();
		language.allLanguage();
		language.tamilLanguage();
		language.englishLaguage();
		language.telguLanguage();
	}

}

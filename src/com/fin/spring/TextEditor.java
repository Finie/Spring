package com.fin.spring;

public class TextEditor {

	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Checker has been injected...");
		this.spellChecker = spellChecker;
	}

	public void checkSpelling() {
		spellChecker.spellChecking();
	}

}

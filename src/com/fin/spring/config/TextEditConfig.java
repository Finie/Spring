package com.fin.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fin.spring.SpellChecker;
import com.fin.spring.TextEditor;

@Configuration
public class TextEditConfig {

	@Bean
	public TextEditor textEditor() {
		
		return new TextEditor(spellChecker());
	}

	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}

	
}

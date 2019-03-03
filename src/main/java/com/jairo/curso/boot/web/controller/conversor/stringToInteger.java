package com.jairo.curso.boot.web.controller.conversor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class stringToInteger implements Converter<String, Integer> {

	@Override
	public Integer convert(String text) {
		text = text.trim();

		if (text.matches("[0-9]+")) {
			return Integer.valueOf(text);
		}
		
		return null;
	}

}

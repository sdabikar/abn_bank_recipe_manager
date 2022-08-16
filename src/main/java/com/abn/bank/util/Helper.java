package com.abn.bank.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.data.jpa.domain.Specification;

import com.abn.bank.model.Recipe;
import com.abn.bank.queryspec.RecipeSpecificationBuilder;

public class Helper {
	
	public static Specification<Recipe> buildQuery(String fields) {
		
		RecipeSpecificationBuilder builder = new RecipeSpecificationBuilder();
		Pattern pattern = Pattern.compile("(\\w+?)(:|>|<|!:)(\\w+?),");
		Matcher matcher = pattern.matcher(fields + ",");
		while (matcher.find()) {
			builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
			System.out.println(matcher.group(1) + "  " + matcher.group(2) + "  " + matcher.group(3));
		}
		
		return builder.build();
		
	}

}

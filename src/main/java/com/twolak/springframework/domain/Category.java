package com.twolak.springframework.domain;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * @author twolak
 *
 */
@Getter
@Setter
public class Category {
	private String id;
	private String description;
	private Set<Recipe> recipes = new HashSet<>();
}

/**
 * 
 */
package com.twolak.springframework.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author twolak
 *
 */
@Getter
@Setter
@EqualsAndHashCode
public class Notes {
	private String id;
	@EqualsAndHashCode.Exclude
	private Recipe recipe;
	private String note;
}

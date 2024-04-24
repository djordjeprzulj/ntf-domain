package edu.ftn.iis.soas.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Template {

	private Long id;
	private String name;
	private String text;
	private List<Parameter> parameters;
	
}

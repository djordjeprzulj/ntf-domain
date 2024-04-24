package edu.ftn.iis.soas.domain.model;

import java.sql.Timestamp;

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
public class Notification {

	private Timestamp timestamp;
	private String source;
	private String destination;
	private String channel;
	private String payload;
	
}

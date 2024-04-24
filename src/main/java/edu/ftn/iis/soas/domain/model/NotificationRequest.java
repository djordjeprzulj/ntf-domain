package edu.ftn.iis.soas.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class NotificationRequest {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notification_sequence")
    @SequenceGenerator(name = "notification_sequence", 
				    	sequenceName = "notification_sequence", 
				    	allocationSize = 1)
    private Long id;
	
	@Column(nullable=false)
	private String source;
	
	@Column(nullable=false)
	private String destinations;
	
	@Column(nullable=false)
	private String channel;
	
	// private Template template;
	private String text;
	private Integer priority;
	
}

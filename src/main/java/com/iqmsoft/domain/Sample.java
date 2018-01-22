package com.iqmsoft.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sample {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String text;
	private boolean completed;

	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Sample() {
	}

	
	
	
	public Sample(Long id, String text, boolean completed, int value) {
		super();
		this.id = id;
		this.text = text;
		this.completed = completed;
		this.value = value;
	}
	
	public Sample(String text, boolean completed, int value) {
	
		this.text = text;
		this.completed = completed;
		this.value = value;
	}
	
	
	public Sample(Long id, String text, boolean completed) {
		super();
		this.id = id;
		this.text = text;
		this.completed = completed;
	}

	public Sample(String text, boolean completed) {
		super();
		this.text = text;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}

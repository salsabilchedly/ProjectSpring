package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "client")
public class client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private client name;
	public client() {
	}
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	 
}

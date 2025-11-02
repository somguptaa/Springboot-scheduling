package com.som.model;


import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	
	private int id;
	private String name;

}

package com.example.springcloudstream.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
	private Long id;
	private String name;
}

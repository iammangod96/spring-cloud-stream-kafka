package com.example.springcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringcloudstreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudstreamApplication.class, args);
	}

}

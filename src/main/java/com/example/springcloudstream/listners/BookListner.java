package com.example.springcloudstream.listners;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.example.springcloudstream.beans.Book;
import com.example.springcloudstream.streams.BookStreams;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class BookListner {

	@StreamListener(BookStreams.INPUT)
	public void handle(@Payload Book book) {
		log.info("Received: " + book);
	}

}

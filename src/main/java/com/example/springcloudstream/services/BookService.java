package com.example.springcloudstream.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.example.springcloudstream.beans.Book;
import com.example.springcloudstream.streams.BookStreams;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BookService {

	@Autowired
	private BookStreams bookStreams;

	public void sendMessage(final Book book) {
		log.info("Sending message: " + book);

		MessageChannel channel = bookStreams.outboundChannel();
		channel.send(MessageBuilder.withPayload(book)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
	}

}

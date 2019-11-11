package com.example.springcloudstream.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface BookStreams {

	final String INPUT = "stream-in";
	final String OUTPUT = "stream-out";

	@Input(INPUT)
	SubscribableChannel inbouChannel();

	@Output(OUTPUT)
	MessageChannel outboundChannel();

}

package com.example.springcloudstream.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.example.springcloudstream.streams.BookStreams;

@EnableBinding(BookStreams.class)
public class SteamsConfiguration {

}

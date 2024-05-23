package com.cbank.server.bootstrap;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CloudStater {

	@EventListener(ApplicationReadyEvent.class)
	public void cloudStaterbootStrap() {
		log.info("**********************************************");
		log.info("**********************************************");
		log.info("********* SPRING CLOUD CONFIG SERVER *********");
		log.info("**********************************************");
		log.info("**********************************************");
	}
}

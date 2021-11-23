package com.cloud.domainprocessor.service;

import com.cloud.domainprocessor.model.WebDomain;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Slf4j
@Configuration
@EnableAutoConfiguration
public class WebDomainKafkaService {

    @Bean
    public Function<KStream<String, WebDomain>, KStream<String, WebDomain>> domainProcessor() {

        return inputStream -> inputStream
                .filter((key, wb) -> {
                    if(wb.isDead())
                        log.info("inactive domain: {}", wb);
                    else
                        log.info("active domain: {}", wb);
                    return !wb.isDead();
                });
    }
}

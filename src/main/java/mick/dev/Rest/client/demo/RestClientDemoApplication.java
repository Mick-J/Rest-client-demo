package mick.dev.Rest.client.demo;

import mick.dev.Rest.client.demo.client.JsonPlaceholderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpExchangeAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class RestClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientDemoApplication.class, args);
	}

}

package proxy.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayApplication.class, args);
	}
	@Bean
	DiscoveryClientRouteDefinitionLocator routesDynamique(ReactiveDiscoveryClient rdc,
	DiscoveryLocatorProperties dlp){
	return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
	}

}

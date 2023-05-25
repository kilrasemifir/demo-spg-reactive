package fr.kira.formation.spring.demoreactive;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@SpringBootApplication
public class DemoReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoReactiveApplication.class, args);
	}

	public static void flux(){
		Flux<String> flux = Flux.just("a","b","c");
		flux = flux.delayElements(Duration.ofSeconds(2));

		flux = flux.map(val->val.toUpperCase());

		flux.subscribe(System.out::println);

	}

	public static void mono(){
		Mono<String> mono = Mono.just("Dans le mono"); // String val = "Hello";
		mono = mono.delayElement(Duration.ofSeconds(2));

		mono = mono.map(val->{
			System.out.println("Dans le map");
			return val.toUpperCase();
		});

		System.out.println("Avant le print du mono");
		System.out.println(mono.block());
		System.out.println("Apres le print du mono");
		try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}

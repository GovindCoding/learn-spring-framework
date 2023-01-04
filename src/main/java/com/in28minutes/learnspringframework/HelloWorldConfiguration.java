package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor,
//equals, hashcode and toString are automatically created.
//Released in JDK 16
record Person(String name, int age, Address address) {
};

// Address - firstline & city
record Address(String firstline, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Govind";
	}

	@Bean
	public int age() {
		return 27;
	}

	@Bean
	public Person person() {
		var person = new Person("Ranga", 24, new Address("Main Street", "Utrecht"));
		return person;
	}

	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address()); // name, age
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { //name, age, address2
		var person = new Person(name, age, address3); // name, age
		return person;
	}

	@Bean(name = "address2")
	public Address address() {
		var address = new Address("C-308, Gaikwad Miro", "Pune");
		return address;
	}
	
	@Bean(name = "address3")
	public Address address3() {
		var address = new Address("Motinagar", "Hydrabad");
		return address;
	}
}

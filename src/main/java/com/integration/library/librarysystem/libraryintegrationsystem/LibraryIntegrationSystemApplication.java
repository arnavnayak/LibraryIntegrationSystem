package com.integration.library.librarysystem.libraryintegrationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.integration.library.librarysystem.libraryintegrationsystem")
public class LibraryIntegrationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryIntegrationSystemApplication.class, args);
	}

}

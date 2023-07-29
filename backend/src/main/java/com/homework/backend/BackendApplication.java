package com.homework.backend;

import com.homework.backend.Entity.Address;
import com.homework.backend.Entity.Category;
import com.homework.backend.Repository.AddressRepository;
import com.homework.backend.Repository.CategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(BackendApplication.class,args);
		AddressRepository addressRepository = configurableApplicationContext.getBean(AddressRepository.class);
		CategoryRepository categoryRepository = configurableApplicationContext.getBean(CategoryRepository.class);

		Address address = new Address();
		Category category = new Category();

		categoryRepository.save(category);
		addressRepository.save(address);

	}
}

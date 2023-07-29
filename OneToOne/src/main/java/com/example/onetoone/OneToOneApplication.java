package com.example.onetoone;

import com.example.onetoone.model.Car;
import com.example.onetoone.model.Onwer;
import com.example.onetoone.repository.CarRepository;
import com.example.onetoone.repository.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class OneToOneApplication {
	private static final Logger log = LoggerFactory.getLogger(OneToOneApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OneToOneApplication.class,args);
		CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
		OwnerRepository ownerRepository = configurableApplicationContext.getBean(OwnerRepository.class);
		Car car = new Car("n200");
		carRepository.save(car);
		Onwer onwer = new Onwer("John Doe");
		onwer.setCar(car);
		ownerRepository.save(onwer);

		Optional<Car> optionalCar = carRepository.findById(1L);
		Optional<Onwer> optionalOnwer = ownerRepository.findById(1L);

		if(optionalCar.isPresent() && optionalOnwer.isPresent()) {
			log.info(optionalCar.get() + "is owned by: " +optionalCar.get().getOnwer());
			log.info(optionalOnwer.get() + "has a car: " +optionalOnwer.get().getCar());
		}
	}

}

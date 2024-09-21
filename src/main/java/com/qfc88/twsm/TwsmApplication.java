package com.qfc88.twsm;

import com.qfc88.twsm.models.ApplicationUser;
import com.qfc88.twsm.repositories.RoleRepository;
import com.qfc88.twsm.repositories.UserRepository;
import com.qfc88.twsm.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.qfc88.twsm.models.Role;

import java.util.HashSet;

@SpringBootApplication
public class TwsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwsmApplication.class, args);
	}

	@Bean
	CommandLineRunner run(
			RoleRepository roleRepo, UserService userService){
		return args -> {
			roleRepo.save(new Role(1, "USER"));
			ApplicationUser u = new ApplicationUser();

			u.setFirstName("Unknown");
			u.setLastName("Vietnam");

			userService.registerUser(u);
		};
	}
}

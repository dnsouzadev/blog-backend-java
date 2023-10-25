package com.dnsouzade.api.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnsouzade.api.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public List<User> findAll() {
		User maria = new User("1", "Maria Silva", "maria@maria.com");
		User alex = new User("2", "Alex Silva", "alex@maria.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return list;
		
	}
}

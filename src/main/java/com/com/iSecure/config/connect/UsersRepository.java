package com.com.iSecure.config.connect;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	Optional<Users> findByName(String username);

}

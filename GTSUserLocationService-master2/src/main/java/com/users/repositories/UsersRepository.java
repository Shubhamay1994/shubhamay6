package com.users.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.users.model.Users;

@Repository
public interface UsersRepository extends PagingAndSortingRepository<Users, String>{

    Users findByTcontactno(String tcontactno);
	
	@Query(value = "select * from users where tcontactno=:f2", nativeQuery = true)
	Users findByTcontactno(@Param("f2") Long f1);
	
	//
}

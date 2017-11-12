package com.example.fakeapi;

import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.springframework.data.repository.PagingAndSortingRepository;


@Repository
@Transactional
public interface UserRepository extends PagingAndSortingRepository<UserDetails,Integer> {
	
}

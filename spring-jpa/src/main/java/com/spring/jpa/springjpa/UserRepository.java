package com.spring.jpa.springjpa;

import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserRecord, String>
{
}
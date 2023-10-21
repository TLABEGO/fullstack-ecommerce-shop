package com.shopme.admin.user;

import com.shopme.common.Entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

}

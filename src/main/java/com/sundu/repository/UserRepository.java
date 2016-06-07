package com.sundu.repository;

import com.sundu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sundu on 6/7/16.
 */

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}

package org.dream.firstAPI.Repo;

import org.dream.firstAPI.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

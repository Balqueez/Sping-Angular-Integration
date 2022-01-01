package com.ust.last.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ust.last.Model.User;



	@Repository
	public interface userRepository extends JpaRepository<User, String>{
		


	}





package myfirstproject.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myfirstproject.myfirstproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

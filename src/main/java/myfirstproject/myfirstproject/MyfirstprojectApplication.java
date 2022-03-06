package myfirstproject.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myfirstproject.myfirstproject.entities.Category;
import myfirstproject.myfirstproject.repositories.CategoryRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat = new Category(1L,"Eletronics");
		Category cat2 = new Category(2L,"Books");
		Category cat3 = new Category(3L,"Eletrodomesticos");
		Category cat4 = new Category(4L,"Vestuario");
		categoryRepository.save(cat);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		categoryRepository.save(cat4);

		
	}

}

package myfirstproject.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myfirstproject.myfirstproject.entities.Category;
import myfirstproject.myfirstproject.entities.Product;
import myfirstproject.myfirstproject.repositories.CategoryRepository;
import myfirstproject.myfirstproject.repositories.ProductRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat = new Category(null,"Eletronics");
		Category cat2 = new Category(null,"Books");
		Category cat3 = new Category(null,"Eletrodomesticos");
		Category cat4 = new Category(null,"Vestuario");
		
		Product p1 = new Product(null, "Playstation 5", 5434.99, cat);
		Product p2 = new Product(null, "Notebook acer IUO1232", 1234.99, cat);
		Product p3 = new Product(null, "Como fazer amigos e influenciar pessoas", 25.99, cat2);
		Product p4 = new Product(null, "A lógica do cisne negro", 34.99, cat2);
		Product p5 = new Product(null, "Geladeira frost free", 734.99, cat3);
		Product p6 = new Product(null, "Microondas eletrolux", 834.99, cat3);
		Product p7 = new Product(null, "Camiseta simples azul", 43.99, cat4);
		Product p8 = new Product(null, "Calça jeans slim", 54.99, cat4);
		cat.getProducts().addAll(Arrays.asList(p1,p2));
		cat2.getProducts().addAll(Arrays.asList(p3,p4));
		cat3.getProducts().addAll(Arrays.asList(p5,p6));
		cat4.getProducts().addAll(Arrays.asList(p7,p8));

		categoryRepository.save(cat);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		categoryRepository.save(cat4);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);
		productRepository.save(p7);
		productRepository.save(p8);

		

		
	}

}

package ss;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ss.dao.ProductRepository;
import ss.model.Product;

@SpringBootApplication
public class SsservicedemoApplication {
	
	@Autowired 
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SsservicedemoApplication.class, args);
	}
	
	@PostConstruct
	
	public void init(){
		List<Product> objLst= new ArrayList<>();
		
		Product obj = new Product();
		obj.setId(new Long(101));
		obj.setProductName("Asian Paints");
		obj.setManfName("Asian");
		objLst.add(obj);
		
		obj = new Product();
		obj.setId(new Long(102));
		obj.setProductName("Audi Car");
		obj.setManfName("Audi");
		objLst.add(obj);
		
		obj = new Product();
		obj.setId(new Long(103));
		obj.setProductName("Stationary");
		obj.setManfName("Reliance");
		objLst.add(obj);
		
		//productRepository.save(obj);
		productRepository.save(objLst);
	}
	
}

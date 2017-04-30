/**
 * 
 */
package ss;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.dao.ProductRepository;
import ss.model.Product;

/**
 * @author ArpitaAaryan
 *
 */
@RestController
public class ProductController {

	@Autowired 
	ProductRepository productRepository;
	
	 @RequestMapping("/products")
	public Iterable<Product> getProducts(){
		 
		 return productRepository.findAll();
		
		/*List<Product> objLst= new ArrayList<>();
		
		Product obj = new Product();
		obj.setId(new Long(101));
		obj.setProductName("Asian Paints");
		obj.setManfName("Asian");
		
		Product obj1 = new Product();
		obj1.setId(new Long(102));
		obj1.setProductName("Audi Car");
		obj1.setManfName("Audi");
		
		objLst.add(obj);
		objLst.add(obj1);
		
		return objLst;*/
		
	}
}

/**
 * 
 */
package ss.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import ss.model.Product;

/**
 * @author ArpitaAaryan
 *
 */
public interface ProductRepository extends MongoRepository<Product,Long> {

	List<Product> findAll();
	
	
	
	
}

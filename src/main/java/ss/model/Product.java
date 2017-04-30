/**
 * 
 */
package ss.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ArpitaAaryan
 *
 */
@Document(collection="Product")
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String productName;
	
	private String manfName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManfName() {
		return manfName;
	}

	public void setManfName(String manfName) {
		this.manfName = manfName;
	}
	


}

/**
 * 
 */
package ss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ArpitaAaryan
 *
 */
@Controller
public class SSController {
	
	@RequestMapping("/")
	public String getProductName(){
		
		return "Hello"; //html name should be same
	}

}

package Hotel.ManagementCustomerEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class CustomerService {

	@Autowired 
	CustomerDao customerdao;
	
	
	public String addCustomer(CustomerEntity c) {
		return customerdao.addCustomer(c);
	}
	
	
    public CustomerEntity getCustomerDetail(Long phoneNumber){
		return customerdao.getCustomerDetail(phoneNumber);
	
}
    
}

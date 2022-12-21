package Hotel.ManagementCustomerEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepository customerRepository;
	

	public String addCustomer(CustomerEntity c) {
		customerRepository.save(c);
		return "customer details added successfully";
	}
	
	
    public CustomerEntity getCustomerDetail(Long phoneNumber){
		return customerRepository.findByphoneNumber(phoneNumber);
	}
	
	
}

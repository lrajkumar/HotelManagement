package Hotel.ManagementCustomerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

	CustomerEntity findByphoneNumber(Long phoneNumber);

}

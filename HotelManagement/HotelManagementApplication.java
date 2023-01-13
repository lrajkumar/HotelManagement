package Hotel.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages ="Hotel.Management")
//@EntityScan(basePackages={"Hotel.ManagementRoomEntity,Hotel.ManagementCustomerEntity,Hotel.ManagementRoomReservation"})
@ComponentScan(basePackages = { "Hotel.ManagementCustomerEntity","Hotel.ManagementRoomEntity","Hotel.ManagementRoomReservation"})
@EnableJpaRepositories(basePackages = "Hotel.Mangement")
public class HotelManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementApplication.class, args);
	}

}

package com.weshopify.platform.features.customers.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.weshopify.platform.features.customers.domain.Customer;


/*public interface CustomerRepo extends CrudRepository<Customer, Integer>*/ 
/*public interface CustomerRepo extends PagingAndSortingRepository<Customer, Integer>*/
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	@Query("from Customer c where c.email like %?1%")
	public List<Customer> searchByEmail(@Param("email") String email);
	
	@Query("from Customer c where c.userName like %?1%")
	public List<Customer> searchByUserName(@Param("userName") String userName);
	
	@Query("from Customer c where c.mobileNumber like %?1%")
	public List<Customer> searchByMobile(@Param("mobileNum") String mobileNum);
}

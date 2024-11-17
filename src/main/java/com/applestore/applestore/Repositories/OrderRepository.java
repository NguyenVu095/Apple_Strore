package com.applestore.applestore.Repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.applestore.applestore.Entities.Customer;
import com.applestore.applestore.Entities.Order;
import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	List<Order> findByCustomer(Customer customer);
}
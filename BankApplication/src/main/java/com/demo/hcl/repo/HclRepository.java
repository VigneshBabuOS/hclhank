package com.demo.hcl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.domain.BankDetails;

@Repository
public interface HclRepository extends JpaRepository<BankDetails, String>{
	
	@Query("select u from BankDetails u")
	List<BankDetails> getAccDetails();

}

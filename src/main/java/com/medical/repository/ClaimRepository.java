/**
 * 
 */
package com.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.entity.Claim;

/**
 * @author user1
 *
 */
@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}

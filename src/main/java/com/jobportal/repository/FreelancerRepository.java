package com.jobportal.repository;

import com.jobportal.models.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {

    Optional<Freelancer> findByUserId(Long userId);

    List<Freelancer> findByFreelancerIdIn(List<Long> freelancerIds);
}

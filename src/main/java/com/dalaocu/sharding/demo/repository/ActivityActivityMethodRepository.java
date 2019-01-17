package com.dalaocu.sharding.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.dalaocu.sharding.demo.entity.ActivityActivity;

@Repository
public interface ActivityActivityMethodRepository
        extends JpaRepository<ActivityActivity, Long>, JpaSpecificationExecutor<ActivityActivity> {

}

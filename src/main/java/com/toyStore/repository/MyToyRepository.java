package com.toyStore.repository;

import com.toyStore.entity.MyToyList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyToyRepository extends JpaRepository<MyToyList,Integer> {
}

package com.example.demo.dao.repository;

import com.example.demo.dao.Man;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManRepository extends CrudRepository<Man,Integer> {
    Man findManById(int id);
}

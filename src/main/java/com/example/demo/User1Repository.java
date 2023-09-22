package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface User1Repository extends CrudRepository<Users1, Integer>{

}

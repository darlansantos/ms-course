package com.darlansantos.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darlansantos.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

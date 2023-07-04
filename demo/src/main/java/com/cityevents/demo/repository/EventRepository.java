package com.cityevents.demo.repository;

import com.cityevents.demo.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Events,Integer> {
}

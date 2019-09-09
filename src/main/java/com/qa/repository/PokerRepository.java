package com.qa.repository;

import com.qa.models.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokerRepository extends JpaRepository<Data, Long> {
}

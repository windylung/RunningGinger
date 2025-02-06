package com.example.smelltracker.repository;

import com.example.smelltracker.entity.SmellRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmellRecordRepository extends JpaRepository<SmellRecord, Long> {
    SmellRecord save(SmellRecord smellRecord);
    List<SmellRecord> findAll();
}

package com.example.smelltracker.repository;

import com.example.smelltracker.entity.SmellRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmellRecordRepository extends JpaRepository<SmellRecord, Long> {
    SmellRecord save(SmellRecord smellRecord);
}

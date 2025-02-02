package com.example.smelltracker.service;

import com.example.smelltracker.dto.SmellRecordRequest;
import com.example.smelltracker.entity.SmellRecord;
import com.example.smelltracker.repository.SmellRecordRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SmellRecordService {
    private final SmellRecordRepository smellRecordRepository;

    public SmellRecordService(SmellRecordRepository smellRecordRepository) {
        this.smellRecordRepository = smellRecordRepository;
    }

    @Transactional
    public SmellRecord saveRecord(SmellRecordRequest record) {
        SmellRecord smellRecord = SmellRecord.builder()
                .humidity(record.getHumidity())
                .temperature(record.getTemperature())
                .smell(record.getSmell())
                .build();
        return smellRecordRepository.save(smellRecord);
    }
}

package com.example.smelltracker.controller;

import com.example.smelltracker.dto.SmellRecordRequest;
import com.example.smelltracker.entity.SmellRecord;
import com.example.smelltracker.service.SmellRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/smell-record")
public class SmellRecordController {

    @Autowired
    SmellRecordService recordService;
    @PostMapping("/save")
    public SmellRecord saveRecord(@RequestBody SmellRecordRequest request) {
        return recordService.saveRecord(request);
    }
}

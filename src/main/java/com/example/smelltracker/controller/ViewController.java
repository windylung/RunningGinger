package com.example.smelltracker.controller;

import com.example.smelltracker.entity.SmellRecord;
import com.example.smelltracker.service.SmellRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ViewController {
    private final SmellRecordService smellRecordService;

    @GetMapping("/")
    public String IndexView(Model model) {
        List<SmellRecord> allSmellRecords = smellRecordService.findAllSmellRecords();
        model.addAttribute("records", allSmellRecords);
        return "index";
    }
}

package com.example.jaz24965nbp.Service;


import com.example.jaz24965nbp.Category.Category;
import com.example.jaz24965nbp.DB.Entity.GoldRequest;
import com.example.jaz24965nbp.DB.Entity.Repository.GoldRepository;
import com.example.jaz24965nbp.Pojo.Gold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class GoldService {

    @Autowired
    private final GoldRepository goldRepository;
    private final RestTemplate restTemplate;

    public GoldService(GoldRepository goldRepository, RestTemplate restTemplatet) {
        this.goldRepository = goldRepository;
        this.restTemplate = restTemplatet;
    }

    public Double averageGold(String startDate, String endDate) {
        String url = "http://api.nbp.pl/api/cenyzlota/" + startDate + "/" + endDate + "/?format=json";
        ResponseEntity<Gold[]> response = restTemplate.getForEntity(url, Gold[].class);
        Gold[] golds = response.getBody();

        double sum = 0;

        for (Gold gold : golds) {
            sum += gold.getCena();
        }

        double average = sum / golds.length;

        GoldRequest goldRequest = new GoldRequest();

        goldRequest.setAverage(average);
        goldRequest.setCategory(Category.GOLD);
        goldRequest.setStartDate(startDate);
        goldRequest.setEndDate(endDate);
        goldRequest.setAddedAt(LocalDateTime.now());

        goldRepository.save(goldRequest);

        return average;
    }
}

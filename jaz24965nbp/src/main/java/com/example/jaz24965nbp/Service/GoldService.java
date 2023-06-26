package com.example.jaz24965nbp.Service;


import com.example.jaz24965nbp.Category.Category;
import com.example.jaz24965nbp.DB.Entity.GoldRequest;
import com.example.jaz24965nbp.DB.Entity.Repository.GoldRepository;
import com.example.jaz24965nbp.Pojo.Gold;
import com.example.jaz24965nbp.Pojo.GoldResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class GoldService {
    private final GoldRepository goldRepository;
    private final WebClient webClient;

    public GoldService(GoldRepository goldRepository, WebClient webClient) {
        this.goldRepository = goldRepository;
        this.webClient = webClient;
    }


    public Mono<Double> averageGold(String startDate, String endDate) {
        return webClient.get().uri("http://api.nbp.pl/api/cenyzlota/" + startDate + "/" + endDate+"/?format=json").retrieve().bodyToMono(GoldResponse.class).flatMap(response -> {
            double sum = response.getGoldList().stream().mapToDouble(Gold::getCena).sum();
            return Mono.just(sum / response.getGoldList().size());
        });
    }
}

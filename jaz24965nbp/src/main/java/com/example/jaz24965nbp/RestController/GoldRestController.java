package com.example.jaz24965nbp.RestController;


import com.example.jaz24965nbp.Service.GoldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/gold")
public class GoldRestController {

    private final GoldService goldService;

    public GoldRestController(GoldService goldService) {
        this.goldService = goldService;
    }

    @GetMapping(path = "/getaverage")
    ResponseEntity<Double> getAverageGold(
            @RequestParam(required = true) String startDate,
            @RequestParam(required = true) String endDate) {
        return ResponseEntity.ok(goldService.averageGold(startDate, endDate));
    }

}

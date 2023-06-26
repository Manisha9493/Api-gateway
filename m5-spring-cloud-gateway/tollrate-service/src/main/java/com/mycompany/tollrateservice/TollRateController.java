package com.mycompany.tollrateservice;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollRateController {

    List<TollRate2> tollrates2;

    List<TollRate> tollrates;

    public TollRateController() {

        tollrates = new ArrayList<TollRate>();
        tollrates.add(new TollRate(1000, 0.55f, Instant.now().toString()));
        tollrates.add(new TollRate(1001, 1.05f, Instant.now().toString()));
        tollrates.add(new TollRate(1002, 0.60f, Instant.now().toString()));
        tollrates.add(new TollRate(1003, 1.00f, Instant.now().toString()));

        tollrates2=new ArrayList<TollRate2>();
        tollrates2.add((new TollRate2(1000, 0.55f, Instant.now().toString(), true)));
        tollrates2.add(new TollRate2(1001, 1.05f, Instant.now().toString(), true));
        tollrates2.add(new TollRate2(1002, 0.60f, Instant.now().toString(),true));
        tollrates2.add(new TollRate2(1003, 1.00f, Instant.now().toString(),true));

    }

    @RequestMapping("/tollrate/{stationId}")
    public TollRate GetTollRate(@PathVariable int stationId) {
        System.out.println("Station requested: " + stationId);
        return tollrates.stream().filter(rate -> stationId == rate.getStationId()).findAny().orElse(new TollRate());
    }

    @RequestMapping("/tollrate2/{stationId}")
    public TollRate2 GetTollRate2(@PathVariable int stationId) {
        System.out.println("Station requested: " + stationId);
        return tollrates2.stream().filter(rate -> stationId == rate.getStationId()).findAny().orElse(new TollRate2());
    }

}

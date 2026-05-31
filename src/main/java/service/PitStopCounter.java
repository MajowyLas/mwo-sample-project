package service;

import model.PitStop;

import java.util.List;

public class PitStopCounter {

    private final List<PitStop> pitStops;

    public PitStopCounter(List<PitStop> pitStops) {
        this.pitStops = pitStops;
    }

    public int countAllPitStops() {
        return pitStops.size();
    }

}
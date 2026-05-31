package service;

import model.PitStop;

import java.util.List;

public class AveragePitStopDuration {

    public float countPitStops(List<PitStop> pitStops) {
        float count = 0;
        float sumDuration = 0;
        for (PitStop pitStop : pitStops) {
            count++;
            sumDuration += pitStop.getPitDuration();
        }
        return sumDuration / count;
    }
}

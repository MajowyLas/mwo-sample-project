package service;

import model.PitStop;
import java.util.List;

public class StartEndLaps {

    public static int getFirstLap(List<PitStop> stops) {
        if (stops == null || stops.isEmpty()) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (PitStop stop : stops) {
            if (stop.getLap_number() < min) {
                min = stop.getLap_number();
            }
        }

        return min;
    }

    public static int getLastLap(List<PitStop> stops) {
        if (stops == null || stops.isEmpty()) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (PitStop stop : stops) {
            if (stop.getLap_number() > max) {
                max = stop.getLap_number();
            }
        }

        return max;
    }
}

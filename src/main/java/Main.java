import loader.DataLoader;

import model.PitStop;
import service.PitStopCounter;
import loader.DataLoader;
import service.StartEndLaps;

import java.util.List;
import java.io.IOException;

public class Main {


        public static void main(String[] args) throws IOException {
            DataLoader loader = new DataLoader();
            List<PitStop> pitStops = loader.load("pitstops-data.json");
            System.out.println(pitStops.size());

//            PitStopCounter counter = new PitStopCounter();
//            counter.count(pitStops);

            int firstLap = StartEndLaps.getFirstLap(pitStops);
            int lastLap = StartEndLaps.getLastLap(pitStops);
            System.out.println("Pierwszy pit stop był na okrążeniu: " + firstLap);
            System.out.println("Ostatni pit stop był na okrążeniu: " + lastLap);
        }


}

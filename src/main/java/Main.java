import loader.DataLoader;

import model.PitStop;
import service.PitStopCounter;
import loader.DataLoader;
import java.util.List;
import java.io.IOException;

public class Main {


        public static void main(String[] args) throws IOException {
            DataLoader loader = new DataLoader();
            List<PitStop> pitStops = loader.load("pitstops-data.json");
            System.out.println(pitStops.size());

//            PitStopCounter counter = new PitStopCounter();
//            counter.count(pitStops);
        }

}

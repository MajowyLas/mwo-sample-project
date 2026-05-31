package loader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.PitStop;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class DataLoader {

    public List<PitStop> load(String filePath) throws IOException {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<PitStop>>() {}.getType();
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, listType);
        }
    }
}
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Json {
    //"src/main/resources/Response.json"
    public List<player> ParseJson(String path) throws FileNotFoundException {
        JsonElement element = JsonParser.parseReader(new FileReader(path));
        JsonObject asJsonObject = element.getAsJsonObject();

        JsonArray jsonObjectOfPlayer = asJsonObject.get("player").getAsJsonArray();
        List<player> players= new ArrayList<>();

        for(JsonElement player : jsonObjectOfPlayer){
            JsonObject asJsonObject1 = player.getAsJsonObject();
            String name = asJsonObject1.get("name").getAsString();
            String country = asJsonObject1.get("country").getAsString();
            String role = asJsonObject1.get("role").getAsString();
            double price_in_crores = asJsonObject1.get("price-in-crores").getAsDouble();
            player player1= new player(name,country,role,price_in_crores);
            players.add(player1);
        }
        return players;
    }
}

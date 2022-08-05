
import org.testng.Assert;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test {


    @org.testng.annotations.Test
    public void ValidateExact4Country() throws FileNotFoundException {
        List<player> players = new Json().ParseJson("src/main/resources/Response.json");
        System.out.println(players);
        List<String> country= new ArrayList<>();
        List<String> role = new ArrayList<>();
        for(int i=0;i<=players.size()-1;i++){
            country.add(players.get(i).country);
            role.add(players.get(i).role);
        }

        for(int i=0 ; i <= country.size() + 2 ; i++){
            country.remove("India");
        }
        System.out.println(country);
        Assert.assertEquals(country.size(),4);
    }

    @org.testng.annotations.Test
    public void ValidateOneWicketKeeper() throws FileNotFoundException {
        List<player> players = new Json().ParseJson("src/main/resources/Response.json");
        List<String> role = new ArrayList<>();
        for(int i=0;i<=players.size()-1;i++){
            role.add(players.get(i).role);
        }
        boolean contains = role.contains("Wicket-keeper");
        Assert.assertEquals(true,contains);
    }









}

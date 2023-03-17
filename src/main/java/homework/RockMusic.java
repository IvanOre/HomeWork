package homework;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();{// блок инициализцации. выполняется каждый раз,когда создается объект

        songs.add("Fear of the Dark");
        songs.add("Spit it out");
        songs.add("Holly diver");

    }




    public List<String> getSongs() {
        return songs;
    }

}
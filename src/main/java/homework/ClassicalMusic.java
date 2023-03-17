package homework;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ClassicalMusic implements Music{

    private List<String> songs = new ArrayList<>();{
        songs.add("Lunar sonata");
        songs.add("Night on Bald mountain");
        songs.add("Hungarian sonata");

    }




    public List<String> getSongs() {
        return songs;
    }
}

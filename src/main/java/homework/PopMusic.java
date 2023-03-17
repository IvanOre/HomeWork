package homework;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PopMusic implements Music{

    private List<String> songs = new ArrayList<>();{
        songs.add("Baby");
        songs.add("Toxic");
        songs.add("Barbie girl");
    }


    public List<String> getSongs() {
        return songs;
    }
}

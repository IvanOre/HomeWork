package homework;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public void playMusic(MusicGenre genre) {// через рандом воспроизводятся песни
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else if (genre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }else
            System.out.println(popMusic.getSongs().get(randomNumber));


        }
    }

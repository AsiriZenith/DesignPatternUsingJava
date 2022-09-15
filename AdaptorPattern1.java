/**
 * MediaPlayer
 */
interface MediaPlayer {
    public void play(String audioType, String fileName);
}

/**
 * AdvancedMediaPlayer
 */
interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}

/**
 * VlcPlayer
 */
class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println();
    }

}

/**
 * Mp4Player
 */
class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println();
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}

/**
 * MediaAdapter
 */
class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }

    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }

    }
}

/**
 * AdaptorPattern1
 */
public class AdaptorPattern1 {

}
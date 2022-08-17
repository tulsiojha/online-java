import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import java.io.File;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Clip;

class MusicPlayer{


    public static void main(String[] args){

        MusicPlayer mp = new MusicPlayer();
    }
    Clip clip;
    MusicPlayer(){
        try{
            File file = new File("music.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            this.clip = (Clip) AudioSystem.getClip();
            this.clip.open(audioInputStream);
            // clip.loop(Clip.LOOP_CONTINUOUSLY);
            // clip.setMicrosecondPosition(0);
            this.clip.setFramePosition(0);
            this.clip.start();
            // System.out.println(clip.getMicrosecondLength());
        }catch(UnsupportedAudioFileException e){
            System.out.println(e);
        }catch (LineUnavailableException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    


    void play(){

    }


    void pause(){

    }

    void resume(){

    }

    void stop(){

    }

}
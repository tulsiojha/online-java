import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import java.io.File;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Clip;

import java.util.Scanner;

class MusicPlayer{

    Clip clip;
    AudioInputStream audioInputStream;

    long currentFrame = 0;



    public static void main(String[] args){

        MusicPlayer mp = new MusicPlayer();
    }
    MusicPlayer(){
        try{
            File file = new File("music.wav");
            audioInputStream = AudioSystem.getAudioInputStream(file);
            
            this.clip = AudioSystem.getClip();

            this.clip.open(audioInputStream);

            this.details();

            this.play();

            Scanner scanner = new Scanner(System.in);
            while(true){
                
                int choice = scanner.nextInt();
                System.out.println("Enter prescd sed");
                this.action(choice);
            }

        }catch(UnsupportedAudioFileException e){
            System.out.println(e);
        }catch (LineUnavailableException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    void details(){
        System.out.println("1. pause");
        System.out.println("2. resume");
        System.out.println("3. stop");
    }


    void action(int value){
        switch(value){
            case 1:
                this.pause();
                break;
            case 2:
                this.resume();
                break;
            case 3:
                this.stop();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    void play(){
        this.clip.setMicrosecondPosition(0);
        this.clip.start();
        
    }


    void pause(){
        this.currentFrame = this.clip.getMicrosecondPosition();
        this.clip.stop();
    }

    void resume(){
        this.clip.setMicrosecondPosition(this.currentFrame);
        this.clip.start();
    }

    void stop(){
        this.clip.setMicrosecondPosition(0);
        this.clip.stop();
    }

}
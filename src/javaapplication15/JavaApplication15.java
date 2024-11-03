package javaapplication15;


public class JavaApplication15 {
    
    public static void main(String[] args) {
        
        Music mp3 = new MP3Music(new SpeakerSoundAPI()); 

        mp3.play(); // Saída: MP3: Tocando som no alto-falante. 

        Music wav = new WAVMusic(new HeadphoneSoundAPI()); 

        wav.play(); // Saída: WAV: Tocando som nos fones de ouvido.
        
    }
    
}

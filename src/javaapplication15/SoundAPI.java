
package javaapplication15;

// Interface de reprodução 
public interface SoundAPI { 

    void playSound(); 

}

// Implementação para alto-falante 

class SpeakerSoundAPI implements SoundAPI { 
    
    public void playSound() { 
        System.out.println("Tocando som no alto-falante.");
    } 
} 

// Implementação para fones de ouvido 
class HeadphoneSoundAPI implements SoundAPI { 

    public void playSound() { 
        System.out.println("Tocando som nos fones de ouvido."); 
    } 
} 

// Abstração de Música 
abstract class Music { 

    protected SoundAPI soundAPI; 

    protected Music(SoundAPI soundAPI) { 
        this.soundAPI = soundAPI; 
    } 
    
    public abstract void play(); 
}

// Classe concreta para MP3 
class MP3Music extends Music { 
    
    public MP3Music(SoundAPI soundAPI) { 
        super(soundAPI); 
    }
    
    public void play() { 
        System.out.print("MP3: "); 
        soundAPI.playSound(); 
    } 
}

// Classe concreta para WAV 
class WAVMusic extends Music { 

    public WAVMusic(SoundAPI soundAPI) { 
        super(soundAPI); 
    }

    public void play() { 
        System.out.print("WAV: "); 
        soundAPI.playSound(); 
    } 

} 
    


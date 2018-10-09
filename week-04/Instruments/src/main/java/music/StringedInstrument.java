package main.java.music;

import main.java.music.Instrument;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;


    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


    public void sound(){
        this.play();
    }


}

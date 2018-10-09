package main.java.music;

import main.java.music.Instrument;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;


    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }




    public void sound(){

    }


}


class ElectricGuitar extends StringedInstrument{


    public ElectricGuitar(int numberOfStrings) {
        super(6);
    }


    @Override
    public void play() {
        System.out.println("Twang");
    }
}

class BassGuitar extends StringedInstrument{


    public BassGuitar(int numberOfStrings) {
        super(4);
    }

    @Override
    public void play() {
        System.out.println("Duum-duum-duum");
    }
}

class Violin extends StringedInstrument{

    public Violin(int numberOfStrings) {
        super(4);
    }

    @Override
    public void play() {
        System.out.println("Screech");
    }
}
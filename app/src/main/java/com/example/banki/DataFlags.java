package com.example.banki;

/**
 * Application ListView
 * Created by EvILeg on 21.07.2015.
 */
public class DataFlags {

    private int flagID;
    private int nameID;
    private int kursUPID;
    private int kursFALLID;
    private int abbreviationID;

    public DataFlags (int _flagID, int _nameID, int _abbreviationID, int _kursUPID, int _kursFALLID){
        flagID = _flagID;
        nameID = _nameID;
        kursUPID = _kursUPID;
        kursFALLID = _kursFALLID;

        abbreviationID = _abbreviationID;
    }

    public int getFlagID(){
        return flagID;
    }
    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }
    public int getKursUPID() {
        return kursUPID;
    }
    public int getKursFALLID() {
        return kursFALLID;
    }
}
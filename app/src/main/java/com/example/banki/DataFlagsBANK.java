package com.example.banki;

/**
 * Application ListView
 * Created by EvILeg on 21.07.2015.
 */
public class DataFlagsBANK {

    private int streetID;
    private int bankID;
    private int stateID;
    private int hourseID;

    public DataFlagsBANK(int _streetID, int _bankID, int _stateID, int _hourseID){
        streetID = _streetID;
        bankID = _bankID;
        stateID = _stateID;
        hourseID = _hourseID;

    }

    public int getStreetID(){
        return streetID;
    }
    public int getBankID(){
        return bankID;
    }
    public int getStateID() {
        return stateID;
    }
    public int getHourseID() {
        return hourseID;
    }

}
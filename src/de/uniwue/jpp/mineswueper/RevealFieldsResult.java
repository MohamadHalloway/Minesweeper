package de.uniwue.jpp.mineswueper;

import java.util.*;

public class RevealFieldsResult {
    Collection<Field> myfields;
    /*-----------------------------------------------------------------------------------------------------*/
    //Defining the enum in the class
    public enum RevealFieldState {FIELD_NOT_REVEALED, FIELDS_REVEALED, FOUND_MINE};
    /*-----------------------------------------------------------------------------------------------------*/
    //Wenn das Klick nix macht
    public RevealFieldsResult(){
        this.myfields = new ArrayList<Field>();
    }
    /*-----------------------------------------------------------------------------------------------------*/
    //Erstellt eine neue RevealFieldsResult-Instanz mit einer Menge aufgedeckter Felder.
    public RevealFieldsResult(Collection<Field> fields){
            myfields = fields;
        }
    /*-----------------------------------------------------------------------------------------------------*/
    public Collection<Field> getRevealedFields(){
        Collection<Field> result = Collections.unmodifiableCollection(myfields);
        return result;
    }
    /*-----------------------------------------------------------------------------------------------------*/
    public RevealFieldState getState(){
        if (myfields.isEmpty()) return RevealFieldState.FIELD_NOT_REVEALED;
        else{
            for (Field f : myfields){
                if(f.hasMine()) {
                    return RevealFieldState.FOUND_MINE;
                }
            }
            return RevealFieldState.FIELDS_REVEALED;
        }
    }


}


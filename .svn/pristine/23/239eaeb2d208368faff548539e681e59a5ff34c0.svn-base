package de.uniwue.jpp.mineswueper;

import java.util.Collection;
import java.util.Objects;

public class Field {

    private boolean Mine;
    private boolean Flagge;
    private boolean Opened;
    private int minesNachbern;
    private Coordinate xy;
    private Collection<Field> Nachbern;
    private boolean überprüft;

    /*-----------------------------------------------------------------------------------------------------*/
    public Field(Coordinate coord){
        this.xy = coord;
        this.Mine = false;
        this.Flagge = false;
        this.Opened = false;
    }
    /*-----------------------------------------------------------------------------------------------------*/
    //Getters und Setters
    public Coordinate getCoordinate(){ //Achtung für Später ob die Ausgabe String oder Coordinate sein soll??
        return this.xy;
    }
    public boolean hasFlag() {return Flagge;}
    public void setHasFlag(boolean flag){
        this.Flagge = flag;
    }
    public boolean hasMine() {
        return this.Mine;
    }
    public void setHasMine(boolean Mine){
        this.Mine = Mine;
    }
    public boolean isOpened(){
        return Opened;
    }
    public void setOpened(boolean opened){
        this.Opened = opened;
    }
    public int getNeighbourMineCount(){
        return minesNachbern;
    }
    public void setNeighbourMineCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException();
        }
        else this.minesNachbern = count;
    }
    public Collection<Field> getNachbern(){ return Nachbern; }
    public void setNachbern(Collection<Field> nachbern){this.Nachbern = nachbern;}
    public boolean getÜberprüft(Field field){return überprüft;}
    public void setÜberprüft(boolean überprüft){this.überprüft = überprüft;}
    /*-----------------------------------------------------------------------------------------------------*/
    //Ovveridings methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Objects.equals(xy, field.xy);
    }

    @Override
    public int hashCode() {

        return Objects.hash(xy);
    }
    /*-----------------------------------------------------------------------------------------------------*/

}

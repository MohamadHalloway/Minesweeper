package de.uniwue.jpp.mineswueper;

import java.util.ArrayList;
import java.util.Collection;

public class MainTest {
    public void printtheboard(char[][] array){
        for (int i = 0; i < 10 ; i++){
            System.out.print('|');
            for (int j = 0 ; j < 10 ; j++){
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
//        Level beginner = new Level(5, 5, 2);
//        System.out.print(beginner);
        Field a = new Field(new Coordinate(0,0));
        Field b = new Field(new Coordinate(1,0));
        Field c = new Field(new Coordinate(2,0));
        Field d = new Field(new Coordinate(0,1));
        Field e = new Field(new Coordinate(1,1));
        Field q = new Field(new Coordinate(1,2));
        Field g = new Field(new Coordinate(2,0));
        Field h = new Field(new Coordinate(2,1));
        Field i = new Field(new Coordinate(2,2));
        Collection<Coordinate> coords = new ArrayList<>();
//        coords.add(a.getCoordinate());
//        coords.add(b.getCoordinate());
//        coords.add(c.getCoordinate());
//        coords.add(d.getCoordinate());
//        coords.add(e.getCoordinate());
//        coords.add(q.getCoordinate());
//        coords.add(g.getCoordinate());
        coords.add(h.getCoordinate());
        coords.add(i.getCoordinate());
        i.setHasMine(true);
        i.setHasFlag(true);
        h.setHasMine(true);
        h.setHasFlag(true);
        q.setOpened(true);
        Board theone = new Board(3, 3, coords);
        Collection<Field> blabla = theone.rekursivAufdecken(q);
//        for (Field field : blabla){
//            System.out.println("The feld " + field.getCoordinate() + " :is opened = " + field.isOpened() + " and has flag = " + field.hasFlag());
//        }













        char[][] array = new char[10][10];
        for (Field f: theone.getFields()){
            Coordinate co = f.getCoordinate();
            char zeichen = ' ';
            if (f.hasMine() && f.isOpened()) zeichen = 'm';
            else if (!f.isOpened() && !f.hasFlag()) zeichen = '#';
            else if (!f.isOpened() && f.hasFlag()) zeichen = 'f';
            else if(f.isOpened() && f.getNeighbourMineCount() != 0)zeichen = (char)f.getNeighbourMineCount();
            else zeichen = zeichen;
            array[f.getCoordinate().getY()][f.getCoordinate().getX()] = zeichen;
        }




    }
}

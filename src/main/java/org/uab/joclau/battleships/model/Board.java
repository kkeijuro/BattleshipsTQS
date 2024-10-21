package org.uab.joclau.battleships.model;
import java.util.List;


public class Board {

  int [][] board;
  //Tauler del joc
  List<Ship> ships;
  //Tots els vaixells del joc

  public void placeShip(Ship ship, int x, int y, boolean isHorizontal){

  }
  public boolean takeShot(int x, int y){

    return false;
  }
  public boolean isAllShipsSunk(){

    return false;
  }
  public boolean isValidPlacement(Ship ship, int x, int y, boolean isHorizontal){

    return isHorizontal;
  }
  public boolean isGameOver(){

    return false;
  }

}

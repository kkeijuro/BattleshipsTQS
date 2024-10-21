package org.uab.joclau.battleships.model;
import java.util.List;


public class Ship {

  List<Cell> posicionsShip;
  //Posicions dins del tauler que ocupa el vaixell

  int tamany;
  //Tamany del vaixell

  boolean enfonsat;
  // Si el vaixell s'ha enfonsat

  public boolean isHit(int x, int y){

    return false;
  }
  public void markHit(int x, int y){}
  public boolean isSunk(){

    return false;
  }

}

package org.uab.joclau.battleships.model;

public class Cell {
  int x,y;
  //Ubicació
  boolean tocat;
  //Si s'ha escollit la casella

  boolean ocupada;
  //Si la cell està ocupada

  public void occupy(){}
  public void hit(){}
  public boolean isOccupied(){

    return false;
  }
  public boolean isHit(){

    return false;
  }
}

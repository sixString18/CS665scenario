package edu.bu.met.cs665;

public class Buyer {
  private int id;

  //constructor for a Buyer
  public Buyer(int id) {
    this.id = id;
  }

  public void notice() {
    System.err.printf("Buyer %d notified.\n", this.id);
  }
}
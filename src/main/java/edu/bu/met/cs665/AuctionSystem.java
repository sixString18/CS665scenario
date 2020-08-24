package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

//AuctionSystem uses the observer pattern and maintains a list of buyers
//it uses the register() method to add a buyer to the list
//it usses the notice() method to notify buyers of a new bid
public class AuctionSystem {
  private List<Buyer> buyers;

  public AuctionSystem() {
    buyers = new ArrayList<Buyer>();
  }

  public void register(Buyer b) {
    buyers.add(b);
  }

  public void notice() {
    for (Buyer b : buyers) {
      b.notice();
    }
  }
}
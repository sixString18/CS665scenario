/**
 * 
 * Online Auction System problem:
 * 
 * As a software engineer, you are asked to design an Online Auction System. 
 * In an auction system, sellers can post product items for sale and potential buyers bid on products. 
 * Each time when a buyer bids on a specific product item, all other buyers will be notified about the new bid.
 * 
 * Develop an Auction System that can notify all buyers about the bids.
 * Provide a simple implementation for this online auction system. (20 points)
 * 
 * Document in your README.md file. Which pattern would you have used for this problem? (3 points)
 * Document in your README.md file. Describe how would your design of the notification system inform buyers about the new bids? (2 points)
 * Classes:
 * Provide a class for "AuctionSystem"
 * Provide a class for "Buyer"
 * Provide a class for "Seller"
 * Provide a class for "Product"
 * Provide a class for "Bid"
 * Simulate your system in a Junit Test or a Main function in Java (one of them is enough).
 * Objects:
 *  Create one object of "AuctionSystem", "Seller", "Product" , one "Bid"
 * Create at least two "Buyer"s, and create a "Bid" on a product for one of the buyer and inform other buyers.
 *
 */

package edu.bu.met.cs665;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This program is the JUnit test class
 * 
 * @author Ray Clark
 * 
 */

public class TestAuctionSystem {

  @Test
  public void testAuctionSystem() {
    AuctionSystem system = new AuctionSystem();
    assertNotNull(system);
    for (int ix = 0; ix < 5; ix++) {
      system.register(new Buyer(ix));
    }
    system.notice();
    assertTrue(true);
  }
}
// end of test class

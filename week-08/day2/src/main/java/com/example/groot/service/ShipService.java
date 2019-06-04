package com.example.groot.service;

import com.example.groot.model.Ship;
import org.springframework.stereotype.Service;

@Service
public class ShipService {

  private Ship guardianShip;


  ShipService() {
    this.guardianShip = new Ship();
  }

  public void countShipStatus() {
    if (this.countLoadedness() <= 0) {
      guardianShip.setShipStatus("empty");
    } else if (this.countLoadedness() < 12500) {
      guardianShip.setShipStatus(this.countLoadednessInPercentage() + "%");
    } else if (this.countLoadedness() == guardianShip.getCargoMax()) {
      guardianShip.setShipStatus("full");
    } else {
      guardianShip.setShipStatus("overloaded");
    }
  }

  public void countIfReady() {
    if (this.guardianShip.getShipStatus() == "full") {
      guardianShip.setReady(true);
    } else {
      guardianShip.setReady(false);
    }
  }

  public Ship getGuardianShip() {
    return guardianShip;
  }

  public void setGuardianShip(Ship guardianShip) {
    this.guardianShip = guardianShip;
  }

  public void placeCargo(String caliber, Integer amount) {
    if (caliber.equals(".50")) {
      getGuardianShip().setCaliber10(guardianShip.getCaliber10() + amount);
    } else if (caliber.equals(".30")) {
      getGuardianShip().setCaliber30(guardianShip.getCaliber30() + amount);
    } else if (caliber.equals(".10")) {
      getGuardianShip().setCaliber10(guardianShip.getCaliber10() + amount);
    } else {
    }
  }

  public int countLoadedness() {
    int load = this.guardianShip.getCaliber10() + this.guardianShip.getCaliber30()
        + this.guardianShip.getCaliber50();
    return load;
  }

  public int countLoadednessInPercentage() {
    int load = this.countLoadedness();
    int result = load % 125;
    return result;
  }
}

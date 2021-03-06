package com.example.easyride.data.model;

import com.example.easyride.ui.driver.RideRequest;

import java.util.ArrayList;

/**
 * Rider class that captures user information for logged in users retrieved from LoginRepository
 * @author T22
 * @version 1.0
 * @see EasyRideUser
 */
public class Rider extends EasyRideUser{
  private ArrayList<RideRequest> activeRequests;
  private EasyRideUser currentRiderInfo;
  private static Rider instance;

  public Rider(EasyRideUser user){
    super(user.getUserId());
    //super(userId);
    // UserDatabaseManager database = new UserDatabaseManager();
    // boolean exists = database.isRider("hi");
    // if (!exists){ currentRiderInfo = null; }
    //else {
      // currentRiderInfo = database.getRider("hi");

      // activeRequests = new ArrayList<>();
    //}
    currentRiderInfo = user;

    //TODO: add activeRequests
  }
  //return old instance or create a new one
  public static Rider getInstance(EasyRideUser user){
    if(instance == null){
      instance = new Rider(user);
    }
    return instance;
  }

  public EasyRideUser getCurrentRiderInfo(){return currentRiderInfo;}

}

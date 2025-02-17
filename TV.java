public class TV {  
	
  private String channel;
  
private String volumeLevel;

public static void main(String[] args) {
	  
    TV tv1 = new TV(); 
    tv1.turnOn(); 
    tv1.setChannel(-50);
    tv1.setVolume(-6);
    
    TV tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp(); 
    
    
    System.out.println("tv1's channel is " + tv1.channel 
      + " and volume level is " + tv1.volumeLevel);
    
    System.out.println("tv2's channel is " + tv2.channel 
      + " and volume level is " + tv2.volumeLevel);
  }

private void volumeUp() {
	// TODO Auto-generated method stub
	
}

private void channelUp() {
	// TODO Auto-generated method stub
	
}

private void setVolume(int i) {
	// TODO Auto-generated method stub
	
}

private void setChannel(int i) {
	// TODO Auto-generated method stub
	
}

private void turnOn() {
	// TODO Auto-generated method stub
	
}

}

public class TV {
	  int channel = 1; // Default channel is 1
	  int volumeLevel = 1; // Default volume level is 1
	  boolean on = false; // By default TV is off
	  
	  public TV() {
	  }
	  
	  public void turnOn() {
	    on = true;
	  }
	  
	  public void turnOff() {
	    on = false;
	  }
	  
	  public void setChannel(int newChannel) {
	    if (on && newChannel >= 1 && newChannel <= 120)
	      channel = newChannel;
	  }
	  
	  public void setVolume(int newVolumeLevel) {
	    if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
	      volumeLevel = newVolumeLevel;
	  }
	  
	  public void channelUp() {
	    if (on && channel < 120)
	      channel++;
	  }
	  
	  public void channelDown() {
	    if (on && channel > 1)
	      channel--;
	  }
	  
	  public void volumeUp() {
	    if (on && volumeLevel < 7)
	      volumeLevel++;
	  }
	  
	  public void volumeDown() {
	    if (on && volumeLevel > 1)
	      volumeLevel--;
	  }
	}
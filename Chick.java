class Chick implements Animal 
{     
     //your code here
  private String myType;
  private String mySound1;
  private String mySound2;
  private String mySound;
  public Chick(String type, String sound1, String sound2) {
    myType = type;
    mySound = sound1;
    mySound1 = sound1;
    mySound2 = sound2;

  }
  public Chick() {
    myType = "unknown";
    mySound = "unknown";
  }
  public void makeSound() {
    if (Math.random() < .5) {
      mySound = mySound1;
    }
    else {
      mySound = mySound2;
    }
  }
  public String getSound() {
    makeSound();
    return mySound;
  }
  public String getType() {
    return myType;
  }
}
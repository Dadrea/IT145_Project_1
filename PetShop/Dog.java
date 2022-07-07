package petShop;

public class Dog {
	private int dogSpaceNumber;   //defines the private variables for the dog class
	private int dogWeight;
	private boolean grooming;
			
	public Dog() {   //Creates the constructor for the Dog class
		dogSpaceNumber = 0;
		dogWeight = 0;
		grooming = false;
	}
	
	public void setDogSpaceNumber(int newSpaceNum) {

		dogSpaceNumber = newSpaceNum;   // sets the new dogs space number
	}
	
	public int getDogSpaceNumber() {

		return dogSpaceNumber;   // returns the value of dogSpaceNumber
	}
	
	public void setDogWeight(int newWeight) {

		dogWeight = newWeight;   //sets the new dogs weight
	}
	
	public int getDogWeight() {

		return dogWeight;   //returns the value of dogWeight
	}
	
	public void setGrooming(boolean newGroom) {

		grooming = newGroom;   //sets if the dog is going to get groomed or not
	}
	
	public boolean getGrooming() {

		return grooming;   //returns the value of dogGrooming
	}
	
	
}

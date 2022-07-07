package petShop;

public class PetShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.setGrooming(true);
		System.out.println(d.getGrooming());

		Cat c = new Cat();
		c.setCatSpaceNumber(12);
		System.out.println("Cat assigned to space: " + c.getCatSpaceNumber());
	}

}

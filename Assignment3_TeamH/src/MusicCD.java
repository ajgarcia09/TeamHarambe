
public class MusicCD extends Item{

	public MusicCD(String title, double price) {
		super(title, price); //calls the constructor in the superclass (User)
	}
	
	public void playSample(){
		System.out.println("playSample");
	}	
}

public class Adam{

	private float speed = 0.0;
	private boolean isRoomOwner = true;
	private boolean isDumbass = true;
	private boolean hasCircle = true;

	// TODO Create method to find keystore.
	private KeyStore ks;

	//Number of times Adam has lost his keystore
	int keystoreLost = 1;

	public Adam() {
		ks = null;
	}

	//Always returns true because Adam is an idiot and lost his keystore
	public boolean hasLostKeystore(){
		return true;
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}
	
	//Method that returns the number of times Adam has lost his keystore
	public int keystoreLostCount(){
		return keystoreLost;
	}


	public ArrayList<String> inLoveWith(){
		//Initialize list of lovers
    	ArrayList lovers = new ArrayList<String>();

    	//Add lovers in order from most in love to least
    	lovers.add("Tristan");
    	lovers.add("Karly");
    	lovers.add("Mauker");

    	//return lovers
		return lovers;
	}
}
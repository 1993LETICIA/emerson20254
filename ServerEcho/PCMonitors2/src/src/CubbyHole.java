public class CubbyHole {
	private int content;
	
	public void set(String producer, int value) {		
		System.out.printf("\nProdutor %s produziu %d\n",
				producer, value);
		
		content = value;
	}
	
	public int get(String consumer) {
		System.out.printf("\nConsumidor %s consumiu %d\n",
				consumer, content);
		
		return content;
	}
}

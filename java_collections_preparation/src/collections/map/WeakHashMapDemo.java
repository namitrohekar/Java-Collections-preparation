package collections.map;

import java.util.WeakHashMap;

class Image{
	
	private String name;
	
	public Image(String name) {
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class WeakHashMapDemo {
	
	
	public static void main(String[] args) {
		
		WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
		
		
		
		imageCache.put(new String("img1"), new Image("Image 1"));
		imageCache.put(new String("img2"), new Image("Image 2"));
		imageCache.put( new String("img3"), new Image("Image 3"));
		
		
		System.out.println(imageCache);
		System.gc();
		simulateApplicationRunning();
		
		System.out.println("Cache adter running ( some entries mey be cleared ! " + imageCache);
		
	}

	private static void simulateApplicationRunning() {
		
		try {
			System.out.println("Simulating Application Running !");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}

package collections.garbageCollection;

import java.lang.ref.WeakReference;

class Phone{
	
	String brand;
	String model;
	
	
	public Phone(String brand, String model) {
		
		this.brand = brand;
		this.model = model;
	}


	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}
	
}

public class GC {

	public static void main(String[] args) {
		
		Phone phone = new Phone("Apple", "iPhone XR"); // here phone is strong reference 
		
		System.out.println(phone);
		//phone = null;  // at this line the JVM lost he reference to the object that was created , now JVM collects garbage and clears memory
		System.gc();
		try {
			Thread.sleep(5000);
		}catch (Exception ignored) {
			
		}
		System.out.println(phone);
		
		
		WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple" , " 17 Pro max"));
		
		System.out.println(phoneWeakReference.get());
		System.gc(); // Objects referenced only by WeakReference are eligible for garbage collection as soon as GC runs / but in earlier example it wasn't happening 
		try {
			Thread.sleep(5000);
		}catch (Exception ignored) {
			
		}
		
		System.out.println(phoneWeakReference.get());
		
		
	}
}

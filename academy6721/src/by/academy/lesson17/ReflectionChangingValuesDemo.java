package by.academy.lesson17;

import java.lang.reflect.Field;

public class ReflectionChangingValuesDemo {
	public static void main(String... args) {

		Car car = new Car(500, "1233");
		Class<? extends Car> carClass = car.getClass();

		try {
//			Field horsePowerField = carClass.getDeclaredField("horsepower");
//			horsePowerField.setAccessible(true);
//			System.out.println("Horsepower field value:" + horsePowerField.getInt(car));

			Field serialNumberField = carClass.getDeclaredField("serialNumber");

			serialNumberField.setAccessible(true);
			
			System.out.println("Before change:" + serialNumberField.get(car));
			serialNumberField.set(car, "7777");
			System.out.println("After change:" + serialNumberField.get(car));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

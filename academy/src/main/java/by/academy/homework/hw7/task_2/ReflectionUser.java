package by.academy.homework.hw7.task_2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUser {
	public static void main(String... args) {
		User user = new User("Clark", "Kent", 83, "01-06-1938", "Krypton", 1234567, "superman@daily-planet.com");
		user.printUserInfo();

		System.out.println("");

		Class<User> userClass = User.class;

		System.out.println("======= getMethod(\"name\") =======");
		try {
			System.out.println(userClass.getMethod("getFirstName").getName());
			System.out.println(userClass.getMethod("setFirstName", String.class).getName());
			System.out.println(userClass.getMethod("getLastName").getName());
			System.out.println(userClass.getMethod("setLastName", String.class).getName());
			System.out.println(userClass.getMethod("getAge").getName());
			System.out.println(userClass.getMethod("setAge", int.class).getName());
			System.out.println(userClass.getMethod("getDateOfBirth").getName());
			System.out.println(userClass.getMethod("setDateOfBirth", String.class).getName());
			System.out.println(userClass.getMethod("getLogin").getName());
			System.out.println(userClass.getMethod("setLogin", String.class).getName());
			System.out.println(userClass.getMethod("getPassword").getName());
			System.out.println(userClass.getMethod("setPassword", int.class).getName());
			System.out.println(userClass.getMethod("getEmail").getName());
			System.out.println(userClass.getMethod("setEmail", String.class).getName());
			System.out.println(userClass.getMethod("printUserInfo").getName());
			System.out.println(userClass.getMethod("toString").getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("======= getMethods() =======");
		Method[] methods1 = userClass.getMethods();
		for (Method method : methods1) {
			System.out.println(method.getName());
		}

		System.out.println("======= getField(\"name\") =======");
//		выведет NoSuchFieldException, т.к. поля не public
		try {
			System.out.println(userClass.getField("firstName").getName());
			System.out.println(userClass.getField("lastName").getName());
			System.out.println(userClass.getField("age").getName());
			System.out.println(userClass.getField("dateOfBirth").getName());
			System.out.println(userClass.getField("login").getName());
			System.out.println(userClass.getField("password").getName());
			System.out.println(userClass.getField("email").getName());
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("======= getFields() =======");
//		ничего не выведет, т.к. поля не public
		Field[] fields1 = userClass.getFields();
		for (Field field : fields1) {
			System.out.println(field.getName());
		}

		System.out.println("======= getDeclaredMethod(\"name\") =======");
		try {
			System.out.println(userClass.getDeclaredMethod("getLogin").getName());
			System.out.println(userClass.getDeclaredMethod("setLogin", String.class).getName());
			System.out.println(userClass.getDeclaredMethod("getPassword").getName());
			System.out.println(userClass.getDeclaredMethod("setPassword", int.class).getName());
			System.out.println(userClass.getDeclaredMethod("getEmail").getName());
			System.out.println(userClass.getDeclaredMethod("setEmail", String.class).getName());
			System.out.println(userClass.getDeclaredMethod("printUserInfo").getName());
			System.out.println(userClass.getDeclaredMethod("toString").getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("======= getDeclaredMethods() =======");
		Method[] methods2 = userClass.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method.getName());
		}

		System.out.println("======= getDeclaredField(\"name\") =======");
		try {
			System.out.println(userClass.getDeclaredField("login").getName());
			System.out.println(userClass.getDeclaredField("password").getName());
			System.out.println(userClass.getDeclaredField("email").getName());
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("======= getDeclaredFields() =======");
		Field[] fields2 = userClass.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field.getName());
		}

		System.out.println("======= get и set методы класса Field =======");
		try {
			Field field1 = userClass.getDeclaredField("login");
			field1.setAccessible(true);
			field1.set(user, "Batmobile");
			System.out.println(field1.get(user));

			Field field2 = userClass.getDeclaredField("password");
			field2.setAccessible(true);
			field2.set(user, 131313);
			System.out.println(field2.getInt(user));

			Field field3 = userClass.getDeclaredField("email");
			field3.setAccessible(true);
			field3.set(user, "batman@gotham-city.com");
			System.out.println(field3.get(user));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("======= toString через invoke) =======");
		try {
			System.out.println(userClass.getMethod("toString").invoke(user));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}

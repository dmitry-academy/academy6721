package by.academy.lesson12.classwork.task1;

public class Task1 {
//	1.	Создать класс User, содержащий private переменные login, password. 
//	Создать внутренний класс Query в классе User. 
//	Класс Query содержит метод printToLog(), 
//	который распечатывает на консоль сообщение о том что пользователь с таким то 
//	логином и паролем отправил запрос. 
//	Класс User, содержит метод createQuery(), 
//	в котором создается объект класса Query и вызывается метод printToLog(). 
//	В методе main(): создать экземпляр класса User и вызвать метод createQuery(); 
//	создать экземпляр класса Query и вызвать метод printToLog() 
//	используя конструкцию user.new Query(); 
//	создать экземпляр класса Query и вызвать метод printToLog() используя 
//	конструкцию new User().new Query(); 
//	2.	Переписать предыдущее задание, используя локальный класс. 

	public static void main(String[] args) {

		User user = new User("User", "123456");

		User.Query q = new User.Query(user);
		q.printToLog();
	}
}

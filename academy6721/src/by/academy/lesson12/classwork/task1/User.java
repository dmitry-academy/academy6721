package by.academy.lesson12.classwork.task1;

public class User {
	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public void createQuery() {
		 class Query {
			public void printToLog() {
				System.out.println("User  - " + User.this.login);
			}
		}
		Query q = new Query();
		q.printToLog();

	}

	
}

package webapp;

public class UserValidationService {

	public boolean validateUser(String userName, String password) {
		if (userName.equals("Helen") && password.equals("123"))
	 	return true;
		return false;
	}
}

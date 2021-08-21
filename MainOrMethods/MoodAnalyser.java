
public class MoodAnalyser {

	public static void main(String[] args) {

	}

	public String userMessage;

//default
	public MoodAnalyser() {

		userMessage = " i an feeling sad today.  ";

	}

//Parameter
	public MoodAnalyser(String message) {
		userMessage = message;
	}

	public String analyseMood() {

		if (userMessage.contains("Sad") || userMessage.contains("sad") || userMessage.contains("SAD")) {
			return "SAD";

		} else {
			return "HAPPY";
		}

	}

	public String analyseMood(String message) {
		String newmessage = message;
		if (newmessage.contains("Sad") || newmessage.contains("sad") || newmessage.contains("SAD")) {
			return "SAD";

		} else {
			return "HAPPY";
		}

	}

}

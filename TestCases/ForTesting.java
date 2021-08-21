import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ForTesting {
	MoodAnalyser userMood = new MoodAnalyser();

	@Test
	public void ThisShouldGiveUsBackMoodThatIsEitherHappyOrSad() {
		assertEquals("Sad", userMood.analyseMood());
	}

	@Test
	public void ThisShouldGiveUsBackMoodThatIsEitherHappyOrSadByParamaterCons() {
		MoodAnalyser mood = new MoodAnalyser("yes yes happy today ");
		assertEquals("HAPPY", mood.analyseMood());
	}

	@Test
	public void ThisShouldGiveTheMessageFrom() {
		assertEquals("HAPPY", userMood.analyseMood("no i am not in good mood or sad today "));
	}

	@Test
	public void ThisShouldGiveTheMessageFromGivingCorrectInput() {
		assertEquals("HAPPY", userMood.analyseMood("yes i am in goog mood happy today "));
	}

	@Test
	public void givenNullMoodShouldReturnHappy() {

		assertEquals("HAPPY", userMood.analyseMood(null));
	}

}
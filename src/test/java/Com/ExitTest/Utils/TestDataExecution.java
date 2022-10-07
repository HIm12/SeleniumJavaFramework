package Com.ExitTest.Utils;

import org.testng.SkipException;

public class TestDataExecution {

	// function toCheckExecutionRequired
	public static void toCheckExecutionRequired(String executionRequired) {

		// if execution required field is no
		if (executionRequired.toLowerCase().equals("no")) {
			throw new SkipException("Skipping this exception");
		}

		// if execution required field is empty
		if (executionRequired.equals("")) {
			throw new SkipException("Skipping this exception");
		}
	}

}

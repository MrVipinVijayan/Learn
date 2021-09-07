package practice;

public class TimeConversion {

	public static void main(String[] args) {
		String newTime = timeConversion("01:45:54PM");
		Logger.print(newTime);
	}

	public static String timeConversion(String s) {

		String time = "";

		if (null == s || s.isEmpty()) {
			return time;
		}

		boolean pm = s.endsWith("PM");

		s = s.substring(0, s.length() - 2);

		String parts[] = s.split(":");
		int hr = Integer.parseInt(parts[0]);
		String hrString = String.valueOf(hr);

		if (pm && hr < 12) {
				hr = hr + 12;
		} else {
			if (hr >= 12) {
				hr = hr - 12;
			}
		}

		hrString = String.valueOf(hr);
		if (hr < 10) {
			hrString = "0" + hr;
		}

		return hrString + ":" + parts[1] + ":" + parts[2];
	}

}

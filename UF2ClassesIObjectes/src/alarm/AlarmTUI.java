package alarm;

public class AlarmTUI {
	public static void main(String[] args) {
		Alarm f = new Alarm();
		f.setAlarmDateTime(2024, 03, 1, 0, 0);
		System.out.println("Nombre de segons " + f.intervalBetween());
		System.out.println("Falten " + f.timeLeft());
		while (!f.isRinging()) {
			System.out.println("Nombre de segons " + f.intervalBetween());
		}
		System.out.println("RIIIIIIIIIIIIIIIIIIINGG");
	}

}

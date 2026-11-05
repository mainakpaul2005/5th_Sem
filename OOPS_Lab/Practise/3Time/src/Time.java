
public class Time {
	int hour;
	int mins;
	int secs;
	
	public Time() {
		this.hour = 0;
		this.mins = 0;
		this.secs = 0;
	}
	
	public Time(int hour, int mins, int secs) {
		super();
		this.hour = hour;
		this.mins = mins;
		this.secs = secs;
	}
	
	public void displayTime() {
		if(this.hour >= 0 && this.hour <= 11) {
			if(this.mins >= 0 && this.mins <=59) {
				System.out.printf("Time is: %02d:%02d AM%n", this.hour, this.mins);
			}
		}
		if(this.hour >= 12 && this.hour < 13 && this.mins <=59) {
			System.out.printf("Time is: %02d:%02d PM%n", this.hour, this.mins);
		}
		if(this.hour >= 13 && this.hour <= 23) {
			if(this.mins <= 59) {
				System.out.printf("Time is: %02d:%02d PM%n", this.hour - 12, this.mins);
			}
		}
	}
}

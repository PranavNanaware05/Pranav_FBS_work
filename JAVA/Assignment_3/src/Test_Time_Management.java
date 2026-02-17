class Time {

    int hr, min, sec;

   
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    
    Time add(Time t) {

        int newSec = this.sec + t.sec;
        int carryMin = newSec / 60;
        newSec = newSec % 60;

        int newMin = this.min + t.min + carryMin;
        int carryHr = newMin / 60;
        newMin = newMin % 60;

        int newHr = this.hr + t.hr + carryHr;
        newHr = newHr % 24;

        return new Time(newHr, newMin, newSec);
    }

    
    Time add(int hours) {

        int newHr = (this.hr + hours) % 24;
        return new Time(newHr, this.min, this.sec);
    }

    
    Time add(int minutes, int seconds) {

        int totalSec = this.sec + seconds;
        int carryMin = totalSec / 60;
        int newSec = totalSec % 60;

        int totalMin = this.min + minutes + carryMin;
        int carryHr = totalMin / 60;
        int newMin = totalMin % 60;

        int newHr = (this.hr + carryHr) % 24;

        return new Time(newHr, newMin, newSec);
    }

    
    void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}

public class Test_Time_Management {

    public static void main(String[] args) {

        
        Time t1 = new Time(10, 59, 50);
        Time t2 = new Time(2, 10, 20);

      
        Time result1 = t1.add(t2);
        Time result2 = t1.add(5);
        Time result3 = t1.add(30, 40);

        System.out.print("Time 1: ");
        t1.display();

        System.out.print("Time 2: ");
        t2.display();

        System.out.print("Addition of Two Time Objects: ");
        result1.display();

        System.out.print("After Adding 5 Hours: ");
        result2.display();

        System.out.print("After Adding 30 Minutes and 40 Seconds: ");
        result3.display();
    }
}

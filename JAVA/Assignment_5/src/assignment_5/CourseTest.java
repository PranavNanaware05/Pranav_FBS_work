package assignment_5;

class Course {
     String courseName;
     int duration;
      Course() {
		this.courseName="not given";
		this.duration=00;
	}
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void display() {
        System.out.println("Course  : " + courseName);
        System.out.println("Duration: " + duration + " days");
    }
}

class OnlineCourse extends Course {
    String platform;

   OnlineCourse(String name, int duration, String platform) {
        super(name, duration);
        this.platform = platform;
    }

    void display() {
        super.display();
        System.out.println("Platform: " + platform);
    }
}

class OfflineCourse extends Course {
     String location;

    public OfflineCourse(String name, int duration, String location) {
        super(name, duration);
        this.location = location;
    }

    void display() {
        super.display();
        System.out.println("Location: " + location);
    }
}

public class CourseTest {
    public static void main(String[] args) {
        OnlineCourse o = new OnlineCourse("Java Full Stack", 90, "Udemy");
        o.display();

        System.out.println();

        OfflineCourse f = new OfflineCourse("Data Science", 120, "Pune");
        f.display();
    }
}

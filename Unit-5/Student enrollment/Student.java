import java.util.*;

// Course Class
class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student Class (Composition)
class Student {
    private int studentId;
    private String studentName;
    private List<Course> courses;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    // Enroll Course
    public void enrollCourse(Course course) {
        courses.add(course);
        System.out.println("Enrolled in " + course.getCourseName());
    }

    // Remove Course
    public void removeCourse(int courseId) {
        Iterator<Course> it = courses.iterator();
        while (it.hasNext()) {
            Course c = it.next();
            if (c.getCourseId() == courseId) {
                it.remove();
                System.out.println(" Removed " + c.getCourseName());
                return;
            }
        }
        System.out.println("Course not found!");
    }

    // Display Courses
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }

        System.out.println("Courses of " + studentName + ":");
        for (Course c : courses) {
            System.out.println(c.getCourseId() + " - " + c.getCourseName());
        }
    }
}


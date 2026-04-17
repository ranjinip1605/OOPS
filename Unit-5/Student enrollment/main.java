// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined Courses
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(101, "Java"));
        courseList.add(new Course(102, "Python"));
        courseList.add(new Course(103, "Cyber Security"));
        courseList.add(new Course(104, "Data Structures"));

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(id, name);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. View Courses");
            System.out.println("2. Enroll Course");
            System.out.println("3. Remove Course");
            System.out.println("4. View Enrolled Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Courses:");
                    for (Course c : courseList) {
                        System.out.println(c.getCourseId() + " - " + c.getCourseName());
                    }
                    break;

                case 2:
                    System.out.print("Enter Course ID to enroll: ");
                    int enrollId = sc.nextInt();

                    for (Course c : courseList) {
                        if (c.getCourseId() == enrollId) {
                            student.enrollCourse(c);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Course ID to remove: ");
                    int removeId = sc.nextInt();
                    student.removeCourse(removeId);
                    break;

                case 4:
                    student.displayCourses();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
interface Exam {
    int getExamMarks();
}
interface Assignment {
    int getAssignmentMarks();
}
interface Sports {
    int getProjectMarks();
}
interface Cultural {
    int getAttendaneMarks();
}

class StudentEvaluation implements Exam, Assignment, Project, Attendance {

    int exam, assignment, project, attendance;

    StudentEvaluation(int exam, int assignment, int project, int attendance) {
        this.exam = exam;
        this.assignment = assignment;
        this.project = project;
        this.attendance = attendance;
    }

    public int getExamMarks() {
        return exam;
    }

    public int getAssignmentMarks() {
        return assignment;
    }

    public int getProjectMarks() {
        return project;
    }

    public int getCulturalMarks() {
        return attendance;
    }

    public void calculateResult() {
        int total = exam + assignment + project + attendance;
        double average = total / 4.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if (average >= 75)
            System.out.println("Grade: A");
        else if (average >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setStudentId(1);
        s1.setStudentName("Amaran");
        s1.setCity("Chennai");
        s1.setMarks1(85);
        s1.setMarks2(78);
        s1.setMarks3(90);
        s1.setFeePerMonth(500.0f);
        s1.setIsEligibleForScholarship(true);

        s2.setStudentId(2);
        s2.setStudentName("Vignesh");
        s2.setCity("Hyderabad");
        s2.setMarks1(65);
        s2.setMarks2(70);
        s2.setMarks3(68);
        s2.setFeePerMonth(450.0f);
        s2.setIsEligibleForScholarship(false);

        s3.setStudentId(3);
        s3.setStudentName("Veeresh");
        s3.setCity("Chennai");
        s3.setMarks1(95);
        s3.setMarks2(88);
        s3.setMarks3(92);
        s3.setFeePerMonth(550.0f);
        s3.setIsEligibleForScholarship(true);

        Student[] students = { s1, s2, s3 };

        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("Student with highest total marks: " + topStudent.getStudentName());

        Student leastFeeStudent = students[0];
        for (Student s : students) {
            if (s.getFeePerMonth() < leastFeeStudent.getFeePerMonth()) {
                leastFeeStudent = s;
            }
        }
        System.out.println("Student with least monthly fee: " + leastFeeStudent.getStudentName() +
                " - Fee: $" + leastFeeStudent.getFeePerMonth());

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            System.out.println("---------------------------");
            System.out.println("Name: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println("Average Marks: " + s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Scholarship Eligible: " + s.getIsEligibleForScholarship());
        }
    }
}


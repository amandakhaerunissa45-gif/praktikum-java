import java.util.Date;

public class Student extends Person {
    private String studentId;
    private double gpa;
    private String major;
    private String degree;
    private int expectedGraduationYear;

    public Student(String firstName, String middleName, String lastName,
                   Date dateOfBirth, String studentId, String major,
                   String degree, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    // Mengubah nilai huruf menjadi poin nilai sesuai tabel latihan
    private double gradeToPoint(String grade) {
        switch (grade.toUpperCase()) {
            case "A":  return 4.00;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B":  return 3.00;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C":  return 2.00;
            case "D":  return 1.00;
            case "F":  return 0.00;
            default:
                throw new IllegalArgumentException("Nilai tidak dikenal: " + grade);
        }
    }

    public double calculateGpa(String[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Array nilai tidak boleh kosong.");
        }

        double total = 0;
        for (String grade : grades) {
            total += gradeToPoint(grade);
        }

        gpa = total / grades.length;
        return gpa;
    }
}

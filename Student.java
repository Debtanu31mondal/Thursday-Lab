package studentsystem;

public class Student {
    private int studentId;
    private String studentName,address ;

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Student(int studentId, String studentName, String address) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student [studentId=").append(studentId)
                .append(", studentName=").append(studentName).append(", address=").append(address).append("]");
        return builder.toString();
    }



}

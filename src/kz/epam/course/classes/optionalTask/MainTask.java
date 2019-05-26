package kz.epam.course.classes.optionalTask;

public class MainTask {
    public static void main(String[] args) {
        setStudents();
    }

    private static void setStudents() {
        Student student1 = Student.newBuilder()
                .setSurname("Иванов")
                .setName("Иван")
                .setMiddleName("Иванович")
                .setDateOfBirth("26.05.1997")
                .setAddress("ул. Достык 4")
                .setPhoneNumber("+77051234567")
                .setFaculty("Математика")
                .setCourse("1")
                .setGroup("123")
                .build();

        Student student2 = Student.newBuilder()
                .setSurname("Петров")
                .setName("Петр")
                .setMiddleName("Петрович")
                .setDateOfBirth("27.01.2001")
                .setAddress("ул. Айманова 1")
                .setPhoneNumber("+77057654321")
                .setFaculty("Психология")
                .setCourse("2")
                .setGroup("321")
                .build();

        Student student3 = Student.newBuilder()
                .setSurname("Алексеев")
                .setName("Алексей")
                .setMiddleName("Алексеевич")
                .setDateOfBirth("01.01.2001")
                .setAddress("ул. Ленина 10")
                .setPhoneNumber("+77051111111")
                .setFaculty("Математика")
                .setCourse("1")
                .setGroup("123")
                .build();

        Student student4 = Student.newBuilder()
                .setSurname("Петров")
                .setName("Иван")
                .setMiddleName("Алексеевич")
                .setDateOfBirth("05.05.1995")
                .setAddress("ул. Дина 4")
                .setPhoneNumber("+7705222222")
                .setFaculty("Физика")
                .setCourse("3")
                .setGroup("111")
                .build();

        StudentList studentList = new StudentList();
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);

        printInfo(studentList);
    }

    private static void printInfo(StudentList studentList) {
        //список студентов заданного факультета;
        studentList.facultyPrint("Математика");
        //списки студентов для каждого факультета и курса;
        studentList.facultyCoursePrint(3);
        //список студентов, родившихся после заданного года;
        studentList.yearOfBirthPrint("1997");
        //список учебной группы.
        studentList.groupPrint("123");

    }
}
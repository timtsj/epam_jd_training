package kz.epam.course.classes.optionalTask;

/**
 * Создать классы, спецификации которых приведены ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * <p>
 * 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
 * <p>
 * Создать массив объектов. Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */
public class Student {

    private int id;
    private static int nextId = 0;
    private String surname;
    private String name;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    private Student() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public static Builder newBuilder() {
        return new Student().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setSurname(String surname) {
            Student.this.surname = surname;
            return this;
        }

        public Builder setName(String name) {
            Student.this.name = name;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            Student.this.middleName = middleName;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            Student.this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setAddress(String address) {
            Student.this.address = address;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            Student.this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setFaculty(String faculty) {
            Student.this.faculty = faculty;
            return this;
        }

        public Builder setCourse(String course) {
            Student.this.course = course;
            return this;
        }

        public Builder setGroup(String group) {
            Student.this.group = group;
            return this;
        }

        public Student build() {
            return Student.this;
        }


    }

    public String toString() {
        return "Student{" + " id " + getId() +
                ", name = '" + getName() + '\'' +
                ", middleName = '" + getMiddleName() + '\'' +
                ", dateOfBirth = '" + getDateOfBirth() + '\'' +
                ", address = '" + getAddress() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", phoneNumber = '" + getPhoneNumber() + '\'' +
                ", faculty = '" + getFaculty() + '\'' +
                ", course = '" + getCourse() + '\'' +
                ", group = '" + getGroup() + '\'' +
                '}';
    }

    public String fullName() {
        return getSurname() + " " + getName() + " " + getMiddleName();
    }
}


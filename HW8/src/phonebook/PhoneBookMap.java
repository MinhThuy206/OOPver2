package phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student s) {
        if (!phoneBook.containsKey(s.getPhone())) {
            phoneBook.put(s.getPhone(), s);
        }
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.getPhone().equals(phone)) {
                phoneBook.remove(phone);
            }
        }
    }
}

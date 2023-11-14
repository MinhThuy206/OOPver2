package phonebook;

public interface PhoneBook {
    Student searchByLastname(String lastname);

    Student searchByNumber(String phone);

    void addPerson(Student s);

    Student searchByName(String name);

    void deleteByNumber(String phone);

}

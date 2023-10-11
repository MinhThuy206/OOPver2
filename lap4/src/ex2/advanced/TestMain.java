package ex2.advanced;

public class TestMain {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("mail is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhre.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}

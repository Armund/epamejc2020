package homework.homework6;

public class Main {

    public static void main(String[] args) {

        Author badAuthor = new Author("Yarik", -1);
        ShowOff coolGuy = (author) -> System.out.printf("Author's age is %d and you'll never guess his name ... it's %s\n\n",
                author.age, author.name);
        coolGuy.show(badAuthor);

        Author author = new Author();
        coolGuy.show(author);
    }
}

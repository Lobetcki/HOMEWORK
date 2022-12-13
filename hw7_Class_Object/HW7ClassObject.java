public class HW7ClassObject {

   public static void main(String[] args) {

       Author tolstoy = new  Author("Лев", "Толстой", 55);
       Author dostoevski = new Author("Николай", "Достоевский", 75);

        Book warAndPeace = new  Book(tolstoy, "Война и Мир", 1870);
       Book prestuplenie = new Book(dostoevski, "Преступление и наказание", 1850);



       System.out.println(tolstoy.getAuthorName() + " " + tolstoy.getAuthorLastName() + " - " + warAndPeace.getBookName() + ", " + warAndPeace.getPublishingYear() + " год.");
       System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + " - " + prestuplenie.getBookName() + ", " + prestuplenie.getPublishingYear() + " год.");
       System.out.println(tolstoy.getAuthorName() + " " + tolstoy.getAuthorLastName() + ", " + tolstoy.getAge() + " год.");
       System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + ", " + dostoevski.getAge() + " год.");


       warAndPeace.setPublishingYear(1820);
       prestuplenie.setPublishingYear(1765);
       dostoevski.setAuthorName("Федор");

       System.out.println(tolstoy.getAuthorLastName() + " - " + warAndPeace.getBookName() + ", " + warAndPeace.getPublishingYear() + " год.");
       System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + ", " + dostoevski.getAge() + " год.");
       System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + " - " + prestuplenie.getBookName() + ", " + prestuplenie.getPublishingYear() + " год.");

   }
}

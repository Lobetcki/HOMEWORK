public class hw7_Class_Object {

   public static void main(String[] args) {

       Book warAndPeace = new  Book("Лев Толстой", "Война и Мир", 1870);
       Book prestuplenie = new Book("Федор Достоевский", "Преступление и наказание", 1850);

       Author tolstoy = new  Author("Лев", "Толстой", 55);
       Author dostoevski = new Author("Николай", "Достоевский", 75);

       System.out.println(warAndPeace.getAuthorName() + " - " + warAndPeace.getBookName() + ", " + warAndPeace.getPublishingYear() + " год.");
       System.out.println(prestuplenie.getAuthorName() + " - " + prestuplenie.getBookName() + ", " + prestuplenie.getPublishingYear() + " год.");
       System.out.println(tolstoy.getAuthorName() + " " + tolstoy.getAuthorLastName() + ", " + tolstoy.getAge() + " год.");
       System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + ", " + dostoevski.getAge() + " год.");

       warAndPeace.setPublishingYear(1820);
       dostoevski.setAuthorName("Федор");

       System.out.println(warAndPeace.getAuthorName() + " - " + warAndPeace.getBookName() + ", " + warAndPeace.getPublishingYear() + " год.");
       System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + ", " + dostoevski.getAge() + " год.");

    }
}

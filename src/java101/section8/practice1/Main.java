package java101.section8.practice1;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "000", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "111", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH", t1,50);
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK", t1,100);
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "101", "BIO", t1,80);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(65,70,50);
        s1.isPass();
        s1.printNote();

    }
}

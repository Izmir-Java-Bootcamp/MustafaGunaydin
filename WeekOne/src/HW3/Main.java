package HW3;

public class Main {

    public static void main(String[] args) {

    Student student1 = new Student("Mustafa Gunaydin",5003,2.9,new PersonalData(15,4,1997,30452));   // 5 adet öğrenci eklendi
    Student student2 = new Student("Fatih Yilmaz",5004,3.2,new PersonalData(12,3,1995,31453));
    Student student3 = new Student("Alp Kaya",5005,2.7,new PersonalData(21,5,1996,30652));
    Student student4 = new Student("Emre Saner",5006,2.3,new PersonalData(13,1,1999,40452));
    Student student5 = new Student("Melih Durmus",5007,3.6,new PersonalData(14,2,1993,62152));

    Course course = new Course("K129",3);      // 3 kapasiteli K129 Kursu oluşturuldu.

    course.addStudent(student1);                            // Açılan K129 kursuna 4 adet öğrenci eklendi.
    course.addStudent(student2);
    course.addStudent(student3);
    course.addStudent(student4);

    System.out.println(course.getCourseName() + "  kursunun öğrencileri: ");   // Kurstaki öğrenciler listeleniyor.
    course.list();

    course.increaseCapacity();                                                  // Kurs kapaasitesi artılıyor.

    course.addStudent(student4);                                                // Kapasite nedeniyle eklenemeyen öğrenciler kapasite artırıldıktan sonra kursa ekleniyor.
    course.addStudent(student5);

    course.dropStudent(student3);                                               // ID5005 olan öğrenci kurstan düşüyor.

    System.out.println(course.getCourseName()+" kursundaki öğrenci sayisi : "+course.getNumberOfStudents());   // Kurstaki öğrenci sayısı fonksiyon çağrılarak yazdırılıyor.

    // GPA'sı en yüksek öğrencinin doğum tarihi Yıl / Ay yazılır.
    System.out.println( "GPA en yüksek öğrencinin doğum tarihi :"+course.getBestStudent().getPd().getBirthDate().getYear()+" / "+course.getBestStudent().getPd().getBirthDate().getMonth());




    }
}

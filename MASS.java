import java.util.*;

public class MASS {
    public static void main(String[] args) {
        String studentiki[] = {"Antonov" ,"Shevchenko" , "Boyko" , "Shevchenko" , "Kravchenko" , "Savitsky" , "Antonov" , "Shevchenko" , "Teteriv" , "Mamchenko"};
        List spisokStudentiv = new ArrayList<>();
        for (String student : studentiki) {
            spisokStudentiv.add(student);

        }
        int studentlength = studentiki.length;
        System.out.println(spisokStudentiv);
        Set<String> nabirStudentiv = new TreeSet<>();
        nabirStudentiv.add(studentiki[0]);
        System.out.println(studentlength);
        System.out.println();

        for (int i=0; i<studentiki.length;i++){
            Map<String,Integer> nabirVsego = new HashMap<>();
            nabirVsego.put(studentiki[i], i);
            System.out.println(nabirVsego);
            System.out.println(studentiki[i].length());
        }
    }
}
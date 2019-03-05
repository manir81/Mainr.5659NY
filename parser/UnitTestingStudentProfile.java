package parser;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
          Student st= new Student();
                st.setFirstName("manir");
                st.setLastName("Hossain");
                st.setScore("98");
                st.setId("101");
System.out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getScore() + " " + st.getId());
    }
}

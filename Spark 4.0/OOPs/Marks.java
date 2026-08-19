public class Marks {
   private  int marks;

    void setMarks(int marks){
        if (marks >= 0 && marks <= 100) {

            this.marks = marks;

            if (marks >= 33) {
                System.out.println("Congratulations you are pass");
            } else {
                System.out.println("Your Marks " + marks);
                System.out.println("Failed try next time");
            }

        } else {
            System.out.println("Invalid Marks");
        }

    }

    int getMarks(){
        return marks;
    }

    static void main(String[] args) {
      Marks m=new Marks();
      m.setMarks(31);
      System.out.println(m.getMarks());
    }
}

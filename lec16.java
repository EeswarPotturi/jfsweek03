public class Lecture10_2 {
    private int standard=0;
    private int rollNo=0;
    private String section="";

    public void Class(int standard,int rollNo,String section){
        this.standard=standard;
        this.rollNo=rollNo;
        this.section=section;
        System.out.println("You are "+standard+"rd class\nYour RollNo is "+rollNo+"\nYour section is "+section+" Section");


    }
    public static void main(String[] args) {
        Lecture10_2 l2=new Lecture10_2();
        l2.Class(3, 1, "A");
        System.out.println(standard);


    }
}
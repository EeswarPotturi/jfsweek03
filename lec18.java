import java.util.*;

public class Lecture18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList ll=new ArrayList();
        String item;
        for(int i=1;i<=5;i++){
            item=sc.next();
        if(ll.contains(item)){

        continue;}
        ll.add(item);
        }

        System.out.println(ll);
    }
}
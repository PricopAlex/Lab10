package fasttrackit;

public class magazin {
    public static void main(String[] args) {
       bucket bucket=new bucket();
       bucket.adaugacumparaturi(new Fruit("bananos",15));
       bucket.adaugacumparaturi(new Fruit("mere",5));
       System.out.println(bucket.find(new Fruit("bananos",5)));
       System.out.println(bucket.getCumparaturi());
    }
}

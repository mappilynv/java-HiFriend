public class HiFriend {
    public static void main(String[] args) throws Exception {
        /*String name="Hi "+"Larry "+"David!"; 
        System.out.println(name);*/
        /*String l1="Hi ";
        String l2="Larry ";
        String l3="David";
        String l4=l1.concat(l2);
        String l5=l4.concat(l3);
        System.out.println(l5);*/
        StringBuilder l1=new StringBuilder("Hi ");
        StringBuilder l2=new StringBuilder("Larry ");
        StringBuilder l3=new StringBuilder("David!");
        StringBuilder l4=l1.append(l2);
        StringBuilder l5=l4.append(l3);
        System.out.println(l5.toString());
    }
}

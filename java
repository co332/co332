import java.util.Arrays;

class MyStudents 
{
    public static <P1,P2> void show(P1[] mca, P2 cse)
    {
      System.out.println(Arrays.toString(mca));
      System.out.println(cse);
    }

    public static void main(String[] args)
    {
      String [] mcastudents = {"Arnab","Hrishik","Amrita","Sayantika"};
      String csestudents = "Sem IV Section C";
      show(mcastudents, csestudents);
    }
}

package lambda.espression;

import java.util.*;

public class CollectionTest {

  public static void main(String[] args){
      System.out.println(" ============ Descending Sorting ArrayList ============");
      List<Integer> list1 = Arrays.asList(15, 0, 20, 10, 5);
      System.out.println("Before sorting : " + list1);

      System.out.println(" ============ without Lambda ============");

      Collections.sort(list1, new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
              return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
          }
      });
      System.out.println("After sorting : " + list1);

      System.out.println(" ============ without Lambda ============");
      Collections.sort(list1, (I1, I2) -> (I1 > I2) ? 1 : (I2 > I1) ? -1 : 0);
      System.out.println("After sorting : " + list1);

      System.out.println(" ============ Sorting Set with Lambda ============");
      Set<Integer> ts = new TreeSet<>((i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0);
      ts.add(25);
      ts.add(0);
      ts.add(15);
      ts.add(10);
      ts.add(5);
      System.out.println("Set After sorting : " + ts);

      System.out.println(" ============ Sorting Own class with Lambda ============");
      List<Employe> employes = new ArrayList<>();
      employes.add(new Employe(400, "Samir"));
      employes.add(new Employe(200, "Jack"));
      employes.add(new Employe(500, "Mohamed"));
      employes.add(new Employe(100, "Amine"));

      System.out.println(employes);
      Collections.sort(employes, (e1, e2) -> e1.num > e2.num ? 1 : (e1.num < e2.num) ? -1 : 0);

      System.out.println("after sorting :");
      System.out.println(employes);
  }
}

class Employe {

    int num;
    String name;

    public Employe(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
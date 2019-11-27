package TrainingProjects.logicUpgrade.projecteuler;
//https://sites.google.com/site/kubenskiy/Home/2010fall/informatics/programs-1

/**
 * ���������� ������������ ����� �� ������� ���������.
 */

public class Problem005Factorization {

  /**
   * @param args - �������� ����������� �����.
   */
  public static void main(String[] args) {
    // �������� ����������� �����
    int n = 20;
    int factor = 2;
    System.out.format("������������ %d �� ������� ���������:", n);
    while (n > 1 && factor * factor <= n) {
      while (n % factor == 0) {
        System.out.format(" %d,", factor);
        n /= factor;
      }
      ++factor;
    }
    if (n > 1) {
      System.out.format(" %d", n);
    }
    System.out.println();
  }

}

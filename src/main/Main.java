
package main;

public class Main {

  public static void main(String[] args) {

    Impl m = new Impl();
    
    String str = "The";
    int number = 46834634;
    int[] array = {-3, 2, -13, 7};
    int[] array1 = {145, 62, 545, 4, 1};
    int binaryNum = 122;

    System.out.println(m.doubleChar(str));
    System.out.println(m.sum(number));
    System.out.println(m.sumNumbers(array));
    System.out.println(m.smallestInt(array1));
    System.out.println(m.binary(binaryNum));

  }
}


class Impl {

  public String doubleChar(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++)
      result = result + String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
    return result;
  }
  
  /**
   * 
   * @param n
   * @return la somma di tutte le cifre presenti nel numero finchè il risultato non è una sola cifra
   */
  public int sum(int n) {

    int res = 0;

    for (; n > 0; n /= 10) {
      res = res + (n % 10);
    }
    if (res > 9)
      res = sum(res);

    return res;
  }

  
  /**
   * 
   * @param array n
   * @return somma le cifre solo se quella precedente è minore di quella successiva
   */
  public int sumNumbers(int[] n) {
    int res = 0;
    for (int i = 0; i < n.length;) {
      for (int k = i + 1; k < n.length;) {
        if (n[i] < n[k] && k == 1) {
          res = n[i] + n[k];
        } else if (n[i] < n[k]) {
          res = res + (n[i] + n[k]);
        }
        i++;
        k++;
      }
      return res;
    }
    return res;
  }

  
  /**
   * 
   * @param array n
   * @return trovare la cifra più bassa
   */
  public int smallestInt(int[] n) {

    int res = n[0];
    for (int i = 0; i < n.length; i++) {
      if (res > n[i])
        res = n[i];
    }
    return res;
  }
  

  /**
   * 
   * @param n
   * @return trasforma il numero in binario e somma i numeri 1 per trovare da quanti bit è formato
   */
  public int binary(int n) {
    int binary = 0;
    int res = 0;
    for (; n > 0; n /= 2) {
      binary = n % 2; // 122 : 2 = 61 resto 0
      if (binary == 1)
        res = res + binary;
    }

    return res;
  }
}



package task.methods;

public class Methods {

  public String stringToLowerCase(String str) {
    return str.toLowerCase();
  }

  public int sumOfTwoNumbers(int a, int b) {
    return a + b;
  }

  public String sumOfTwoStrings(String a, String b) {
    return a + b;
  }

  public String sumOfStringAndNumber(String str, int num) {
      int num2 = Integer.parseInt(str);
    return String.valueOf(num + num2);
  }

  public boolean compareStringNumberWithInt(String str, int num) {
    return Integer.parseInt(str) <= num;
  }

  public boolean checkBooleans(boolean a, boolean b) {
    return a || b;
  }

  public boolean isEven(int num) {
    return num % 2 == 0;
  }

  public String checkArrayEvenOdd(int[] arr) {
    String x = "";
    int sum = 0;
    for (int j : arr) {
      sum += j % 2;
      if (sum == 0) {
        x = "Массив чётных чисел";
      } else if (sum == arr.length) {
        x = "Массив нечётных чисел";
      } else x = "Массив чётных и нечётных чисел";
    }
    return x;
  }

  public int[] sumArrayElements(int[] arr) {
    int[] arr2 = new int[arr.length];
    arr2[0] = arr[0];
    int i = 1;
    for(int j = 1; j < arr.length; j++){
      arr2[i] = arr2[i - 1] + arr[j];
      i++;
    }
    return arr2;
  }

  public int sumArray(int[] arr) {
    int sum = 0;
    for (int j : arr){
      sum += j;
    }
    return sum;
  }

  public int ageInMonths(int years) {
    return years * 12;
  }

  public int ageInMinutes(int years) {
    int i = 1;
    int age = 0;
    do {
      if (i%4!=0) {
        age += 525600;
        i++;
      }
      else {
        age += 527040;
      }
      years--;
    } while (years!=0);
    return age;
  }

  public int ageInHours(int years) {
    int i = 1;
    int age = 0;
    do {
      if (i%4!=0) {
        age += 8760;
        i++;
      }
      else {
        age += 8784;
      }
      years--;
    } while (years!=0);
    return age;
  }

  public boolean areNamesEqual(String name1, String name2) {
    return name1.equalsIgnoreCase(name2);
  }

  public int getLastElement(int[] arr) {
    return arr[arr.length - 1];
  }

  public int countLetterA(String str) {
    return str.split("A", -1).length - 1;
  }

  private int wallet = 1000;

  public String withdraw(int amount) {
    while (wallet>=0) {
      wallet -= amount;
    }
    return "Остаток в кошельке: " + wallet;
  }

  public String deposit(int amount) {
      wallet += amount;
    return "Остаток в кошельке: " + wallet;
  }
}
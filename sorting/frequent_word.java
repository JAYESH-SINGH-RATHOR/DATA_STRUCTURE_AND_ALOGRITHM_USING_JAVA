package sorting;

public class frequent_word {
  public static void K_frequent_word(String arr[] , int k){
    int n = arr.length;
    int words[] = new int[n];
    for (int i = 0; i < n; i++) {
      words[i] = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[i].equals(arr[j])) {
          words[i]++;
          words[j] = -1;
        }
      }
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (words[i] < words[j]) {
          int tempCount = words[i];
          words[i] = words[j];
          words[j] = tempCount;
          String tempWord = arr[i];
          arr[i] = arr[j];
          arr[j] = tempWord;
        }
      }
    }

    System.out.println("The " + k + " most frequent words are:");
    for (int i = 0; i < k && i < n; i++) {
      if (words[i] > 0) {
        System.out.println(arr[i] + " : " + words[i]);
      }
    }

  }
    public static void main(String[] args) {
        String arr[] = {"i" , "love" , "leetcode" , "i" , "love", "coding"};
        int k = 2;
        K_frequent_word(arr, k);
    }
}

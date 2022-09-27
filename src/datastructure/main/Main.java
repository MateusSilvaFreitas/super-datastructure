package datastructure.main;

import datastructure.bigOnotacion.BigOexemples;
import datastructure.binaryTree.Node;
import datastructure.challenges.HeightOfBinaryTree;
import datastructure.challenges.IsMatch;
import datastructure.challenges.IsPalindromeNumber;
import datastructure.challenges.LengthOfLongestSubstring;
import datastructure.challenges.LongestCommonPrefix;
import datastructure.challenges.LongestPalindrome;
import datastructure.challenges.MaxAreaOfWater;
import datastructure.challenges.MedianOfSortedArrays;
import datastructure.challenges.MyAtoi;
import datastructure.challenges.ReverseInteger;
import datastructure.challenges.RomanToInt;
import datastructure.challenges.VersionCompare;
import datastructure.challenges.ZigZagConvertion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(char[] args) {

    }
    public static void main(String[] args) {
//        int[] lista = new int[5];
//        int ac;
//        lista[0] = 3;
//        lista[1] = 2;
//        lista[2] = 4;
//        //System.out.println(inverterLista(lista));
//        //twoSum(lista, 6);
//
//
//        String[] listaString = new String[5];
//        listaString[0] = "A";
//        listaString[1] = "E";
//        listaString[2] = "D";
//        listaString[3] = "C";
//        listaString[4] = "Z";
//        System.out.println(BigOexemples.verificaElementosDuplicados(listaString));
//
//
//        int num = VersionCompare.compareVersion("1.1", "0.1");
//        System.out.println(num);
//
//        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("vvdf"));
//
//
//        int[] lista1 = new int[2];
//        int[] lista2 = new int[2];
//        lista1[0] = 1;
//        lista1[1] = 3;
//        lista2[0] = 2;
//        lista2[1] = 7;
//        System.out.println(MedianOfSortedArrays.findMedianSortedArrays(lista1, lista2));
//
//
//        LongestPalindrome.longestPalindrome("abb");
//
//        System.out.println(ZigZagConvertion.convert("PAYPALISHIRING", 3));
//
//        System.out.println(ReverseInteger.reverse(1463847412));
//
//        MyAtoi.myAtoi("words and 987");
//        IsPalindromeNumber.isPalindrome(121);
//        IsMatch.isMatch("aaaaaab", "a*ab");
//        int[] a = new int[2];
//        a[0] = 1;
//        a[1] = 1;
//
//        MaxAreaOfWater.maxArea(a);
//        RomanToInt.romanToInt("MDCXCV");
//
//        String[] strArr = new String[1];
//
//        strArr[0] = "a";
////        strArr[1] = "flow";
////        strArr[2] = "flight";
//        LongestCommonPrefix.longestCommonPrefix(strArr);
//
//        Node n1 = new Node(20l);
//        Node n2 = new Node(10l);
//        Node n3 = new Node(30l);
//        Node n4 = new Node(1l);
//        Node n5 = new Node(15l);
//        Node n6 = new Node(22l);
//        Node n7 = new Node(12l);
//        Node n8 = new Node(18l);
//        Node n9 = new Node(21l);
//        Node n10 = new Node(25l);
//        Node n11 = new Node(11l);
//        Node n12 = new Node(27l);
//        Node n13 = new Node(27l);
//
//        n1.setLeft(n2);
//        n1.setRight(n3);
//
//        n2.setLeft(n4);
//        n2.setRight(n5);
//
//        n5.setLeft(n7);
//        n5.setRight(n8);
//
//        n7.setLeft(n11);
//
//        n3.setLeft(n6);
//
//        n6.setLeft(n9);
//        n6.setRight(n10);
//
//        n10.setLeft(n12);
//        n12.setLeft(n13);
//
//
//        HeightOfBinaryTree.heigth(n1);
//
//        Set set = new TreeSet();
//        set.add(1);
//        set.add(3);
//
//        int arr[] = new int[]{ 1, -1, -1, -1, 1, 1};
//        int n = arr.length;
//        int k = 6;
//        System.out.println(findSubarrayCount(arr, n, k));
        System.out.println(count(10000));
    }

      static int count(int n){
        int results = 0;

          for (int i = 0; i < n - 1; i++) {
              for (int j = i + 1; j < n; j++) {
                  results++;
              }
          }

          return results;
      }

        // Function to find number of subarrays having
        // product exactly equal to k.
        public static int findSubarrayCount(int arr[], int n, int k)
        {
            int start = 0, endval = 0;
            int p = 1, countOnes = 0, res = 0;
            while(endval < n)
            {
                p *= (arr[endval]);

                // If product is greater than k then we need
                // to decrease it. This could be done by shifting
                // starting point of sliding window one place
                // to right at a time and update product accordingly.
                if (p > k)
                {
                    while (start <= endval && p > k)
                    {
                        p /= arr[start];
                        start++;
                    }
                }

                if (p == k)
                {
                    // Count number of succeeding ones.
                    countOnes = 0;
                    while (endval + 1 < n && arr[endval + 1] == 1)
                    {
                        countOnes++;
                        endval++;
                    }

                    // Update result by adding both new
                    // subarray and effect of succeeding ones.
                    res += (countOnes + 1);

                    // Update sliding window and result according
                    // to change in sliding window. Here preceding
                    // 1s have same effect on subarray as succeeding
                    // 1s, so simply add.
                    while (start <= endval && arr[start] == 1)
                    {
                        res += (countOnes + 1);
                        start++;
                    }

                    // Move start to correct position to find new
                    // subarray and update product accordingly.
                    p /= arr[start];
                    start++;
                }

                endval++;
            }
            return res;
        }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        ListNode head = new ListNode();
//        ListNode cur = head;
//        int s = 0;
//
//        while(l1 != null && l2 != null){
//
//            cur.next = new ListNode();
//            cur = cur.next;
//
//            cur.val = (l1.val + l2.val + s)%10;
//            s = (l1.val + l2.val + s)/10;
//
//
//            l1 = l1.next;
//            l2 = l2.next;
//
//        }
//
//        while(l1 != null){
//            cur.next = new ListNode();
//            cur = cur.next;
//
//            cur.val = (l1.val + s)%10;
//            s = (l1.val + s)/10;
//
//            l1 = l1.next;
//        }
//
//        while(l2 != null){
//            cur.next = new ListNode();
//            cur = cur.next;
//
//            cur.val = (l2.val + s)%10;
//            s = (l2.val +s)/10;
//
//            l2 = l2.next;
//        }
//
//        if(s>0){
//            cur.next = new ListNode(s);
//        }
//
//        return head.next;
//    }






}

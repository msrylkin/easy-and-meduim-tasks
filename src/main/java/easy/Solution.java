package easy;


import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Solution {


//    public static void main(String[] args){
//        Solution solution = new Solution();
////        int mas[] = solution.exchangeSumm2(10);
////        System.out.print("= ");
////        for (int i=0;i<mas.length;i++){
////            System.out.print("+ " + mas[i] + " ");
////        }
//    }
    /**
     * 1) ���������, ������������ 2-� �� �������� ������� ������ �����.
     * @param mas - ������� ������
     * @return mas[i]- ������ �� �������� �������
     * @throw new ArrayIndexOutOfBoundsException - ���� ������ �������� ������ ���� ��������� ��� ��� �������� �����
     */
    public int calculate(int mas[]){
        if (mas.length<=1)
            throw new IllegalArgumentException("Massive cannot be lower than 2 args!");
        sort(mas);
        for (int i=1;i<mas.length;i++){
            if (mas[i]>mas[0]){
                return mas[i];
            }
        }
        throw new IllegalArgumentException("All elements are equal!");
    }

    /**
     * 2) ���������, ����������� ���������� ����� �� ����� ������� ����������
     * @param number - ����� ��������
     * @return mas - ������ ����������
     */
    public int[] numberPartition(int number){
        if (number==1)
            throw new IllegalArgumentException("1 is not prime and not simple number!");
        if (number<=0)
            throw new IllegalArgumentException("Enter natural number!");
        int mas[] = new int[1];
        int i=2, counter = 0;
        while (i<=number){
            if (number%i==0){
                number/=i;
                if (mas.length==counter)
                    mas = increaseSize(mas);
                mas[counter++] = i;
            }
            else
                i++;
        }
        return mas;
    }

    /**
     * 3) ���������, ����������� �������� ������ �� ��, ��� ��� �������� �����������
     * @param str - ������ ��������
     * @return - true ���� ������ ���������, false ���� ���
     */
    public boolean isPalindrom(String str){
        String reversed = "";
         for (int i = str.length()-1;i>=0;i--)
             reversed+=str.charAt(i);
        if (reversed.equals(str))
            return true;
        else
            return false;
    }

    /**
     * 4) ���������, ������������ ������ �������� �� 3,5 ������ � 3, 5, 7 ������.
     * @param number - ��������, ���������� ������ ��� �������
     * @return mas - ������ ��������� �� ����� 3 � 5
     */
    int[] exchangeSumm1(int number){
        if (number<=7)
            throw new IllegalArgumentException("Number cannot be lower than 8!");
        int[] mas = new int[]{};
        int counter = 0;
        while (number>0){
            if (number%5==0){
                int count = number/=5;
                for (int i=0;i<count;i++){
                    mas = increaseSize(mas);
                    mas[counter++] = 5;
                }
                break;
            }
            else {
                number -= 3;
                mas = increaseSize(mas);
                mas[counter++] = 3;
            }
        }
        return mas;
    }

//    int[] exchangeSumm2(int number, int min, int i){
//        if (number<0||min=)
//    }

    /**
     * 5) ���������, ����������� ����� ��������� � ������.
     * @param substr - ���������, ������� ����� �����
     * @param str - ������ ��� ������
     * @return - ���� ���� �� ��� �������, ������������ ������ ������� ���������
     *  � �������� ������ ������������ -1
     */

    int searchSubString(String substr,String str){
        for (int i=0;i<str.length();i++){
            boolean flag = true;
            for (int j=0;j<substr.length();j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    flag = false;
                    break;
                }
            }
           if (flag)
               return i;
        }
        return -1;
    }

    /**
     * ����������� ����� ������� �� 1
     * @param source - �������� ������
     * @return - ������������ ������
     */
    public int[] increaseSize(int[] source){
        int mas[] = new int[source.length+1];
        for (int i=0;i<source.length;i++)
            mas[i]=source[i];
        return mas;
    }

    /**
     * ����������� ����������
     * @param mas - ������ ������
     */
    void sort(int mas[]){
        for (int i=0;i<mas.length-1;i++){
            for (int j=0;j<mas.length-1-i;j++){
                if (mas[j]>mas[j+1]){
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
    }
}
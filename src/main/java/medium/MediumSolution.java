package medium;

import easy.Solution;

/**
 * Created by user on 08.10.2015.
 */
public class MediumSolution {

    /**
     * 1) ���������, ������������ n-� �� �������� ������� ������ �����.
     * @param mas - �������� ������
     * @param n - �������� n
     * @return mas[i] - ������� �� �������� n
     * IllegalArgumentException - ���� ��� ���������
     */
    int returnSelect(int[] mas,int n){
        sort(mas);
        for (int i=0;i<mas.length;i++){
            if (mas[0]<mas[i])
                n--;
            if (n==0)
                return mas[i];
        }
        throw new IllegalArgumentException();
    }

    /**
     * 2) ��������� ����������� Run-length encoding ����������� ������ (aaabccdd -> 3a1b2c2d)
     * @param string - �������� ������
     * @return - �������������� ������
     */
    String runLengthEncoding(String string){
        char[] chars = string.toCharArray();
        char lastChar = (char)0;
        int counter = 1;
        String codedString = "";
        for (int i=0;i<chars.length;i++){
            if (i==0){
                lastChar = chars[i];
                continue;
            }
            if (lastChar==chars[i])
                counter++;
            else {
                codedString+=counter+""+lastChar;
                counter = 1;
                lastChar = chars[i];
            }
        }
        return codedString+counter+""+lastChar;
    }

    /**
     * 3) ��������� ����������� Run-length encoding ������������� ������ (3a1b2c2d->aaabccdd).
     * @param string - �������� ������
     * @return codedString- �������������� ������
     */
    String runLengthDecoding(String string){
        char[] chars = string.toCharArray();
        int lastNum = 0;
        String codedString = "";
        for (int i=0;i<chars.length;i++){
            if ((int)chars[i]<=57&&(int)chars[i]>=48){
                lastNum = (lastNum*10)+Character.getNumericValue(chars[i]);
            } else {
                for (int j=0;j<lastNum;j++){
                    codedString += chars[i];
                }
                lastNum = 0;
            }
        }
        return codedString;
    }

    /**
     * ���������� ������� ��������
     * @param mas - �������� ������
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

package Leson10;

import static java.lang.Integer.valueOf;
public class Main {
    public static void main(String[] args) {

        String[][] stringArray0 = new String[][] {
                {"5", "g", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] stringArray1 = new String[][] {
                {"5", "6", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] stringArray2 = new String[][] {
                {"5", "g", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] stringArray3 = new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };

        try {
            System.out.println("����� ��������� ������� ����� " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("����� ��������� ������� ����� " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("����� ��������� ������� ����� " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("����� ��������� ������� ����� " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum (String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        // ���������, ��� � ������� 4 �������� ���������
        if (in.length != 4) {
            throw new MyArraySizeException(String.format("����������� ������� ������ ���� %d�%d.", arrDim, arrDim));
        }
        // �.�. ����������� ��������� �������� ����� ���� �� ������ ���������, �� ���������, ��� � ������ �� 4-� �������� ��������� ��������� ������ ����� �� 4 ���������
        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("����������� ������� ������ ���� %d�%d.", arrDim, arrDim));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format
                            ("� ������� [%d][%d] ��������� ������� ��������� �� ����� ����� %s.", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }
}

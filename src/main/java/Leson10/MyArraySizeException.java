package Leson10;

class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String msg) {
        super("������ ����������� �������.\n" + " " + msg);
    }

}
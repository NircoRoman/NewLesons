package Leson10;
    class MyArrayDataException extends RuntimeException {
        MyArrayDataException(String msg) {
            super("������ �������������� �������� ������� � ����� �����.\n" + " " + msg);
    }
}
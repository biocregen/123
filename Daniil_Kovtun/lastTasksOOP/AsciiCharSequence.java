package lastTasksOOP;

public class AsciiCharSequence implements java.lang.CharSequence{
    private byte[] array;
    private char a;
    public AsciiCharSequence(byte[] arrayOfSymbols) {
        this.array = arrayOfSymbols;
    }
    @Override
    public char charAt(int index) {
        if (index >= 0 && index < array.length) {
            a = (char) array[index];
        }
        return a;
    }
    @Override
    public int length() {
        return this.array.length;
    }
    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        //AsciiCharSequence arrayOfBytes = new AsciiCharSequence();
        byte[] methodArray = new byte[end - start];
        int j = 0;
        for (int i = start; i < end; i++) {
            methodArray[j] = this.array[i];
            j++;
        }
        return new AsciiCharSequence(methodArray);
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            str.append(charAt(i));
        }
        return str.toString();
        //return new String(array);
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " +   answer.toString());//Hello!
        System.out.println("Размер её - " +  answer.length());//6
        System.out.println("Символ под № 1 - " +  answer.charAt(1));//e
        System.out.println("Подпоследовательность - "  +  answer.subSequence(1, 5));//ello

    }
}

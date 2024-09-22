package lastTasksOOP;
import java.lang.CharSequence;

public class AsciiCharSequence implements CharSequence{
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

        byte[] result = new byte[end - start];
        for (int i = 0; i < end - start; i++ ) {
            result[i] = this.array[i + start];
        }
        return new AsciiCharSequence(result);
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            str.append(charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " +   answer.toString());
        System.out.println("Размер её - " +  answer.length());
        System.out.println("Символ под № 1 - " +  answer.charAt(1));
        System.out.println("Подпоследовательность - "  +  answer.subSequence(1, 5));

    }
}

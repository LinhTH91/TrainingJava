package thlinh1.slide04.exercise03;

import java.util.stream.IntStream;

public class CharSequenceImpl implements CharSequence {

    public String value;

    public CharSequenceImpl() {
        this.value = "";
    }

    public CharSequenceImpl(String value) {
        this.value = value;
    }

    @Override
    public int length() {
        return value.length();
    }

    @Override
    public char charAt(int index) {
        return value.charAt(index);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return value.subSequence(start, end);
    }

}

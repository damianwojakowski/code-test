public class Solution {

    public int getValue(int value) {
        if (value <= 1) {
            return value;
        }

        return getValue(value - 1) + getValue(value - 2);
    }

}

class Solution {
    private final String[] ROMAN_THOUSANDS = {"", "M", "MM", "MMM"};
    private final String[] ROMAN_HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private final String[] ROMAN_TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private final String[] ROMAN_ONES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        StringBuilder romanNumeral = new StringBuilder();
        int thousands = num / 1000;
        romanNumeral.append(ROMAN_THOUSANDS[thousands]);
        num %= 1000;

        int hundreds = num / 100;
        romanNumeral.append(ROMAN_HUNDREDS[hundreds]);
        num %= 100;

        int tens = num / 10;
        romanNumeral.append(ROMAN_TENS[tens]);
        num %= 10;

        romanNumeral.append(ROMAN_ONES[num]);
        return romanNumeral.toString();
    }
}

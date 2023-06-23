class WorkWithLine {

    public static byte convectorToArabic(String romanNumeral) throws Exception {
        byte numeralResult = 0;
        switch (romanNumeral) {
            case "I" -> numeralResult += 1;
            case "II" -> numeralResult += 2;
            case "III" -> numeralResult += 3;
            case "IV" -> numeralResult += 4;
            case "V" -> numeralResult += 5;
            case "VI" -> numeralResult += 6;
            case "VII" -> numeralResult += 7;
            case "VIII" -> numeralResult += 8;
            case "IX" -> numeralResult += 9;
            case "X" -> numeralResult += 10;
            default -> throw new Exception("Неподходящая Римская цифра");
        }
        return numeralResult;
    }

    public static String convectorToRoman(int arabicNumeral) throws Exception {
        if (arabicNumeral < 1) {
            throw new Exception("Римская цифра не может быть меньше единицы!");
        }
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        int tensResult = arabicNumeral / 10;
        int onesResult = arabicNumeral % 10;
        return tens[tensResult] + ones[onesResult];
    }
}
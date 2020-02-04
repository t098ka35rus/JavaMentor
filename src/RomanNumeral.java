class RomanNumeral {

        RomanNumeral() {
        }
        public String toRoman(int number) {
            int[] arab = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
            String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
            String s = "";

            for (int i = 0; i < arab.length -1; i++) {
                if (number == arab[i]) { return roman[i];}
            }
            for (int i = arab.length -1; i >= 0;) {
                if ((arab[i] - number) <= 0) {
                s = s + roman[i];
                number = number - arab[i];
                }
            else i--;
            }
            return s;
        }
    }




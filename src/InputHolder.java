import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.MatchResult;

class InputHolder {

   InputHolder(){}

    private int a;
    private int b;
    private String c = "1";
    private String d = "1";

    int getA() {
        return a;
    }
    int getB() {
        return b;
    }
    String getC() {
        return c;
    }
    String getD() { return d; }


    void ParceInput() throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String string = bufferedReader.readLine();

            Scanner scanner = new Scanner(string);
            try {
                scanner.findInLine("^(\\w{1,5})\\s*([\\+,\\-,\\*,\\/])\\s*(\\w{1,5})$");
                MatchResult result = scanner.match();
                c = result.group(2);

                Map<String,String> map = new HashMap<>();
                map.put("X","10");
                map.put("I","1");
                map.put("II","2");
                map.put("III","3");
                map.put("IV","4");
                map.put("V","5");
                map.put("VI","6");
                map.put("VII","7");
                map.put("VIII","8");
                map.put("IX","9");
                map.put("O","0");
                boolean roman = map.containsKey(result.group(1)) && map.containsKey(result.group(3));
                boolean arab = map.containsValue(result.group(1))&& (map.containsValue(result.group(3)));

                if (roman)
                {
                    a = Integer.parseInt(map.get(result.group(1)));
                    b = Integer.parseInt(map.get(result.group(3)));
                    d = "roman";

                }
                if (arab)
                {
                   a = Integer.parseInt(result.group(1));
                   b = Integer.parseInt(result.group(3));
                   d = "arab";

                }

                if (!roman && !arab)
                {
                    throw new Exception();
                }

                scanner.close();
            }
            catch (Exception e) {
                System.out.println("Неправильный ввод, e = " + e);

            }

    }



}

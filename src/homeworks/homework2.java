package homeworks;

public class homework2 {
    public static void main(String[] args) {

//1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки)
        String str1 = "моя строка";
        String str2 = "моя строка";
//        String str2 = "строка";
//        String str2 = "Что-то другое";
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else if (str1.contains(str2)) {
            System.out.println("Одна строка содержит в себе подстроку другой");
        } else {
            System.out.println("Строки не идентичны и ни одна строка не содержит в себе подстроку другой");
        }


//2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке)
        String str3 = "AACD";
        String str4 = "ACDA";
        if ((str3.length() == str4.length()) && ((str3 + str3).contains(str4))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


//3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        StringBuilder stringBuilderRev = new StringBuilder("моя строка");
        System.out.println(stringBuilderRev.reverse());


//4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
//   3 + 56 = 59, 3 – 56 = -53, 3 * 56 = 168 Используем метод StringBuilder.append()
        int a = 3;
        int b = 56;
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sum);

        StringBuilder diff = new StringBuilder();
        diff.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(diff);

        StringBuilder mult = new StringBuilder();
        mult.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(mult);


//5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt()
//        sum.deleteCharAt(7).insert(7, "равно");
//        diff.deleteCharAt(7).insert(7, "равно");
//        mult.deleteCharAt(7).insert(7, "равно");
//        System.out.println(sum + "\n" + diff + "\n" + mult);


//6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace()
        sum.replace(7, 8, "равно");
        diff.replace(7, 8, "равно");
        mult.replace(7, 8, "равно");
        System.out.println(sum + "\n" + diff + "\n" + mult);


//7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
        long timeToStringStart = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10_000; i++) {
            str += "=";
        }
        long timeToStringEnd = System.currentTimeMillis();
        long timeSpentToString = timeToStringEnd - timeToStringStart;

        long timeToStringBuilderStart = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            strBuilder.append("=");
        }
        long timeToStringBuilderEnd = System.currentTimeMillis();
        long timeSpentToStringBuilder = timeToStringBuilderEnd - timeToStringBuilderStart;

        if (timeSpentToString > timeSpentToStringBuilder) {
            System.out.println("На String потрачено больше времени, чем на StringBuilder на "
                    + (timeSpentToString - timeSpentToStringBuilder) + " милисекунд");
        } else {
            System.out.println("На StringBuilder потрачено больше времени, чем на String на "
                    + (timeSpentToStringBuilder - timeSpentToString) + " милисекунд");
        }

    }
}

package by.ruslan.radevich.lessons10;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Example: ");
        builder.append("first")
                .append(" ")
                .append("example");
        builder.setCharAt(0, 'E');//поставили вместо первого символа '1'
        builder.insert(9, "First "); //поставили строку с 0 символа
        builder.delete(15, 20);//удаляет с 15 по 20
        System.out.println(builder.indexOf("first"));//ищем first
        //System.out.println(builder.replace(0,2,"abc"));//с 0 по 3 ставит абс
        builder.reverse();// вывод задом наперед
        builder.deleteCharAt(0);// удалить какоито символ

        String result = builder.toString();
        System.out.println(builder.toString());

        String testcase = "This abba not";
        System.out.println(isPalindrome(1, testcase));
        System.out.println(isPalindrome(2, testcase));
        System.out.println(isPalindrome(10, testcase));
        System.out.println(isPalindrome(3, testcase));


    }

    private static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }

    private static boolean isNewPalindrome(String str) {
        char[] arr = str.toCharArray();
        int size = arr.length / 2;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int number, String str) {
        String[] arr = str.split(" ");//делим пробелами
        if (number > arr.length) {
            System.out.println("number is too long");
            return false;
        }
        return isPalindrome(arr[number - 1]);//isNewPalindrome
    }
}

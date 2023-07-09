package MrKeeplearning.programmers.lv0.algo181943;

public class Replace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        int startIndex = 6;
        int endIndex = 10;
        String str = "Davi";
        String result = sb.replace(startIndex, endIndex, str).toString();
        System.out.println(result);
    }
}
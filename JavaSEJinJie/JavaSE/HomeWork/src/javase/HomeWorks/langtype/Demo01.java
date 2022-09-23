package javase.HomeWorks.langtype;

public class Demo01 {
    public static void main(String[] args) {
        byte b = Byte.parseByte("100");
        System.out.println(b);
        short s = Short.parseShort("100");

        int num = Integer.parseInt("100");

        long l = Long.parseLong("100");

        float f = Float.parseFloat("100.0");

        double d = Double.parseDouble("100.0");

        boolean boo = Boolean.parseBoolean("true");

        char c = "a".charAt(0);
        System.out.println(c);

    }
}

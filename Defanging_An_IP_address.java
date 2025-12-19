public class Defanging_An_IP_address {

    public static String ip(String adrrs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < adrrs.length(); i++) {
            if (adrrs.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(adrrs.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String adrrs = "1.1.1.1";
        System.out.println(ip(adrrs));
    }
}

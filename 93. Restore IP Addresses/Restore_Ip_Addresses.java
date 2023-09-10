import java.util.ArrayList;
import java.util.List;

class Restore_Ip_Addresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        for (int alen = 1; alen <= 3; alen++) {
            for (int blen = 1; blen <= 3; blen++) {
                for (int clen = 1; clen <= 3; clen++) {

                    int dlen = len - alen - blen - clen;

                    if (dlen > 0 && dlen <= 3) {
                        int A = Integer.parseInt(s.substring(0, alen));
                        int B = Integer.parseInt(s.substring(alen, alen + blen));
                        int C = Integer.parseInt(s.substring(alen + blen, alen + blen + clen));
                        int D = Integer.parseInt(s.substring(alen + blen + clen));

                        if (A <= 255 && B <= 255 && C <= 255 && D <= 255) {
                            sb.append(A).append(".").append(B).append(".").append(C).append(".").append(D);

                            if (sb.length() == len + 3) {
                                res.add(sb.toString());
                            }
                            sb.setLength(0); // Clear the StringBuilder
                        }
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Restore_Ip_Addresses solution = new Restore_Ip_Addresses();
        String s = "25525511135";
        List<String> result = solution.restoreIpAddresses(s);
        System.out.println(result);
    }
}

package com.prasad.assignment;

import java.nio.charset.StandardCharsets;

public class Add2BinaryStrings {

    public static void main(String[] args) {
        String s1 = "1010110111001101101000";
        String s2 = "1000011011000000111100110";

        String s3 = "100";
        String s4 = "111";


        System.out.println(addBinary(s3,s4));
    }

    public static String addBinary(String A, String B) {
        int al = A.length();
        int bl = B.length();

        StringBuilder sb = new StringBuilder();
        int carryForward = 0;

        while (al > 0 || bl > 0) {
            int sum = 0;
            if (al > 0) sum += (int) (A.charAt(al - 1)) - 48;
            if (bl > 0) sum += (int) (B.charAt(bl - 1)) - 48;
            sum += carryForward;

            sb.append(sum  % 2);
            carryForward = sum/2;
            al--;
            bl--;
        }
        if (carryForward != 0) sb.append(carryForward);
        sb.reverse();
        return sb.toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madhavadabare
 */
public class Naive {

    static String NSM(String text, String pattern) {
        String result = "";
        String[] T = text.split(""), P = pattern.split("");

        int index = 0;

        while (index < T.length - P.length + 1) {
            int k = 0;
            while (k < P.length) {
                if (!T[index + k].equals(P[k])) {
                    break;
                }
                k++;
            }
            if (k == P.length) {
                result += index + " ";
            }
            index++;
        }
        return result;
    }

    static String Naive(String text, String pattern) {
        String result = "";
        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            if (text.subSequence(i, i + pattern.length()).equals(pattern)) {
                result += i + " ";
            }
        }
        return result;
    }
}

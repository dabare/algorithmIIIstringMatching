/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madhavadabare
 */
public class subString {

    static String[] substring(String str) {
        int len = str.length();
        String sub[] = new String[(len * (len + 1)) / 2];

        int index = 0;

        for (int i = 1; i < sub.length + 1; i++) {
            int j = 0;
            while (j < len) {
                if (j + i < len + 1) {
                    sub[index] = str.substring(j, j + i);
                    index++;
                }
                j++;
            }
        }
        return sub;
    }
}

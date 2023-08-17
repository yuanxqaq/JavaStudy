package string.exer2;

import org.junit.Test;

/**
 * ClassName: StringTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/23 22:55
 * @Version 1.0
 */
public class StringTest {
    @Test
    public void test1() {
        String s = "abcdefg";
        String s1 = reverse(s, 2, 5);
        String s2 = reverse1(s, 2, 5);
        System.out.println(s1);
        System.out.println(s2);
    }

    /*
     * 方式1：将string转为char数组，针对char数组进行相应位置的反转，反转以后将char[]转为string
     * */
    public String reverse(String str, int fromIndex, int toIndex) {
        char[] arr = str.toCharArray();
        for (int i = fromIndex, j = toIndex; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    public String reverse1(String str, int fromIndex, int toIndex) {
        //获取str的第一部分
        String finalStr = str.substring(0, fromIndex);
        for (int i = toIndex; i >= fromIndex; i--) {
            finalStr += str.charAt(i);
        }
        finalStr += str.substring(toIndex + 1);

        return finalStr;
    }

    /* @Description:
     * @Param [str, subStr]
     * @return
     */
    public int getSubStringCount(String str, String subStr) {
        int count = 0;
        if (str.length() >= subStr.length()) {

            int index = str.indexOf(subStr);
            while (index >= 0) {
                count++;

                index = str.indexOf(subStr, index + subStr.length());
            }
        }
        return count;

    }

    @Test
    public void test2() {
        String subStr = "ab";
        String str = "abadjkakfbfhdjabdjaskdab";

        int count = getSubStringCount(str,subStr);
        System.out.println(count);

    }
}

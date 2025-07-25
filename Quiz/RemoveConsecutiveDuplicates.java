package Quiz;

public class RemoveConsecutiveDuplicates {
    // 基础要求：连续3个及以上字符移除
    public static String reduceBasic(String s) {
        boolean changed = true;
        while (changed) {
            changed = false;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
                if (j - i >= 3) {
                    changed = true; // 标记本轮有变化
                } else {
                    sb.append(s, i, j);
                }
                i = j;
            }
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        // Stage 1
        System.out.println("Stage 1 (Basic):");
        String input1 = "aabcccbbad";
        System.out.println("Input: " + input1);
        String result1 = reduceBasic(input1);
        System.out.println("Final output: " + result1);
        System.out.println();
    }
}

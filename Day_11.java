import java.util.*;
public class Day_11 {
   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input: ");
            String s = sc.nextLine();

            List<String> result = permuteUnique(s);

            System.out.println("Output: " + result);
        }

        public static List<String> permuteUnique(String s) {
            List<String> res = new ArrayList<>();
            boolean[] used = new boolean[s.length()];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            backtrack(res, new StringBuilder(), chars, used);
            return res;
        }

        private static void backtrack(List<String> res, StringBuilder path, char[] chars, boolean[] used) {
            if (path.length() == chars.length) {
                res.add(path.toString());
                return;
            }

            for (int i = 0; i < chars.length; i++) {
                if (used[i]) continue;
                if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

                used[i] = true;
                path.append(chars[i]);
                backtrack(res, path, chars, used);
                path.deleteCharAt(path.length() - 1);
                used[i] = false;
            }
        }
    }



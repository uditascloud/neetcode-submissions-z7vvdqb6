class Solution {

    void findCombi(int index, String digits, StringBuilder str,
                   List<String> result, Map<Integer, String> mp) {

        if (index == digits.length()) {
            result.add(str.toString());
            return;
        }

        String curr = mp.get(digits.charAt(index) - '0');

        for (int i = 0; i < curr.length(); i++) {
            str.append(curr.charAt(i));
            findCombi(index + 1, digits, str, result, mp);
            str.deleteCharAt(str.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        Map<Integer, String> mp = Map.of(
            2, "abc",
            3, "def",
            4, "ghi",
            5, "jkl",
            6, "mno",
            7, "pqrs",
            8, "tuv",
            9, "wxyz"
        );

        List<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        findCombi(0, digits, str, result, mp);
        return result;
    }
}
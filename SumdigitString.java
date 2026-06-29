class SumdigitString {
    public static void main(String[] args) {
        String s = "sachin";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        System.out.println(sum);
    }
}
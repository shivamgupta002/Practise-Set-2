class Solution2 {
    public static void main(String[] args) {
        char gr = 'A';
        char fi = (char) (gr + 8);
        System.out.print("After Encrypt:");
        System.out.println(fi);
        System.out.print("After Decrypt:");
        System.out.println((char) (fi - 8));
    }
}
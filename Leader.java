
class Leader {
    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int no = 0;

        System.out.print("Leaders: ");
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > no) {
                no = a[i];
                System.out.print(a[i] + " ");
            }
        }
    }
}


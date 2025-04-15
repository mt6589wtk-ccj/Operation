public class IndexValueMatch {
    public static void main(String[] args) {
        int[] data = {0, 3, 2, 5, 4, 5, 6, 7, 8};  // 可以改成你要測的陣列

        boolean found = false;

        System.out.println("陣列中元素值等於索引的位置：");

        for (int i = 0; i < data.length; i++) {
            if (data[i] == i) {
                System.out.println("索引 " + i + " 的值是 " + data[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("沒有任何元素值等於索引的位置。");
        }
    }
}

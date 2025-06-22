package java_overview;

public class Bai7 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = i++ + j++;//i=2, j=2
        //a = 1 + 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }

    public static class Bai7B {
        public static void main(String[] args) {
            int i = 1, j = 1;
            int a = i++ + ++j;//i=2,j=2
            //a= 1 + 2 = 3

            System.out.println("i=" + i);
            System.out.println("j=" + j);
            System.out.println("a=" + a);
        }
    }

    public static class Bai7C {
        public static void main(String[] args) {
            int i = 1, j = 1;
            int a = ++i + j++;//i=2,j=2
    //      a = 2 + 1 = 3
            System.out.println("i=" + i);
            System.out.println("j=" + j);
            System.out.println("a=" + a);
        }
    }

    public static class Bai7D {
        public static void main(String[] args) {
            int i = 1, j = 1;
            int a = ++i + ++j;//i=2,j=2
    //      a = 2 + 2 = 4
            System.out.println("i=" + i);
            System.out.println("j=" + j);
            System.out.println("a=" + a);
        }
    }

    public static class Bai7E {
        public static void main(String[] args) {
            int i = 1, j = 1;
            int a = i++ + j++ + i++ + j++;//i=3,j=3
    //      a = 3 + 3 = 6
            System.out.println("i=" + i);
            System.out.println("j=" + j);
            System.out.println("a=" + a);
        }
    }

    public static class Bai7F {
        public static void main(String[] args) {
            int i = 1, j = 1;
            int a = ++i + ++j + i++ + j++;//i=3,j=3
    //      a = 2 + 2 + 2 + 2 = 8
            System.out.println("i=" + i);
            System.out.println("j=" + j);
            System.out.println("a=" + a);
        }
    }

    public static class Bai7G {
        public static void main(String[] args) {
            int i = 1;
            int a = i++ + ++i - i-- - --i;//i=2->3->2->1
    //      a = 1 + 3 - 3 - 1 = 0
            System.out.println("i=" + i);
            System.out.println("a=" + a);
        }
    }

    public static class Bai7H {
        public static void main(String[] args) {
            int a = 10;
            a += a++ + ++a;
    //a=a + a++ + ++a
    //a = 10 + 10 + 12 = 32
            System.out.println("a = " + a);
        }
    }
}

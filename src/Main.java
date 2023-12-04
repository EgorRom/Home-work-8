public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        int[] i = new int[12];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] f = {1.57, 7.654, 9.956};
        int[] t = {25, 23, 26, 14, 15, 28};

        System.out.println("Задание №2");
        for (int indexI = 0; indexI < i.length; indexI++) {
            if (indexI == i.length - 1) {
                System.out.println(i[indexI]);
                break;
            }
            System.out.print(i[indexI] + ", ");
        }
        System.out.println();
        for (int indexF = 0; indexF < f.length; indexF++) {
            if (indexF == f.length - 1) {
                System.out.println(f[indexF]);
                break;
            }
            System.out.print(f[indexF] + ", ");
        }
        for (int indexT = 0; indexT < t.length; indexT++) {
            if (indexT == t.length - 1) {
                System.out.println(t[indexT]);
                break;
            }
            System.out.print(t[indexT] + ", ");
        }
        System.out.println("Задание №3");
        for (int indexI = i.length - 1; indexI >= 0; indexI--) {
            if (indexI == 0) {
                System.out.println(i[indexI]);
                break;
            }
            System.out.print(i[indexI] + ", ");
        }
        for (int indexF = f.length - 1; indexF >= 0; indexF--) {
            if (indexF == 0) {
                System.out.println(f[indexF]);
                break;
            }
            System.out.print(f[indexF] + ", ");
        }
        for (int indexT = t.length - 1; indexT >= 0; indexT--) {
            if (indexT == 0) {
                System.out.println(t[indexT]);
                break;
            }
            System.out.print(t[indexT] + ", ");
        }
        System.out.println("Задание №4");
        for (int indexT = 0; indexT < t.length; indexT++) {
            if (t[indexT] % 2 != 0) {
                t[indexT]++;
            }
            System.out.print(t[indexT] + ", ");
        }



    }
}
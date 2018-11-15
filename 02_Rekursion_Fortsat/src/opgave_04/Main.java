package opgave_04;

import java.io.File;

public class Main {

    public static void scanDir(String path) {
        System.out.println("[DIR] " + path);

        File file = new File(path);
        String[] names = file.list();

        for (String name : names) {
            String newPath = path + "/" + name;
            if ((new File(newPath)).isDirectory()) {
                scanDir(newPath);
            }
        }
    }

    public static int scanDirCountHelper(String path) {
        return scanDirCount(path, 1);
    }

    public static int scanDirCount(String path, int counter) {
        File file = new File(path);
        String[] names = file.list();

        for (String name : names) {
            String newPath = path + "/" + name;

            if ((new File(newPath)).isDirectory()) {
                counter = scanDirCount(newPath, counter + 1);

            }
        }
        return counter;
    }

    public static int scanDirWhiteSpaceHelper(String path) {
        return scanDirWhiteSpace(path, 1);
    }

    public static int scanDirWhiteSpace(String path, int counter) {
        String text = "";
        for (int i = 0; i < counter; i++) {
            text = " " + text;
        }
        System.out.println("[DIR] " + text + path);

        File file = new File(path);
        String[] names = file.list();

        for (String name : names) {
            String newPath = path + "/" + name;

            if ((new File(newPath)).isDirectory()) {
                scanDirWhiteSpace(newPath, counter + 1);

            }
        }

        return counter;
    }

    public static void main(String[] args) {

        scanDir("E:\\Downloads");
        System.out.println();
        System.out.println(scanDirCountHelper("E:\\Downloads"));
        System.out.println();
        scanDirWhiteSpaceHelper("E:\\Downloads");

    }

}

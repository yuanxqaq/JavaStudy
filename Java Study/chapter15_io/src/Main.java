import java.io.File;

public class Main {
    public static void main(String[] args) {
        String directoryPath;

        if (args.length > 0) {
            // 如果指定了参数，则使用指定目录
            directoryPath = args[0];
        } else {
            // 否则使用当前目录
            directoryPath = "../";
        }

        File directory = new File(directoryPath);
        printDirectoryListing(directory, 0);
    }

    private static void printDirectoryListing(File directory, int level) {
        // 打印目录名称（带缩进）
        printIndentation(level);
        System.out.println(directory.getName() + "/");

        // 获取目录下的所有文件和子目录
        File[] files = directory.listFiles();

        if (files != null) {
            // 遍历文件和子目录
            for (File file : files) {
                if (file.isDirectory()) {
                    // 递归调用自身处理子目录
                    printDirectoryListing(file, level + 1);
                } else {
                    // 打印文件名称（带缩进）
                    printIndentation(level + 1);
                    System.out.println(file.getName());
                }
            }
        }
    }

    private static void printIndentation(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  "); // 使用两个空格作为缩进
        }
    }
}

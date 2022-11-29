import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InnoProject {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\Программирование\\QQ.txt";
        File file = new File(path);
        Scanner in = new Scanner(file);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of levels:");
        int k = scanner.nextInt();
        int x = 0;
        if (k % 2 == 0) {
            x = k / 2;
        } else if (k % 2 == 1) {
            x = (k + 1) / 2;
        }
        ArrayList<String>[] questions = new ArrayList[k];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = new ArrayList<>();
        }
        ArrayList<String>[] answers = new ArrayList[k];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = new ArrayList<>();
        }
        String s = "";
        ArrayList<String> sc = new ArrayList();
        ArrayList<String> sc1 = new ArrayList();
        while (in.hasNext()) {
            s = in.nextLine();
            if (s.charAt(0) == '?') {
                sc.add(s.substring(1));
            }
            if (s.charAt(0) == '*') {
                sc1.add(s.substring(1,2));
            }

        }
        in.close();

        int l = 0;
        for (int i = 0; i < k; i++) {
            if (i < (x - 1)) {
                for (int j = 0; j < 2 * (i + 1); j++) {
                    questions[i].add(sc.get(l));
                    answers[i].add(sc1.get(l));
                    l++;
                }
            } else if (i > (x - 1)) {
                for (int j = 0; j < 2 * (k - (i + 1)) + 1; j++) {
                    questions[i].add(sc.get(l));
                    answers[i].add(sc1.get(l));
                    l++;
                }
            } else if ((x - 1) == i) {
                if (k % 2 == 0) {
                    for (int j = 0; j < 2 * (k - (i + 1)); j++) {
                        questions[i].add(sc.get(l));
                        answers[i].add(sc1.get(l));
                        l++;
                    }
                } else if (k % 2 == 1) {
                    for (int j = 0; j < 2 * (k - (i + 1)) + 1; j++) {
                        questions[i].add(sc.get(l));
                        answers[i].add(sc1.get(l));
                        l++;
                    }
                }
            }
        }
        int i = x - 1;
        int j = 0;
        int br = 0;
        int t = 0;
        String d = "";
        ArrayList<String> sorted = new ArrayList();
        while (true) {
            if (br == k) break;
            if (!sorted.contains(questions[i].get(j))) {
                sorted.add(questions[i].get(j));
                System.out.println(questions[i].get(j));
                d = scanner.next();
                if (d.equals(answers[i].get(j))) {
                    j++;
                    if (t > 1) {
                        j = j - t;

                    }
                    if (j == 2) {
                        j = 0;
                        i++;

                    }
                } else {
                    j++;
                    if (t >= 1) {
                        j = j - t;
                        t = 0;
                    }
                    if (j == 2) {
                        j = 0;
                        i--;
                    }
                }
            } else {
                if (j == 0) {
                    j = 1;
                }
                j++;
                t++;
                br--;

            }
            br++;
        }
    }
}

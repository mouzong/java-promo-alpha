package recherches;

public class Test_Split {
            public static void main(String args[]) {
            String data = "Bonjour,hello,world,,Joe,good,,";
            String[] split = data.split(",");
            for (int i = 0; i < split.length; i++) System.out.print("\t\t"+split[i]);

            System.out.println("Done");
        }
    }


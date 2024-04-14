package recherches;

public class Test_Indexe {
    public static void main(String[] args) {
        String userInfo = "135|bender|bender@gmail.com";
        System.out.println(getUserEmail(userInfo));
        // Output: bender@gmail.com
    }

    static String getUserEmail(String userInfo) {
        String[] data = userInfo.split("\\|");
        return data[2]; // or data[data.length - 1]
    }
}

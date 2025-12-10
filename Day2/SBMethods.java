public class SBMethods {

    //String Builder all methods

    public static void appendDemo(StringBuilder sb) {
        sb.append(" World");
        System.out.println("append: " + sb);
    }

    public static void insertDemo(StringBuilder sb) {
        sb.insert(5, ",");
        System.out.println("insert: " + sb);
    }

    public static void deleteDemo(StringBuilder sb) {
        sb.delete(5, 6);
        System.out.println("delete: " + sb);
    }

    public static void deleteCharAtDemo(StringBuilder sb) {
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " + sb);
    }

    public static void replaceDemo(StringBuilder sb) {
        sb.replace(0, 5, "Hi");
        System.out.println("replace: " + sb);
    }

    public static void reverseDemo(StringBuilder sb) {
        sb.reverse();
        System.out.println("reverse: " + sb);
    }

    public static void lengthDemo(StringBuilder sb) {
        System.out.println("length: " + sb.length());
    }

    public static void charAtDemo(StringBuilder sb) {
        System.out.println("charAt(2): " + sb.charAt(2));
    }

    public static void capacityDemo(StringBuilder sb) {
        System.out.println("capacity: " + sb.capacity());
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        appendDemo(sb);
        insertDemo(sb);
        deleteDemo(sb);
        deleteCharAtDemo(sb);
        replaceDemo(sb);
        reverseDemo(sb);
        lengthDemo(sb);
        charAtDemo(sb);
        capacityDemo(sb);
        System.out.println(sb);
    }
}


public class String_builder {
    // strings are immutable in java
    // declaration of string builder
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(0, 's');
        System.err.println(sb);

        // delete the extra "n";
        sb.delete(2, 4);
        System.out.println(sb);

    }

}

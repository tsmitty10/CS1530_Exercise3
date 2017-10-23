public class Exercise3 {
    public static void main(String[] args) {
        int num = 0;
        if (args.length != 1) {
            System.out.println("Wrong number of arguments");
            System.exit(1);
        }
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("You must provide an integer");
            System.exit(1);
        }
        System.out.println("Tri(" + num + ") = " + triangle(num));
        System.out.println("Lazy(" + num + ") = " + lazyCaterer(num));
    }

    public static int triangle(int num) {
        int result = 0;
        while (num != 0) {
            result += num;
            num--;
        }
        return result;
    }

    public static int lazyCaterer(int num){
        return (int)((Math.pow(num, 2) + num + 2)/2);
    }
}

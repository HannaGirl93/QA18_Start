 public class Main {

        public static void main(String[] args) {
            SeleniumStart var = new SeleniumStart();
            SeleniumStart var1 = new SeleniumStart();
            var1.i = 5;
            SeleniumStart var2 = new SeleniumStart();
            var2.i = 7;
            var.nonStatic();
            var1.nonStatic();

            SeleniumStart.staticMethod();

            String s = "qwer";
            s.toUpperCase();
        }

}

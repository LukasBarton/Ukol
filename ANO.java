public class ANO {
    public static void main(String[] args) {
                int i;
                int num = 0;
                int max = 100;
                boolean prime = true;

                String primenum = "";

                for (i = 1; i <= max; i++) {
                    prime = Checkprime(i);
                    if (prime) {
                        primenum = primenum + i + " ";
                    }
                }
                System.out.println("prvocisla od 1 do " + max + " jsou:");

                System.out.println(primenum);
            }
            public static boolean Checkprime(int number) {
                int zb;
                for (int i = 2; i <= number / 2; i++) {
                    zb = number % i;

                    if (zb == 0) {
                        return false;
                    }
                }
                return true;

            }

        }
public class test {
        public static void main (String [] args) {
            String alph = "abcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    for (int z = 0; z < 26; z++) {
                        for (int k = 0; k < 26; k++) {
                            System.out.println(alph.substring(i, i+1) +
                                    alph.substring(j, j+1) +
                                    alph.substring(z, z+1) +
                                    alph.substring(k, k+1));
                        }
                    }
                }
            }
        }
}

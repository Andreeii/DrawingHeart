public class Method1 {
    public static void heart(){

        int l = 10;
        int a = 5;
        for (int j = 0 ;j< 6;j++) {

            for (int i = 0; i < a; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < l; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < a; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < a; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < l; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < a; i++) {
                System.out.print(" ");
            }

            l+=2;
            a--;
            System.out.println();
        }

        int r = 4*a+2*l;
        int k =r;
        int o = 0;

        for (int j = 0 ;j<r/2;j++) {
            if(o>0) {
                for (int i = 0; i < o; i++) {
                    System.out.print(" ");
                }
            }
            for (int i = k; i >0;i-- ) {
                System.out.print("*");

            }

            for (int i = 0 ;i<o;i++){
                System.out.print(" ");
            }
            System.out.println();
            k-=2;
            o++;

        }

    }
}

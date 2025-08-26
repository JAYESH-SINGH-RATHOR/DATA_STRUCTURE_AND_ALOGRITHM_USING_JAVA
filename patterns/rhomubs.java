public class rhomubs {
    public static void patt(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n  ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void hollow_rombus(int n ){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }
                for(int j  = 1; j <= n; j++){
                    if( j == 1 || j ==n || i == 1 || i == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    

    public static void main(String[] args) {
        patt(5);
        hollow_rombus(5);
    }
}

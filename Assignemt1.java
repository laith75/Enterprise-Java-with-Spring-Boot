

public class Assignemt1 {
    public static void main(String[] args) {
        int n = 14;

        // problem 1
        // print I neuron
        System.out.println("problem 1: ");
        for (int i = 0; i < n; i++) {

            // print I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == (n - 1) / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

                System.out.print("        ");

            // print N
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n-1 || i == j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            System.out.print("   ");

            // print E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n-1)/2 || i == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("   ");

            // print U
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < n-2 || i == n-1 && j > (n-1)/3 && j < n-5 || j == n-1 && i < n-2 ||i == n-2 && j == 1 || i == n-2 && j == n-2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("   ");

            // print R
            for (int j = 0; j < n; j++) {
                if (  j == 0 ||  i - j == (n)/10 && i > (n-1)/2|| i == (n-1)/2 && j < n-4 || i == 0 && j < n-4 || j == n-1 && i > 1 && i < ((n-1)/2) - 1 || i == ((n-1)/2) -1 && j == n-2 || i == 1 && j == n-2)

                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("   ");

            // print O
            for (int j = 0; j < n; j++) {
                if ( i == 1 && j == n-2||i == n-2 && j == 1 || i == 1 && j == 1|| i == n-2 && j == n-2 || i == 0 && j > 3 && j < n-3 || i == n-1 && j > 3 && j < n-3 || j == 0 && i > 1 && i < n-2 || j == n-1 && i > 1 && i < n-2)

                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("   ");

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n-1 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("   ");


                System.out.println();


        }
         //problem 2
        System.out.println("Problem2 : ");
        int x = 4;
        for(int i = 0 ; i < x ; i ++){

            for(int j = 0 ; j < x ; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }


        //problem3
        System.out.println("problem3 :");
        for(int i = 0 ; i < n ; i ++){

            for(int j = 0 ; j < n ; j++){
                if(i == 0 ||i == n-1 || j == 0 && i >= (n-1)/2 || j == n-1 && i >= (n-1)/2 || i + j < (n)/2 || j - i > (n-1)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

         // problem 4
        System.out.println("problem4 :");
        for(int i = 0 ; i < n ; i ++){

        for(int j = 0 ; j < n ; j++){
        if(i == n-1 || j == 0 && i >= (n-1)/2 || j == n-1 && i >= (n-1)/2 || i - j >= (n-1)/2 || i + j >= (n-1) + (n-1)/2)
               System.out.print("*");
        else
               System.out.print(" ");
        }
        System.out.println();
        }


        //problem 5
        System.out.println("problem5 :");
        for(int i = 0 ; i < n ; i ++){
             for(int j = 0 ; j < n ; j++){
                    if(i == 0 || i == n-1 || j == 0 || i + j <= (n-1)/2 || i - j >= (n-1)/2 )
                        System.out.print("*");
                    else
                        System.out.print(" ");
        }
        System.out.println();
        }


















    }

    }

// I
//i == 0 || i == n-1 || j == (n-1)/2

// N
// j == 0 || j == n-1 || i == j

// E
// j == 0 || i == 0 || i == (n-1)/2 || i == n-1

// O
// i == 1 && j == n-2||i == n-2 && j == 1 || i == 1 && j == 1|| i == n-2 && j == n-2 || i == 0 && j > 3 && j < n-3 || i == n-1 && j > 3 && j < n-3 || j == 0 && i > 1 && i < n-2 || j == n-1 && i > 1 && i < n-2

// U
// j == 0 && i < n-2 || i == n-1 && j > 4 && j < n-5 || j == n-1 && i < n-2 ||i == n-2 && j == 1 || i == n-2 && j == n-2

// R
//  j == 0 ||  i - j == (n)/10 && i > (n-1)/2|| i == (n-1)/2 && j < n-4 || i == 0 && j < n-4 || j == n-1 && i > 1 && i < ((n-1)/2) - 1 || i == ((n-1)/2) -1 && j == n-2 || i == 1 && j == n-2)

// problem 2
// int n = 4;
//        for(int i = 0 ; i < n ; i ++){
//
//            for(int j = 0 ; j < n ; j++){
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }
//
//    }


//problem3
// int n = 16;
//        for(int i = 0 ; i < n ; i ++){
//
//            for(int j = 0 ; j < n ; j++){
//                if(i == 0 ||i == n-1 || j == 0 && i >= (n-1)/2 || j == n-1 && i >= (n-1)/2 || i + j < (n)/2 || j - i > (n-1)/2)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }



// problem 4
//int n = 14;
//        for(int i = 0 ; i < n ; i ++){
//
//        for(int j = 0 ; j < n ; j++){
//        if(i == n-1 || j == 0 && i >= (n-1)/2 || j == n-1 && i >= (n-1)/2 || i - j >= (n-1)/2 || i + j >= (n-1) + (n-1)/2)
//        System.out.print("*");
//        else
//        System.out.print(" ");
//        }
//        System.out.println();
//        }


//problem 5
//int n = 15;
//        for(int i = 0 ; i < n ; i ++){
//
//        for(int j = 0 ; j < n ; j++){
//        if(i == 0 || i == n-1 || j == 0 || i + j <= (n-1)/2 || i - j >= (n-1)/2 )
//        System.out.print("*");
//        else
//        System.out.print(" ");
//        }
//        System.out.println();
//        }

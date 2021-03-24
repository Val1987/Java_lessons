package lesson2.homework;

public class OnlineWork2 {

    public static void main(String[] args) {
 /*     char myChar = 'H';
        int myInt = 72;

        System.out.println(myChar);
        System.out.println(myInt);

        System.out.println((int) myChar);
        System.out.println((char) myInt);

  */

/*      int a = 20;
        int b = 10;
        int result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        result = (a > b) ? a : b; // тернарный оператор.

        System.out.println("Result = " + result);
 */

/*        String name = "Asshole";
        if (name == "Elena") {
            System.out.println("Send letter to Elena");
        } else if (name == "Boris") {
            System.out.println("Send letter to Boris");
        } else if (name == "Alisa") {
            System.out.println("Send letter to Alisa");
        } else {
            System.out.println("Go out office");
        }

        System.out.println("=======================================================================");

        switch (name) {
            case "Elena":
                System.out.println("Send letter to Elena");
                break;
            case "Boris":
                System.out.println("Send letter to Boris");
                break;
            case "Alisa":
                System.out.println("Send letter to Alisa");
                break;
            default:
                System.out.println("Go out office");
                break;
        }
*/

/*        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello!" + i);
        }
*/

/*        System.out.println(myMath(2, 10));
          pifagorTable(10,10);
*/



/*        int abc = 0;

        while (abc <10) {
            abc++;
            if (abc == 4 || abc == 7) continue;
            System.out.print(abc + " | ");
        }
        System.out.println("\n=============================================");

        int def = 0;

        do {
            def++;
            if (def > 5) break;
            System.out.print(def + " | ");
        } while (def < 10);
*/

/*        int[] myArrayInt = new int[10];
        myArrayInt[0] = 5;
        myArrayInt[1] = 9;
        myArrayInt[2] = 15;
        myArrayInt[3] = 28;
        myArrayInt[4] = 109;
        myArrayInt[5] = 0;
        myArrayInt[6] = -28;
        myArrayInt[7] = 5;
        myArrayInt[8] = 9;
        myArrayInt[9] = 10;

        System.out.print(myArrayInt[3]);

        System.out.println("\n=============================================");

        for (int i = 0; i < myArrayInt.length; i++) {
            System.out.print(myArrayInt[i] + " | ");
        }

        System.out.println("\n=============================================");

        String[] myArrayString = {"Tigashov", "Valeriy", "Evgen'evich"};
        for (int i = 0; i < myArrayString.length; i++) {
            System.out.print(myArrayString[i] + " | ");
        }

        System.out.println("\n=============================================");
*/

/*        int[][] myArrayInt2 = new int[5][5];
        myArrayInt2[0][0] = 1;
        myArrayInt2[1][1] = 2;

        int count = 0;

        for (int i = 0; i < myArrayInt2.length; i++) {
            for (int j = 0; j < myArrayInt2[i].length; j++) {
                myArrayInt2[i][j] = count;
                count++;

            }
        }

        for (int i = 0; i < myArrayInt2.length; i++) {
            for (int j = 0; j < myArrayInt2[i].length; j++) {
                System.out.print(myArrayInt2[i][j] + " | ");
               }
            System.out.println();
        }
*/

    }
 /*   public static int myMath(int base, int signature) {
        int result = 1;
        for (int i = 1; i <= signature; i++) {
            result = result * base;
        }
        return result;
    }
*/
/*   public static void pifagorTable(int width, int height) {
        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= width; x++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }
     }
*/

}

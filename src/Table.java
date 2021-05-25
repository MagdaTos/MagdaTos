// struktury pozwalające gromadzić większą ilośc danych
public class Table {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michał";

//odwoływanie się do imion w tablicy
/*        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);*/

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
        System.out.println(lottoNumbers[0]); //odwołujemy się do pierwszego miejsca, bo numerujemy od 0
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);
//poniżej wywołanie długości tablicy
        System.out.println(lottoNumbers.length);

      // wywołanie w pętli imion

      for (int i=0; i<imiona.length; i++) {
          System.out.println(imiona[i]);
      }

    }
}

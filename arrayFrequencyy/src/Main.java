public class Main {

    public static void main(String[] args) {

        int[] dizi = {5, 9, 10, 20, 9, 20, 30, 5, 10};

        int count ;
        for(int i = 0; i < dizi.length;  i++){
            count = 0;
            for(int j = 0; j < dizi.length; j++){
                if(dizi[i] == dizi[j]){
                    count++;
                }
            }
            System.out.println(dizi[i] + " sayısı dizimizde " + count + " adet var.");
            //System.out.println(Arrays.toString(diziYedek) );
        }
    }
}
public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];  //tidak langsung
        String[] stringArray2 = new String[3];  //langsung

        //Jika ingin mengubah data didalam arraynya
        stringArray[0] = "Adi";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Williams";
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        //Jika ingin mengubah lagi
        stringArray[0] = "Budi";
        System.out.println(stringArray[0]);

        //Diatas bisa dipersingkat
        String[] namaNama = {
                "Herman", "Williams","Daendels"
        };
        namaNama[0] = null; //mengubah data, bisa dengan null karena tipe data bukan primitif

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = new long[]{
                10L,20L,30L
        };
        arrayLong[0] = 0;
        System.out.println(arrayLong.length);  //mengambil panjang array

        String[][] members = {
                {"Eko","Fian"},
                {"Roberto","Kusuma"},
                {"Felix"}
        };
        System.out.println(members[0][1]); //Mengambil fian
        System.out.println(members[1][1]); //Mengambil kusuma
        System.out.println(members[2][0]); //Mengembil Felix

    }
}

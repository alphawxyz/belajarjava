public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        //Konversi primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        //Ke primitif  value value compatible
        short iniShort = iniObject.shortValue();  //dari bukan primitf ke primitif
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();



    }
}

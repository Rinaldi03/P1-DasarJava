public class R_CastingPromotion {
    public static void main(String args[]) {
        long varLong= 10000000L;
        int varint = 23456;
        varint = (int) varLong;
        varLong = varint;
        System.out.println("Nilai varLong = " + varLong);
        System.out.println("Nilai varInt = " +varint);
        char varChar= 'a';
        varint= (int) varChar;
        System.out.println("Nilai varInt ('a')" +varint);
        varChar =(char) (varint+1);
        System.out.println("Nilai Varchar = "+ varChar);
        byte varByte =127;
        varint = varByte;
        System.out.println("Nilai varInt (127) = " + varint);
        short varShort =(short) varint;
        System.out.println("Nilai varshort= "+ varShort);
        double varDouble = 3.145256718992022;
        float varFloat = (float) varDouble;
        System.out.println("Nilai varDouble = "+ varDouble);
        System.out.println("Nilai varFloat = "+ varFloat);
    }
}

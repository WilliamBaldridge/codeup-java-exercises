public class SynDatVars {

    public static void main(String[] args) {
        // Single line comment
        /* multi-line comment
         A code block*/
        {
            String sentence = "Hi, my name is";
            System.out.println(sentence);
        }

        // Scoping

//        {
//            { String nope = "not gonna fly";
//                {
//
//                }
//            }
//        }
//        System.out.println(nope);


        // Data types

        // ** BYTE, SHORT, INT, LONG **

        //byte ranges -128 to 127
        byte bite = 127;
        System.out.println(
                ((Object)bite)
                    .getClass()
                    .getName());

        // short ranges -32768 to 32767
        short shrt = 32767;
        System.out.println(
                ((Object)shrt)
                        .getClass()
                        .getName());

        // integer ranges to -2147483648 to 2147483647
        int integer = 2147483647;
        System.out.println(
                ((Object)integer)
                        .getClass()
                        .getName());

        // long ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long lng = 9223372036854775807L; // needs and "L" at the end!!
        System.out.println(
                ((Object)lng)
                        .getClass()
                        .getName());

        System.out.println(integer + 1);
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue - 1);

        // Floats F for float and D for double (a wider range of float)
        float flt = 1.1F; // needs "F" like long needs L
        float flt2 = 1873e3F;

        double adbl = 1.333334e78;

        // Boolean (second statement, after || here, could not be ran if first is true
        boolean isTrue = ((1 < 2) || (1 > 0));


        // Char




    }

}

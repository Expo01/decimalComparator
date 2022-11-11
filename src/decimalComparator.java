public class decimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        if ((numberOne-numberTwo <= .0009) && (numberOne-numberTwo >= -.0009)){
            return true;
        } return false;
    }

}

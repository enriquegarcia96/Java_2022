public class ConversionDeTipos {

    public static void main(String[] args) {
        
        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);


        String realStr = "4564.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        
        String logicoStr= "False";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
    }
    
}

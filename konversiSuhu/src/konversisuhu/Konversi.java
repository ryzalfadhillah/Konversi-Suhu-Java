package konversisuhu;

/**
 *
 * @author Ryzal
 */
public class Konversi {
    double celcius;

    public Konversi(double celcius) {
        this.celcius = celcius;
    }
    
    void lihatDataKonversi(){
        System.out.println("\nSuhu dalam celcius\t: " + celcius + "°C");
        System.out.println("Suhu dalam Fahrenheit\t: " + celciusToFahrenheit() + "°F");
        System.out.println("Suhu dalam Reamur\t: " + celciusToReamur() + "°R");
        System.out.println("Suhu dalam Kelvin\t: " + celciusToKelvin() + "K");
    }
    
    void kondisiAir(){
        System.out.print("Kondisi air\t\t: ");
        if(celcius < 0){
            System.out.println("Beku");
        }else if (celcius > 100){
            System.out.println("Mendidih");
        }else{
            System.out.println("Normal");
        }
    }
    
    double celciusToFahrenheit(){
        return ((9 * celcius) / 5 + 32);
    }
    
    double celciusToReamur(){
        return ((4 * celcius) / 5);
    }
    
    double celciusToKelvin(){
        return (celcius + 273.15);
    }
}

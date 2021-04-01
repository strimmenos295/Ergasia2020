package mainpackage;

public class Patient extends Users{

    public Patient(int amka){
        super();
        this.AMKA= amka;
    }

    private final int AMKA;

    public void registration(){
        System.out.println("registrated");
    }

    public void SearchForSpecDoc(){
        System.out.println("search");
    }

    public void SearchForDoc(){
        System.out.println("search");
    }

    public void seeAllFutureAppointments(){
        System.out.println("Appointments");
    }

    public void HistoryOfAppointments(){
        System.out.println("Appointments");
    }

}

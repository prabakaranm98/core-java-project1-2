package OOPS_encapsulation_day11;

public class hospital_management_program {
	
	// Private attributes
    private int patientId;
    private String patientName;
    private String patientDiseases;
    private double billAmount;

    // Setter and Getter for Patient ID
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    // Setter and Getter for Patient Name
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    // Setter and Getter for Patient Diseases
    public void setPatientDiseases(String patientDiseases) {
        this.patientDiseases = patientDiseases;
    }

    public String getPatientDiseases() {
        return patientDiseases;
    }

    // Setter and Getter for Bill Amount
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("----- Patient Details -----");
        System.out.println("Patient ID       : " + patientId);
        System.out.println("Patient Name     : " + patientName);
        System.out.println("Patient Disease  : " + patientDiseases);
        System.out.println("Bill Amount      : ₹" + billAmount);
    }

    public static void main (String[] args) { 
    	
    	hospital_management_program patient=new hospital_management_program();

        // Setting values using setter methods
        patient.setPatientId(101);
        patient.setPatientName("prabakaran");
        patient.setPatientDiseases("Fever");
        patient.setBillAmount(5000);

        // Display details
        patient.displayPatientDetails();

        // Getting individual value using getter
        System.out.println("\nBill Amount using Getter: ₹" + patient.getBillAmount());
    }
}
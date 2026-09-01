abstract class InsurancePolicy{
    String policyHolder;
    double premium;
    InsurancePolicy(String policyHolder, double premium){
        this.policyHolder=policyHolder;
        this.premium=premium;
    }
    abstract void calculateClaim();
    void showDetails(){
        System.out.println("policyHolder : "+policyHolder);
        System.out.println("premium : " +premium);
    }

}
class LifeInsurance extends InsurancePolicy{
    LifeInsurance(String policyHolder, double premium){
        super(policyHolder,premium);
    }
    @Override
    void calculateClaim(){
        double claim=premium*10;
        System.out.println("Life Insurance claim : "+claim);
    }
}
class HealthInsurance extends InsurancePolicy{
    HealthInsurance(String policyHolder, double primium){
        super(policyHolder,primium);
    }
    @Override
    void calculateClaim(){
        double claim= premium*5;
        System.out.println("Health Insurance claim : "+claim);
    }
}

public class Insurance {
    public static void main(String[] args) {
        LifeInsurance lifeInsurance=new LifeInsurance("Shailesh singh ", 10000);
        HealthInsurance healthInsurance=new HealthInsurance("Prayag raj singh ", 50000);
        lifeInsurance.showDetails();
        lifeInsurance.calculateClaim();

        healthInsurance.showDetails();
        healthInsurance.calculateClaim();

    }
}

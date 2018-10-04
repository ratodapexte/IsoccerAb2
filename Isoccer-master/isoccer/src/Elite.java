public class Elite extends FanSupporters{
    private double contribuition;
    private int paymentDay;

    public Elite(double contribuition, int paymentDay, String addres, String cpf, String name, String phone, String status)
    {
        super(addres, cpf, name, phone, status);
        this.contribuition = contribuition;
        this.paymentDay = paymentDay;
    }

    public double getContribuition() {
        return contribuition;
    }

    public int getPaymentDay() {
        return paymentDay;
    }

    public void setContribuition(double contribuition) {
        this.contribuition = contribuition;
    }

    public void setPaymentDay(int paymentDay) {
        this.paymentDay = paymentDay;
    }
}

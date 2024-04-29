

public class chap3_312 {
    private String partNum;
    private String partDesc;
    private double qty;
    private double price;

    public chap3_312(String partNum, String partDesc, double qty, double price) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        
        if(qty > 0.0)
            this.qty = qty;
        else
            this.price = 0.0;
        
        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;
    }

    public double calculateInvoiceAmmount() {
        return qty * price;
    }

    // getters
    public String getPartNum() {
        return this.partNum;
    }

    public String getPartDesc() {
        return this.partDesc;
    }

    public double getQTY() {
        return this.qty;
    }
    
    public double getPrice() {
        return this.price;
    }

    // setters

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public void setQTY(double qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
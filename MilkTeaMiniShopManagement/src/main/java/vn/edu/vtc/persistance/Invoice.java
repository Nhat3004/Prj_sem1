package vn.edu.vtc.persistance;

public class Invoice {
    private int id;
    private int shopId;
    private int staffId;
    private String date;
    private Double totalPayment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", shopId=" + shopId +
                ", staffId=" + staffId +
                ", date='" + date + '\'' +
                ", totalPayment=" + totalPayment +
                '}';
    }
}

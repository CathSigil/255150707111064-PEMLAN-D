package Tuprak8;

public class Invoice implements Payable {
    
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;
    
    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName  = productName;
        this.quantity     = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName()  { return productName; }
    public Integer getQuantity()    { return quantity; }
    public Integer getPricePerItem(){ return pricePerItem; }

    // Implementasi interface Payable
    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem; 
    }


    public void displayInfo() {
        System.out.println("  Produk       : " + productName);
        System.out.println("  Jumlah       : " + quantity);
        System.out.println("  Harga Satuan : Rp " + pricePerItem);
        System.out.println("  Total        : Rp " + getPayableAmount());
        System.out.println("  ----------------------------");
    }
}
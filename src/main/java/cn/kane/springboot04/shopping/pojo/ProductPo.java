package cn.kane.springboot04.shopping.pojo;




import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 * --cn.kane.springboot04.shopping.pojo.ProductPo
 * @author Kane
 * Date:   2019/6/5 11:18
 * @since 1.0.0
 */
@Alias("u")
public class ProductPo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String productName;
    private int stock;
    private double price;
    private int version;
    private String note;

    public ProductPo(Long id, String productName, int stock, double price, int version, String note) {
        this.id = id;
        this.productName = productName;
        this.stock = stock;
        this.price = price;
        this.version = version;
        this.note = note;
    }

    public ProductPo() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductPo{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", version=" + version +
                ", note='" + note + '\'' +
                '}';
    }
}
/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/
// Class product merupakan child dari clothing, dan grandchild dari shirt
class Product extends Clothing
{
    // atribut private yang dibutuhkan
    private String idProduct;
    private String name;
    private String brand;
    private int price;

    // konstruktor
    public Product() {

    }
    public Product(String idProduct, String name, String brand, int price)
    {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // getter dan setter
    public String get_idProduct()
    {
        return this.idProduct;
    }
    public void set_idProduct(String idProduct)
    {
        this.idProduct = idProduct;
    }
    public String get_name()
    {
        return this.name;
    }
    public void set_name(String name)
    {
        this.name = name;
    }
    public String get_brand()
    {
        return this.brand;
    }
    public void set_brand(String brand)
    {
        this.brand = brand;
    }
    public int get_price()
    {
        return this.price;
    }
    public void set_price(int price)
    {
        this.price = price;
    }
}

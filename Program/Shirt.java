/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

class Shirt 
{
    // atribut private yang dibutuhkan
    private String color;
    private String sleeve_type;

    // konstruktor
    public Shirt() {

    }
    public Shirt(String color, String sleeve_type)
    {
        this.color = color;
        this.sleeve_type = sleeve_type;
    }
    
    // getter dan setter
    public String get_color()
    {
        return color;
    }
    public void set_color(String color)
    {
        this.color = color;
    }
    public String get_sleeve_type()
    {
        return sleeve_type;
    }
    public void set_sleeve_type(String sleeve_type)
    {
        this.sleeve_type = sleeve_type;
    }
}

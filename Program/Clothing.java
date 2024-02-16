/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// Clothing merupakan child dari shirt
class Clothing extends Shirt
{
    // atribut private yang dibutuhkan
    private String size;
    private String material;
    private char gender;

    // konstruktor
    Clothing() {

    }
    Clothing(String size, String material, char gender)
    {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }
    
    // getter dan setter
    public String get_size()
    {
        return this.size;
    }
    public void set_size(String size)
    {
        this.size = size;
    }
    public String get_material()
    {
        return this.material;
    }
    public void set_material(String material)
    {
        this.material = material;
    }
    public char get_gender()
    {
        return this.gender;
    }
    public void set_gender(char gender)
    {
        this.gender = gender;
    }
}

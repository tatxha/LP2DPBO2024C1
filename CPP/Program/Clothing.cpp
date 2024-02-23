/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// library
#include <bits/stdc++.h>
#include "Shirt.cpp"

using namespace std;

class Clothing : public Shirt
{
    // attributes
    private:
        string size, material;
        char gender;

    public:
        Clothing(){

        }

    // construct
    Clothing(string size, string material, char gender)
    {
        this->size = size;
        this->material = material;
        this->gender = gender;
    }

    // getter dan setter
    string get_size()
    {
        return this->size;
    }
    void set_size(string size)
    {
        this->size = size;
    }
    string get_material()
    {
        return this->material;
    }
    void set_material(string material)
    {
        this->material = material;
    }
    char get_gender()
    {
        return this->gender;
    }
    void set_gender(char gender)
    {
        this->gender = gender;
    }

    ~Clothing(){}; // destruct
};

/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// library
#include <bits/stdc++.h>

using namespace std;

class Shirt 
{
    private: // private attributes
        string color, sleeve_type;
    public:
        Shirt(){

        }
    // public methods
    Shirt(string color, string sleeve_type)
    {
        this->color = color;
        this->sleeve_type = sleeve_type;
    }
    // constructor
    string get_color()
    {
        return this->color;
    }
    void set_color(string color)
    {
        this->color = color;
    }
    string get_sleeve_type()
    {
        return this->sleeve_type;
    }
    void set_sleeve_type(string sleeve_type)
    {
        this->sleeve_type = sleeve_type;
    }

    ~Shirt(){}; // destruct
};

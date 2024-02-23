/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// library
#include <bits/stdc++.h>
#include "Clothing.cpp"

using namespace std;

class Product : public Clothing {
    private:
        string id_product, name, brand;
        int price;
    public:
        Product(){

        }   

    Product(string id_product, string name, string brand, int price)
    {
        this->id_product = id_product;
        this->name = name;
        this->brand = brand;
        this->price = price;
    } 

    string get_id_product()
    {
        return this->id_product;
    }
    void set_id_product(string id_product)
    {
        this->id_product = id_product;
    }
    string get_name()
    {
        return this->name;
    }
    void set_name(string name)
    {
        this->name = name;
    }
    string get_brand()
    {
        return this->brand;
    }
    void set_brand(string brand)
    {
        this->brand = brand;
    }
    int get_price()
    {
        return this->price;
    }
    void set_price(int price)
    {
        this->price = price;
    }

    ~Product(){};
};
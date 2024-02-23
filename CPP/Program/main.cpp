/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// libraruy
#include <bits/stdc++.h>
#include "Product.cpp"

using namespace std;

int main()
{
    int n = 0; cin >> n;
    list<Product> list_product;
    string idProduct, name, brand, size, material, color, sleeve_type; 
    int price;
    char gender;

    for(int i = 0; i < n; i++)
    {
        Product kproduct;
        cin >> idProduct >> name >> brand >> price >> size >> material >> gender >> color >> sleeve_type;

        kproduct.set_id_product(idProduct);
        kproduct.set_name(name);
        kproduct.set_brand(brand);
        kproduct.set_price(price);
        kproduct.set_size(size);
        kproduct.set_material(material);
        kproduct.set_gender(gender);
        kproduct.set_color(color);
        kproduct.set_sleeve_type(sleeve_type);

        list_product.push_back(kproduct);
    }

    // Menghitung panjang terpanjang untuk setiap kolom
    vector<int> longestData = {2, 4, 5, 5, 4, 8, 5, 11}; // Panjang dari header tabel
    
    for (auto it = list_product.begin(); it != list_product.end(); it++) {
        // id
        if (longestData[0] < it->get_id_product().length()) longestData[0] = it->get_id_product().length();
        // name
        if (longestData[1] < it->get_name().length()) longestData[1] = it->get_name().length();
        // brand
        if (longestData[2] < it->get_brand().length()) longestData[2] = it->get_brand().length();
        // price
        string priceString = to_string(it->get_price()); // Mengubah harga menjadi string
        if (longestData[3] < priceString.length()) longestData[3] = priceString.length();
        // size
        if (longestData[4] < it->get_size().length()) longestData[4] = it->get_size().length();
        // material
        if (longestData[5] < it->get_material().length()) longestData[5] = it->get_material().length();
        // color
        if (longestData[6] < it->get_color().length()) longestData[6] = it->get_color().length();
        // sleeve type
        if (longestData[7] < it->get_sleeve_type().length()) longestData[7] = it->get_sleeve_type().length();
    }

    // Menghitung jumlah karakter untuk membuat garis tabel
    int sum = 6;
    for (int i = 0; i < 8; i++) {
        sum += longestData[i];
    }

    // Membuat garis tabel
    for (int space = 0; space < sum + 28; space++) {
        cout << '-';
    }
    cout << endl;

    // Mencetak header tabel
    cout << "| ID"; 
    for (int space = 0; space < longestData[0] - 1; space++) {
        cout << ' ';
    }
    cout << "| Name"; 
    for (int space = 0; space < longestData[1] - 3; space++) {
        cout << ' ';
    }
    cout << "| Brand"; 
    for (int space = 0; space < longestData[2] - 4; space++) {
        cout << ' ';
    }
    cout << "| Price"; 
    for (int space = 0; space < longestData[3] - 4; space++) {
        cout << ' ';
    }
    cout << "| Size"; 
    for (int space = 0; space < longestData[4] - 3; space++) {
        cout << ' ';
    }
    cout << "| Material"; 
    for (int space = 0; space < longestData[5] - 7; space++) {
        cout << ' ';
    }
    cout << "| Gender "; 
    cout << "| Color"; 
    for (int space = 0; space < longestData[6] - 4; space++) {
        cout << ' ';
    }
    cout << "| Sleeve Type"; 
    for (int space = 0; space < longestData[7] - 10; space++) {
        cout << ' ';
    }
    cout << "|" << endl;

    // Mencetak garis tabel
    for (int space = 0; space < sum + 28; space++) {
        cout << '-';
    }
    cout << endl;

    // Mencetak isi tabel (list)
    for (auto it = list_product.begin(); it != list_product.end(); it++) {
        // id
        cout << "| " << it->get_id_product();
        for (int space = 0; space < 1 + longestData[0] - it->get_id_product().length(); space++) {
            cout << ' ';
        }
        // name
        cout << "| " << it->get_name();
        for (int space = 0; space < 1 + longestData[1] - it->get_name().length(); space++) {
            cout << ' ';
        }
        // brand
        cout << "| " << it->get_brand();
        for (int space = 0; space < 1 + longestData[2] - it->get_brand().length(); space++) {
            cout << ' ';
        }
        // price
        cout << "| " << it->get_price();
        string priceString = to_string(it->get_price());
        for (int space = 0; space < 1 + longestData[3] - priceString.length(); space++) {
            cout << ' ';
        }
        // size
        cout << "| " << it->get_size();
        for (int space = 0; space < 1 + longestData[4] - it->get_size().length(); space++) {
            cout << ' ';
        }
        // material
        cout << "| " << it->get_material();
        for (int space = 0; space < 1 + longestData[5] - it->get_material().length(); space++) {
            cout << ' ';
        }
        // gender
        cout << "| " << it->get_gender();
        cout << "      "; // Spasi untuk kolom gender
        // color
        cout << "| " << it->get_color();
        for (int space = 0; space < 1 + longestData[6] - it->get_color().length(); space++) {
            cout << ' ';
        }
        // sleeve type
        cout << "| " << it->get_sleeve_type();
        for (int space = 0; space < 1 + longestData[7] - it->get_sleeve_type().length(); space++) {
            cout << ' ';
        }
        
        cout << '|' << endl; // Penutup baris
    }

    // Mencetak penutup tabel
    for (int space = 0; space < sum + 28; space++) {
        cout << '-';
    }
    cout << endl;
    
    return 0;
}

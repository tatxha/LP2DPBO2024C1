/* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

import java.util.Scanner; // untuk menerima inputan dari user
import java.util.ArrayList; 

public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = 0; n = sc.nextInt(); // input banyak data yang akan dimasukkan
        ArrayList<Product> list_product = new ArrayList<Product>(); // list of products
        
        // variabel untuk menampung inputan untuk dimasukkan ke dalam list
        String idProduct, name, brand, size, material, color, sleeve_type; 
        int price;
        char gender;
        
        // looping untuk mengisi list
        for(int i = 0; i < n; i++)
        {
            Product kproduct = new Product(); // class product

            idProduct = sc.next(); 
            name = sc.next(); 
            brand = sc.next(); 
            price = sc.nextInt(); 
            size = sc.next(); 
            material = sc.next(); 
            gender = sc.next().charAt(0); 
            color = sc.next(); 
            sleeve_type = sc.next();

            kproduct.set_idProduct(idProduct);
            kproduct.set_name(name);
            kproduct.set_brand(brand);
            kproduct.set_price(price);
            kproduct.set_size(size);
            kproduct.set_material(material);
            kproduct.set_gender(gender);
            kproduct.set_color(color);
            kproduct.set_sleeve_type(sleeve_type);

            list_product.add(kproduct); // masukan ke dalam list
        }

        int[] longestData = {2, 4, 5, 5, 4, 8, 5, 11}; // menyimpan panjang dari header tabel
        
        for(int i = 0; i < list_product.size(); i++) // looping untuk mencari string terpanjang pada setiap kolomnya
        {
            // id
            if(longestData[0] < list_product.get(i).get_idProduct().length()) longestData[0] = list_product.get(i).get_idProduct().length();
            // name
            if(longestData[1] < list_product.get(i).get_name().length()) longestData[1] = list_product.get(i).get_name().length();
            // brand
            if(longestData[2] < list_product.get(i).get_brand().length()) longestData[2] = list_product.get(i).get_brand().length();
            // price
            String priceString = Integer.toString(list_product.get(i).get_price()); // karena price tipe datanya integer, diubah dulu menjadi string
            if(longestData[3] < priceString.length()) longestData[3] = priceString.length();
            // size
            if(longestData[4] < list_product.get(i).get_size().length()) longestData[4] = list_product.get(i).get_size().length();
            // material
            if(longestData[5] < list_product.get(i).get_material().length()) longestData[5] = list_product.get(i).get_material().length();
            // color
            if(longestData[6] < list_product.get(i).get_color().length()) longestData[6] = list_product.get(i).get_color().length();
            // sleeve type
            if(longestData[7] < list_product.get(i).get_sleeve_type().length()) longestData[7] = list_product.get(i).get_sleeve_type().length();
        }
        
        int sum = 6; for(int i = 0; i < 8; i++) { sum += longestData[i]; } // menjumlahkan semua string terpanjang untuk membuat garis tabel

        for(int space = 0; space < sum + 28; space++) { System.out.print('-'); } // membuat garis tabel
        // print header
        System.out.print("\n| ID"); for(int space = 0; space < longestData[0] - 1; space++) { System.out.print(' '); }
        System.out.print("| Name"); for(int space = 0; space < longestData[1] - 3; space++) { System.out.print(' '); }
        System.out.print("| Brand"); for(int space = 0; space < longestData[2] - 4; space++) { System.out.print(' '); }
        System.out.print("| Price"); for(int space = 0; space < longestData[3] - 4; space++) { System.out.print(' '); }
        System.out.print("| Size"); for(int space = 0; space < longestData[4] - 3; space++) { System.out.print(' '); }
        System.out.print("| Material"); for(int space = 0; space < longestData[5] - 7; space++) { System.out.print(' '); }
        System.out.print("| Gender "); 
        System.out.print("| Color"); for(int space = 0; space < longestData[6] - 4; space++) { System.out.print(' '); }
        System.out.print("| Sleeve Type"); for(int space = 0; space < longestData[7] - 10; space++) { System.out.print(' '); }
        System.out.println("|");
        for(int space = 0; space < sum + 28; space++) { System.out.print('-'); } System.out.print("\n"); // print garis tabel
        
        // print out isi tabel (list)
        for(int i = 0; i < list_product.size(); i++)
        {
            // id
            System.out.print("| " + list_product.get(i).get_idProduct());
            for(int space = 0; space < 1 + longestData[0] - list_product.get(i).get_idProduct().length(); space++) { System.out.print(' '); }
            // name
            System.out.print("| " + list_product.get(i).get_name());
            for(int space = 0; space < 1 + longestData[1] - list_product.get(i).get_name().length(); space++) { System.out.print(' '); }
            // brand
            System.out.print("| " + list_product.get(i).get_brand());
            for(int space = 0; space < 1 + longestData[2] - list_product.get(i).get_brand().length(); space++) { System.out.print(' '); }
            // price
            System.out.print("| " + list_product.get(i).get_price());
            String priceString = Integer.toString(list_product.get(i).get_price());
            for(int space = 0; space < 1 + longestData[3] - priceString.length(); space++) { System.out.print(' '); }
            // size
            System.out.print("| " + list_product.get(i).get_size());
            for(int space = 0; space < 1 + longestData[4] - list_product.get(i).get_size().length(); space++) { System.out.print(' '); }
            // material
            System.out.print("| " + list_product.get(i).get_material());
            for(int space = 0; space < 1 + longestData[5] - list_product.get(i).get_material().length(); space++) { System.out.print(' '); }
            // gender
            System.out.print("| " + list_product.get(i).get_gender());
            for(int space = 0; space < 6; space++) { System.out.print(' '); } // untuk patokan spasi pada kolom gender hanya mengacu dari panjang headernya saja ("gender") yang panjangnya adalah 6. Karena isi kolom header hanya satu karakter
            // color
            System.out.print("| " + list_product.get(i).get_color());
            for(int space = 0; space < 1 + longestData[6] - list_product.get(i).get_color().length(); space++) { System.out.print(' '); }
            // sleeve type
            System.out.print("| " + list_product.get(i).get_sleeve_type());
            for(int space = 0; space < 1 + longestData[7] - list_product.get(i).get_sleeve_type().length(); space++) { System.out.print(' '); }
            
            System.out.println('|'); // penutup baris
        }
        for(int space = 0; space < sum + 28; space++) { System.out.print('-'); } System.out.println(); // print penutup tabel
    }
}

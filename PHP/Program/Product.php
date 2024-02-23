<!-- /* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php

require_once ('Clothing.php'); // Jika file Clothing.php berada dalam direktori yang sama

class Product extends Clothing {
    // attributes
    private $id_product = "";
    private $name = "";
    private $brand = "";
    private $price = 0;

    // constructor
    public function __construct($id_product = "", $name = "", $brand = "", $price = 0) {
        parent::__construct(); // Memanggil konstruktor kelas induk (Clothing)
        $this->id_product = $id_product;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    // getter dan setter
    public function get_id_product() {
        return $this->id_product;
    }

    public function set_id_product($id_product) {
        $this->id_product = $id_product;
    }

    public function get_name() {
        return $this->name;
    }

    public function set_name($name) {
        $this->name = $name;
    }

    public function get_brand() {
        return $this->brand;
    }

    public function set_brand($brand) {
        $this->brand = $brand;
    }

    public function get_price() {
        return $this->price;
    }

    public function set_price($price) {
        $this->price = $price;
    }

    // destructor (opsional, tidak perlu didefinisikan dalam PHP)
    // public function __destruct() {
    //     // kode pembersihan
    // }
}

?>

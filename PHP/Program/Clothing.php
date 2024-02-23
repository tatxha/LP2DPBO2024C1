<!-- /* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->
<?php

require_once('Shirt.php'); // Jika file Shirt.php berada dalam direktori yang sama

class Clothing extends Shirt {
    // attributes
    private $size = "";
    private $material = "";
    private $gender = '';

    // constructor
    public function __construct($size = "", $material = "", $gender = '') {
        parent::__construct(); // Memanggil konstruktor kelas induk (Clothing)
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    // getter dan setter
    public function get_size() {
        return $this->size;
    }

    public function set_size($size) {
        $this->size = $size;
    }

    public function get_material() {
        return $this->material;
    }

    public function set_material($material) {
        $this->material = $material;
    }

    public function get_gender() {
        return $this->gender;
    }

    public function set_gender($gender) {
        $this->gender = $gender;
    }

    // destructor (opsional, tidak perlu didefinisikan dalam PHP)
    // public function __destruct() {
    //     // kode pembersihan
    // }
}

?>

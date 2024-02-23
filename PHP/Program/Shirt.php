<!-- /* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php

class Shirt {
    private $color = "";
    private $sleeve_type = "";

    // constructor
    public function __construct($color = "", $sleeve_type = "") {
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
    }

    // getter and setter methods
    public function get_color() {
        return $this->color;
    }

    public function set_color($color) {
        $this->color = $color;
    }

    public function get_sleeve_type() {
        return $this->sleeve_type;
    }

    public function set_sleeve_type($sleeve_type) {
        $this->sleeve_type = $sleeve_type;
    }

    // destructor (not necessary in PHP)
    // public function __destruct() {
    //     // cleanup code here
    // }
}

?>

    # Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    # dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    # maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
    
class Shirt():
    __color = ""
    __sleeve_type = ""
    
    def __init__(this, color = "", sleeve_type = ""):
        this.__color = color
        this.__sleeve_type = sleeve_type
    
    def get_color(this): return this.__color
    def set_color(this, color): this.__color = color
    
    def get_sleeve_type(this): return this.__sleeve_type
    def set_sleeve_type(this, sleeve_type): this.__sleeve_type = sleeve_type
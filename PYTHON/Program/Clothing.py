    # Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    # dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    # maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
    
from Shirt import Shirt
# atribut
class Clothing(Shirt):
    __size = ""
    __material = ""
    __gender = ''
    
    # konstruktor
    def __init__(this, size = "", material = "", gender = ''):
        this.__size = size
        this.__material = material
        this.__gender = gender
    
    #  getter setter
    def get_size(this): return this.__size
    def set_size(this, size): this.__size = size
    
    def get_material(this): return this.__material
    def set_material(this, material): this.__material = material
    
    def get_gender(this): return this.__gender
    def set_gender(this, gender): this.__gender = gender
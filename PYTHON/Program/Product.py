    # Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    # dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    # maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
    
from Clothing import Clothing

class Product(Clothing):
    __idProduct = ""
    __name = ""
    __brand = ""
    __price = 0

    def __init__(this, idProduct = "", name = "", brand = "", price = 0):
        this.__idProduct = idProduct
        this.__name = name
        this.__brand = brand
        this.__price = price
        
    def get_idProduct(this): return this.__idProduct
    def set_idProduct(this, idProduct): this.__idProduct = idProduct
        
    def get_name(this): return this.__name
    def set_name(this, name): this.__name = name
        
    def get_brand(this): return this.__brand
    def set_brand(this, brand): this.__brand = brand
        
    def get_price(this): return this.__price
    def set_price(this, price): this.__price = price
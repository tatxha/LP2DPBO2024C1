    # Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    # dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    # maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
    
from Product import Product

list_product = []

n = int(input()) # input untuk menentukan banyak data
for i in range (n): # mengisi array
    kproduct = Product()
    
    idProduct = input()
    name = input()
    brand = input()
    price = int(input())
    size = input()
    material = input()
    gender = input()[0]
    color = input()
    sleeve_type = input()
    
    kproduct.set_idProduct(idProduct)
    kproduct.set_name(name)
    kproduct.set_brand(brand)
    kproduct.set_price(price)
    kproduct.set_size(size)
    kproduct.set_material(material)
    kproduct.set_gender(gender)
    kproduct.set_color(color)
    kproduct.set_sleeve_type(sleeve_type)
    
    list_product.append(kproduct)
    
# Menghitung panjang terpanjang untuk setiap kolom
longest_data = [2, 4, 5, 5, 4, 8, 5, 11]  # Panjang dari header tabel

for product in list_product:
    # id
    longest_data[0] = max(longest_data[0], len(product.get_idProduct()))
    # name
    longest_data[1] = max(longest_data[1], len(product.get_name()))
    # brand
    longest_data[2] = max(longest_data[2], len(product.get_brand()))
    # price
    price_string = str(product.get_price())  # Mengubah harga menjadi string
    longest_data[3] = max(longest_data[3], len(price_string))
    # size
    longest_data[4] = max(longest_data[4], len(product.get_size()))
    # material
    longest_data[5] = max(longest_data[5], len(product.get_material()))
    # color
    longest_data[6] = max(longest_data[6], len(product.get_color()))
    # sleeve type
    longest_data[7] = max(longest_data[7], len(product.get_sleeve_type()))

# Menghitung jumlah karakter untuk membuat garis tabel
sum_length = 6 + sum(longest_data)

# Membuat garis tabel
print('-' * (sum_length + 28))

# Mencetak header tabel
print("| ID", end='')
for space in range(longest_data[0] - 1): print(' ', end='')
print("| Name", end='')
for space in range(longest_data[1] - 3): print(' ', end='')
print("| Brand", end='')
for space in range(longest_data[2] - 4): print(' ', end='')
print("| Price", end='')
for space in range(longest_data[3] - 4): print(' ', end='')
print("| Size", end='')
for space in range(longest_data[4] - 3): print(' ', end='')
print("| Material", end='')
for space in range(longest_data[5] - 7): print(' ', end='')
print("| Gender ", end='')
print("| Color", end='')
for space in range(longest_data[6] - 4): print(' ', end='')
print("| Sleeve Type", end='')
for space in range(longest_data[7] - 10): print(' ', end='')
print("|")

# Mencetak garis tabel
print('-' * (sum_length + 28))

# Mencetak isi tabel (list)
for product in list_product:
    print("|", product.get_idProduct(), end='')
    print(' ' * (1 + longest_data[0] - len(product.get_idProduct())), end='')
    print("|", product.get_name(), end='')
    print(' ' * (1 + longest_data[1] - len(product.get_name())), end='')
    print("|", product.get_brand(), end='')
    print(' ' * (1 + longest_data[2] - len(product.get_brand())), end='')
    print("|", product.get_price(), end='')
    price_string = str(product.get_price())
    print(' ' * (1 + longest_data[3] - len(price_string)), end='')
    print("|", product.get_size(), end='')
    print(' ' * (1 + longest_data[4] - len(product.get_size())), end='')
    print("|", product.get_material(), end='')
    print(' ' * (1 + longest_data[5] - len(product.get_material())), end='')
    print("|", product.get_gender(), "     |", product.get_color(), end='')
    print(' ' * (1 + longest_data[6] - len(product.get_color())), end='')
    print("|", product.get_sleeve_type(), end='')
    print(' ' * (longest_data[7] - len(product.get_sleeve_type())), "|")

# Mencetak penutup tabel
print('-' * (sum_length + 28))


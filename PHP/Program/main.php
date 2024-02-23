<!-- /* 
    Saya Tattha Maharany Yasmin Akbar dengan NIM 2201805 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php
require_once ('Product.php');
$list_product = array();

// Membuat objek Product dan menyimpannya dalam array
$kproduct = new Product();
$kproduct->set_id_product("001");
$kproduct->set_name("Nike_Air_Max_90");
$kproduct->set_brand("Nike"); 
$kproduct->set_price("1500000"); 
$kproduct->set_size("42"); 
$kproduct->set_material("Mesh"); 
$kproduct->set_gender("M"); 
$kproduct->set_color("Black"); 
$kproduct->set_sleeve_type("Short");
array_push($list_product, $kproduct);


$kproduct = new Product();
$kproduct->set_id_product("002"); 
$kproduct->set_name("Adidas_Ultraboost"); 
$kproduct->set_brand("Adidas"); 
$kproduct->set_price("1300000"); 
$kproduct->set_size("40"); 
$kproduct->set_material("Knit"); 
$kproduct->set_gender("M"); 
$kproduct->set_color("White"); 
$kproduct->set_sleeve_type("Long");
array_push($list_product, $kproduct);


$kproduct = new Product();
$kproduct->set_id_product("003"); 
$kproduct->set_name("Vans_Old_Skool"); 
$kproduct->set_brand("Vans"); 
$kproduct->set_price("900000"); 
$kproduct->set_size("38"); 
$kproduct->set_material("Canvas"); 
$kproduct->set_gender("U"); 
$kproduct->set_color("Red"); 
$kproduct->set_sleeve_type("Short");
array_push($list_product, $kproduct);

$kproduct = new Product();
$kproduct->set_id_product("004"); 
$kproduct->set_name("Converse_Chuck_Taylor_All_Star"); 
$kproduct->set_brand("Converse"); 
$kproduct->set_price("800000"); 
$kproduct->set_size("39"); 
$kproduct->set_material("Canvas"); 
$kproduct->set_gender("U"); 
$kproduct->set_color("Blue"); 
$kproduct->set_sleeve_type("Long");
array_push($list_product, $kproduct);

$kproduct = new Product();
$kproduct->set_id_product("005"); 
$kproduct->set_name("Puma_Suede_Classic"); 
$kproduct->set_brand("Puma"); 
$kproduct->set_price("1000000"); 
$kproduct->set_size("41"); 
$kproduct->set_material("Suede"); 
$kproduct->set_gender("F"); 
$kproduct->set_color("Green"); 
$kproduct->set_sleeve_type("Short");
array_push($list_product, $kproduct);

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Products</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Data Products:</h1>
    <table>
        <tr>
            <th>ID Product</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Size</th>
            <th>Material</th>
            <th>Gender</th>
            <th>Color</th>
            <th>Sleeve Type</th>
        </tr>
        <?php
        foreach($list_product as $i)
        {

            echo "<tr>";
            echo "<td>" . $i->get_id_product() . "</td>";
            echo "<td>" . $i->get_name() . "</td>";
            echo "<td>" . $i->get_brand() . "</td>";
            echo "<td>" . "Rp" . $i->get_price() . "</td>";
            echo "<td>" . $i->get_size() . "</td>";
            echo "<td>" . $i->get_material() . "</td>";
            echo "<td>" . $i->get_gender() . "</td>";
            echo "<td>" . $i->get_color() . "</td>";
            echo "<td>" . $i->get_sleeve_type() . "</td>";
            echo "</tr>";
        }
        ?>
    </table>
</body>
</html>
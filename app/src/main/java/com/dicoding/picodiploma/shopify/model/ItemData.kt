package com.dicoding.picodiploma.shopify.model

import androidx.core.util.rangeTo
import com.dicoding.picodiploma.shopify.R

object ItemData {
    private val ItemNames = arrayOf(
        "Maspion HA-110 Setrika Listrik - Dry Iron",
        "Samsung TV-UA32N4001-HD-LED-TV-32-Inch-i.52635036",
        "infinix HP Hot 8 Ram 2/32GB - X650B",
        "XIOO WINDROID 9G+ NOTEBOOK / LAPTOP DUAL OS",
        "Yong Ma YMC-704 / SMC 7047 Digital Rice Cooker",
        "KONKA Portable Blender Mini Juicer USB blender Tanpa Kabel",
        "Inone Power Bank 10000mAh Powerbank Dual USB Mini Size P10",
        "Sharp AC Split AH-A5SAY 0.5PK Unit Only",
        "Sharp Kulkas 2 Pintu SJ-236ND-FP/w ",
        "Kipas Angin Meja NIKO 9 Inch Rotating"
    )

    private val itemDetails = arrayOf (
        "RP.210.000,\n " +
                "\n"+
                "\n"+
                "Deskripsi Produk\n" +
                "Setrika listrik dengan kualitas terjamin dan nyaman saat digunakan, dengan keunggulan perlindungan ganda agar aman digunakan saat menyetrika\n" +
                "\n" +
                "●  Nyaman saat digunakan\n" +
                "Mempunyai kabel yang fleksibel sehingga tidak perlu khawatir akan terlilit dan kegiatan menyetrika lebih nyaman\n" +
                "\n" +
                "●  Anti lengket\n" +
                "Terdapat lapisan anti lengket, sehingga tidak perlu khawatir bahan dari pakaian anda akan menempel pada alas setrika\n" +
                "\n" +
                "●  Double protector\n" +
                "Memiliki double protector (perlindungan ganda), yaitu Thermostat dan Thermofuse yang akan bekerja pada saat panas setrika berlebih\n" +
                "-  Thermostat, teknologi ini bisa memutus arus otomatis, dan setelah panas turun maka akan bekerja kembali untuk menaikan suhu\n" +
                "-  Thermofuse, teknologi ini berfungsi untuk memutus arus saat panas setrika berlebih sehingga tidak merusak komponen lain\n" +
                "\n" +
                "Handle : plastic\n" +
                "Non-stick coating sole plate \n" +
                "Wattage : 350 W\n" +
                "Voltage : 220 V\n" +
                "Dimensi Ukuran Kemasan: 24,1 x 11 x 10 cm\n" +
                "\n" +
                "Note : Warna produk akan dikirimkan secara acak. Mohon maaf tidak bisa pilih warna, warna disesuaikan dengan ketersediaan stock yang ada :)\n",
        "Rp.3.400.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk:\n" +
                "\n" +
                "- Clean View\n" +
                "\n" +
                "- Wide Colour Enhancer\n" +
                "\n" +
                "- HD picture quality\n" +
                "\n" +
                "- Connect share movie\n" +
                "\n" +
                "\n" +
                "\n" +
                "USB:   Yes        \n" +
                "\n" +
                "HDMI:   Yes\n" +
                "\n" +
                "Broadcasting/Tuner:   Analog\n" +
                "\n" +
                "Ukuran layar(inch):    32\"\n" +
                "\n" +
                "Panel:   LED\n" +
                "\n" +
                "Screen Resolution:   1366 x 768 pixels\n" +
                "\n" +
                "Tipe:    Non-Smart TV\n" +
                "\n" +
                "\n" +
                "\n" +
                "Garansi 1 thn panel dan 2 thn sparepart",
        "Rp.1.200.000\n" +
                "\n"+
                "\n"+
                "Deskripsi  Produk :\n" +
                "\n" +
                "Processor mediatek P22 helio octa core 2,0\n" +
                " GHzAndroid Terbaru Pie 9.0\n" +
                " Ram 2GB, Internal 32GB\n" +
                "Layar 6,6 inch \n" +
                "Dewdrop HD+ Dewdrop display Triple \n" +
                "kamera blakang 13+2+QVGA, kamera depan 8M\n" +
                "PBatere 5.000mAh\n" +
                " Sensor fingerprint and face unlock\n" +
                "\n" +
                "Garansi Resmi Infinix 1 tahun",
        "Rp.238.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk\n" +
                "Pertama di INDONESIA dengan bangga AXIOO memperkenalkan WINDROID sebuah notebook tercanggih dengan layar sentuh dirancang dengan menggabungkan dua sistem operasi yaitu, Windows dan Android yang sudah terbukti kualitasnya. Kelebihan dari notebook ini adalah desain 2 in 1, mode 'notebook' untuk bekerja menggunakan keyboard dan mode 'tablet' tanpa keyboard untuk menikmati hiburan lebih leluasa.\n" +
                "\n" +
                "\n" +
                "******************************************************************\n" +
                "Windroid 9G +\n" +
                "Processor :Intel Baytrail-T Quad Core Processor Z3735G\n" +
                "                  (2M Cache, 1.33GHz up to 1.83 GHz) \n" +
                "Memory : Internal : DDR3 2GB \n" +
                "Storage   : Internal : 32GB\n" +
                "                 Slot : MicroSD up to 32GB \n" +
                "Display :  Size / Type : 8.9, 1280x800 Pixels\n" +
                "                 IPS LCD 5 point capacitive touch \n" +
                "OS:          Windows 8.1 32bit\n" +
                "                Android KitKat Home Screen \n" +
                "no office\n" +
                "Data :      GPRS : Class 12\n" +
                "                EDGE : Class 12 \n" +
                "\t    Wi-Fi 802.11 b/g/n \t\n" +
                "Camera : Primary : 2.0MP\n" +
                "                Second : 0.3MP \n" +
                "Battery:   4800mAh (Lithium)/3.7V \n" +
                "Warna:    gold\n" +
                "\n" +
                "\n" +
                "*********************************************************.\n" +
                "* Disarankan Untuk menambahkan/memilih pengiriman dengan menggunakan asuransi dikarnakan barang elektronik sangat rentan saat pengiriman.kami tidak bertanggung jawab atas kerisakan yg dibebabkan saat pengiriman *",
        "Rp.162.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk\n" +
                "\n" +
                "• Rice Cooker \n" +
                "\n" +
                "• Dapat digunakan memasak nasi, menghangatkan, dan mengukus \n" +
                "\n" +
                "• Kapasitas : 2 liter \n" +
                "\n" +
                "• Body Stainless \n" +
                "\n" +
                "• Bisa Masak Nasi Goreng \n" +
                "\n" +
                "• 10 Fungsi Memasak \n" +
                "\n" +
                "• Fungsi Resume saat terjadi mati listrik \n" +
                "\n" +
                "\n" +
                "\n" +
                "• Dapat digunakan untuk memasak nasi, menghangatkan, dan mengukus \n" +
                "\n" +
                "• Body Stainless. Memberikan kualitas yang lebih tinggi, kuat serta anti karat \n" +
                "\n" +
                "• LED Display. Dilengkapi lampu indikator untuk mengecek proses waktu memasak \n" +
                "\n" +
                "• Fungsi One Touch. Cook & Warm dengan satu tombol ‘One Touch’ yang mudah \n" +
                "\n" +
                "• Mempunyai kapasitas 2.0 L / 11 orang \n" +
                "\n" +
                "• Sistem 3D Heating. Menghangatkan lebih lama dan nasi tidak mudah basi dengan sistem warm 3D Heating dari top / body / bottom \n" +
                "\n" +
                "• Bisa Masak Nasi Goreng \n" +
                "\n" +
                "• Inner Pot Eco Ceramic. Menerapkan innerpot Eco Ceramic yang lebih bagus untuk kesehatan \n" +
                "\n" +
                "• 1.7T Inner Pot (Lebih Tebal) dan Marble Motif di Inner Pot. Menghangatkan lebih lama dan membuat rasa nasi lebih lezat, karena membuat konduktivitas panas tinggi lebih bagus \n" +
                "\n" +
                "• Memiliki 10 macam menu memasak yaitu, Nasi Goreng, Beras Merah, Soup, Slow Cook, Kukus, Bubur, Cake, Yogurt, Cook dan Cepat. \n" +
                "\n" +
                "• Fungsi Resume. Fungsi ini akan berjalan ketika terjadi mati listrik. Digital Rice Cooker ini dapat melanjutkan proses memasak ketika listrik kembali hidup lagi. (Maks 2 jam) \n" +
                "\n" +
                "• Fungsi Preset. Lebih mudah dengan menggunakan fungsi preset waktu memasak (24 jam) \n" +
                "\n" +
                "• Penutup Innerpot bisa dilepaskan. Setelah memasak, penutup innerpot mudah dilepaskan untuk dicuci dan dipasang kembali \n" +
                "\n" +
                "• Aksesoris: Measuring cup, Soup scoop, Rice scoop, Steam pot, Kartu garansi, Resep Masakan \n",
        "Rp.150.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk\n" +
                "*Mohon di baca*\n" +
                "Demi kenyamanan pembelian anda, untuk pengiriman di wilayah Pulau Jawa, Lampung dan Palembang kami sarankan untuk menggunakan jasa kirim J&T ekspress dan untuk wilayah selain yang telah kami sebutkan bisa menggunakan ekspedisi lainnya seperti SiCepat, terimakasih atas perhatiannya :)\n" +
                "\n" +
                "Informasi Produk =\n" +
                "Nama: Juicer Nirkabel KONKA\n" +
                "Warna: Kuning\n" +
                "Kapasitas: 420ml\n" +
                "Berat bersih: 700g\n" +
                "Ukuran: 8.6 * 30.2 * 8.6cm\n" +
                "Sumber daya: USB 5V\n" +
                "Motor: DC7.4V\n" +
                "Kapasitas baterai: 2000 mAh * 2\n" +
                "\n" +
                "1. Ringan dan portabel, mudah dipasang dan mudah dibersihkan;\n" +
                "2. Kekuatan 60W, kecepatan rata-rata pemrosesan jus 10 detik;\n" +
                "3. Gelas berbahan kaca borosilikat kualitas terbaik untuk perlindungan suhu yang lebih aman dan lebih tinggi;\n" +
                "4. Ketika sedang diisi dayanya, dapat mati secara otomatis untuk mencegah pengisian daya berlebih;\n" +
                "5. Perlindungan keamanan, akan mati secara otomatis setelah menyala selama 30 detik\n" +
                "6. Tekan tombol DUA KALI untuk memulai blender\n" +
                "7. Mesin tidak akan menyala jika tidak dipasangkan ke badan gelas, dan jika gelas tidak terpasang dengan kencang\n" +
                "8. 304 food grade stainless steel 6 mata pisau;\n" +
                "9. Tutup sangat rapat, anti bocor;\n" +
                "10. Dua baterai 2000 mAh, setara dengan jumlah penggunaan baterai 4000 mAh.",
        "Rp.2.400.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk\n" +
                "Main features:\n" +
                "\n" +
                "- Small size, big capacity. 10000mAh super large capacity portable power bank \n" +
                "\n" +
                "- Light travel, one is enough. 200g weight,6.8cm size, light and portable\n" +
                "\n" +
                "- 2A current for iPhone fast charge, it only takes about 1.5 hours to fully charge your iP7\n" +
                "\n" +
                "- Type C and micro USB dual input ports, more convenient to recharge\n" +
                "\n" +
                "- A rounded design for the body, hold with one hand, smooth texture, and comfortable touch.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Specifications:\n" +
                "\n" +
                "Model:P10\n" +
                "\n" +
                "Color: White / Blue / Pink\n" +
                "\n" +
                "Input: 5V⎓2A(Type-C)\n" +
                "\n" +
                "Input: 5V⎓2A(Micro USB)\n" +
                "\n" +
                "Output: 5V⎓2A\n" +
                "\n" +
                "Cell Capacity: 10000mAh/37wh\n" +
                "\n" +
                "Product Size: 68*133*16MM\n" +
                "\n" +
                "Product Weight: 200g\n" +
                "\n" +
                "Package Size: 102*140*30MM\n" +
                "\n" +
                "Package Weight: 234g",
        "Rp.2.800.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk\n" +
                "Harap Konfirmasi Ketersediaan Stok Sebelum Order\n" +
                "\n" +
                "Proses order s/d kirim minimum 3-5 Hari\n" +
                "Harga disistem Shopee berlaku untuk Jabodetabek\n" +
                "Tidak melayani pengiriman ke luar Jabodetabek\n" +
                "Untuk barang in tidak melayani pengirman diluar Jabodetabek\n" +
                "\n" +
                "Lebih jelasnya silahkan diskusi produk\n" +
                "\n" +
                "Kapasitas Ruangan: 1/2 PK\n" +
                "MODEL: AH-A5SAY\n" +
                "Tegangan minimum/Maksimum\n" +
                "150-260 Volt\n" +
                "Kapasitas Pendingin:Btu/h 5.000\n" +
                "Daya Listrik Pendingin: 390 Watt\n" +
                "Tipe Refrigran : R32a\n" +
                "Areal Aplikasi: 8-12 Mm\n" +
                "Dimensi Indoor: 877X292X222 Mm\n" +
                "Dimensi Outdoor:598X495X265 Mm\n" +
                "\n" +
                "Features:\n" +
                "Teknologi New Jetstream:Yes\n" +
                "Daya Rendah Standbay:Yes\n" +
                "Tegangan Awal Rendah:Yes\n" +
                "Rastart Otomatis:Yes\n" +
                "Turbo:Yes\n" +
                "Coanda Airflow:Yes\n" +
                "Comfort Mode:Yes\n" +
                "Auto Swing Louver:Yes\n" +
                "Anti Rust Evaporator:Yes\n" +
                "\n" +
                "Garansi Resmi SHARP\n" +
                "Garansi Produk : 1 Tahun Sparepart, 10 Tahun Kompressor\n" +
                "Harga Unit Only",
        "Rp.2.800.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk :\n" +
                "\n" +
                "Sharp Kulkas 2 Pintu SJ-236ND memiliki dibuat dengan dua pintu yang dibuat dengan desain sederhana untuk kesesuaian optimal pada interior rumah Anda. Anda juga dapat menikmati kapasitas ruang penyimpanan yang lebih besar dengan rak berkualitas kokoh untuk menyimpan wadah sekalipun. Penggunaan voltase listrik pada kulkas ini juga dapat tetap menjaga kesegaran dan ketahanan makanan di rumah anda untuk waktu yang lebih lama\n" +
                "\n" +
                "Aesthetic Flower Ornaments\n" +
                "Kulkas ini hadir dengan desain bernuansa floral dengan ornamen bunga di bagian pintunya.\n" +
                "\n" +
                "High Quality, Saves Energy\n" +
                "\n" +
                "Detail\n" +
                "- Cooling system: fan cooling system\n" +
                "- Refrigerant (Non CFC): HFC-134a\n" +
                "- Defrosting: automatic\n" +
                "- Nett capacity: 182 liter (refrigerator), 55 liter (freezer)\n" +
                "- Power source: 220-240 volt\n" +
                "- Power consumption: 100 watt\n" +
                "- Dimension: 54.5 x 138 x 59 cm\n" +
                "- Weight: 37 kg",
        "Rp.85.000\n" +
                "\n"+
                "\n"+
                "Deskripsi Produk\n" +
                "NIKO Desk Fan 9\" merupakan kipas angin dari Niko yang memiliki desain dan warna yang elegan. Kipas angin ini dapat Anda letakan di atas meja, sehingga memberikan kemudahan untuk Anda dalam menggunakannya. Selain itu, kipas angin persembahan Niko memiliki hembusan angin yang kencang (dengan 2 pilihan kecepatan) sehingga menjadikan ruangan menjadi lebih sejuk dan segar. \n" +
                "Jaring depan dapat diatur berputar atau diam selain itu kipas ini juga dapat berputar kekiri dan kenan\n" +
                "\n" +
                "- Daya            : 25 Watt\n" +
                "- Ukuran        : 9 Inchi\n" +
                "- kecepatan  : 2 pilihan\n" +
                "- Tegangan   : 220 Volt \n" +
                "- Baling-baling : 3 buah\n" +
                "- Berat Bersih  : 800 gram \n" +
                "- Frekuensi      : 50 - 60 Hz\n" +
                "\n" +
                "- Dimensi: 260 x 150 x 260 mm "
    )

    private val itemImages = intArrayOf(
        R.drawable.setrika,
        R.drawable.tv,
        R.drawable.hp,
        R.drawable.laptop,
        R.drawable.ricecooker,
        R.drawable.blender,
        R.drawable.pb,
        R.drawable.ac,
        R.drawable.kulkas,
        R.drawable.kipas
    )
    

    val listData: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for (position in ItemNames.indices) {
                val item = Item()
                item.name = ItemNames[position]
                item.detail = itemDetails[position]
                item.photo = itemImages[position]
                list.add(item)
            }
            return list
        }
}
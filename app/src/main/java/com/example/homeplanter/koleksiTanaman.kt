package com.example.homeplanter

object koleksiTanaman {
    private val NamaTanaman = arrayOf(
        "Bunga Alamanda",
        "Cemara Laut",
        "Kaktus Ariocarpus",
        "Palem Raja",
        "Bunga Amarilis",
        "Cemara Perak",
        "Kaktus Gentong Emas",
        "Palem Washington",
        "Bunga Sepatu",
        "Kaktus Bola"
    )

    private val DetailNama = arrayOf(
        "Alamanda kuning (Allamanda cathartica) biasa disebut juga golden trumpet (sama seperti allamanda williamsii namun yang ini kelopak bunga single atau tunggal), common trumpet vine, atau yellow allamanda, merupakan species dari genus Allamanda, famili Apocynaceae. Seperti bunga allamanda lain, Allamanda cathartica juga berasal asli dari Brazil. Tanaman tumbuh merambat dan besar merambat kemana-mana, bisa diatasi dengan pemangkasan. Tanpa pemangkasan, sebatang tanaman allamanda tingginya dapat mencapai 20 kaki (merambat). Allamanda kuning di dunia sudah banyak digunakan sebagai tanaman hias bunga merambat yang tidak disukai ulat (anti ulat), di Puerto Rico tanaman ini disebut as canario amarillo dan menjadi bunga resmi daerah tersebut.",
        "Cemara laut adalah salah satu jenis cemara dari golongan Casuarina. Tumbuhan ini juga memiliki sebutan lain yaitu Australian pine dan beach she-oak. Tumbuhan ini masih berkerabat dekat dengan cemara sumatera dan cemara gunung. Cemara laut merupakan tanamah jenis pohon berumah satu dengan percabangan halus, dan pepagan berwarna coklat-keabu-abuan muda. Bagian batangnya yang masih muda bertekstur halus sedangkan batang yang tua bertekstur kasar, tebal, dan beralur. Pepagan cemara laut berwarna kemerahan dan berbau harum. Daun daru cemara laut mudah gugur, tumbuh merunduk, berbentuk seperti jarum serta berwarna hijau-keabu-abuan. Daun cemara laut mereduksi menjadi seperti lidi yang berruas-ruas dan berjumlah 7—8 tiap-tiap ruas. Seperti halnya tumbuhan berumah satu lainnya, cemara laut juga mempunyai bunga jantan dan betina. Bunga jantannya berupa bulir memanjang, tunggal, dan terletak pada bagian terminal sedangkan bunga betina terletak pada cabang berkayu yang menyamping. Secara umum pohon ini berbentuk kurus dan banyak ditemukan di sepanjang pinggir pantai.",
        "Jenis kaktus hias yang memiliki ukuran mini dan menjadi rekomendasi adalah kaktus hias mini Ariocarpus. Jenis kaktus ini berbeda dari jenis kaktus lainnya yaitu tidak memiliki duri pada daunnya. Selain itu, jenis kaktus Ariocarpus memiliki bentuk prisma dan ini merupakan ciri khas dari kaktus hias Ariocarpus. Ujung daun kaktus Ariocarpus ada beberapa bentuk yaitu berujung melengkung, tumpul dan runcing. Masing masing ujung daun memiliki daya tarik tersendiri. Disamping memiliki daun yang unik, kaktus Ariocarpus juga mempunyai bunga yang besarnya hampir menutupi daunnya. Warna bunga kaktus Ariocarpus bermacam macam yaitu warna ungu, putih, pink, kuning dan warna merah.",
        "Palem raja termasuk juga suku Arecaceae (palem-paleman), adalah tumbuhan biji tertutup (Angiospermae) yakni biji buahnya terbungkus danging. Habitat Palem raja (Roystonea regia) banyak di dapatkan di pulau Jawa. Palem raja dapat diketemukan di beberapa tempat sampai serta bahkan juga dapat tumbuh di ketinggian 1.400 m diatas permukaan laut. Habitus Palem raja (Roystonea regia) adalah tumbuhan pohon atau panjatan. Palem raja ialah tumbuhan yang tidak bercabang serta tumb.uh tegak ke atas.Tumbuhan ini dapat tumbuh sampai sampai tinggi 20 m. Morfologi Dengan Umum Daun (folium) Daun palem raja termasuk juga daun yang prima sebab sudah mempunyai pelepah. tangkai serta helain daun. Daunnya termasuk juga majemuk sebab memiliki anak-anak daun.",
        "Bunga adalah bunga tropis yang berasal dari Afrika Selatan. Tumbuhan ini dapat hidup sepanjang tahun dan memiliki umbi serta biasanya bunga yang bentuknya khas. Tanaman Bakung merupakan bagian dari genus Lilium. Nama tanaman ini dalam bahasa Inggris adalah lily. Ada sekitar 110 suku dalam keluarga bakung (Liliaceae). Umbi Amaryllis disanjung oleh para pekebun karena mudah ditanam dan ditanam kembali setelah periode tidak aktif sesaat (biasanya selama musim dingin). Anda bisa memelihara bunga amarilis dalam bedeng di kebun/taman ataupun di dalam pot. Anda bisa menanamnya pada musim semi ataupun gugur (jika Anda tinggal di negara empat musim) Bunga Amaryllis yang besar memiliki tiga daun bunga, acapkali wangi, dan terdapat dalam berbagai warna dari putih, kuning, jingga, merah muda, merah, ungu, warna tembaga, hingga hampir hitam. Terdapat pula corak berupa bintik-bintik.",
        "Cemara perak dapat tumbuh 40-50 m (130-160 ft) (sangat 60 m (200 ft)) tinggi dan dengan diameter batang hingga 1,5 m (4 ft 11 in). Pohon terbesar yang diukur tingginya 60 m dan memiliki diameter batang 3,8 m (12 kaki). Itu terjadi pada ketinggian 300–1.700 m (980–5.580 kaki) (terutama lebih dari 500 m (1.600 kaki)), di pegunungan dengan curah hujan lebih dari 1.000 milimeter (39 in) per tahun. Cemara perak adalah spesies komponen penting dalam hutan cemara berkapur dinarik di Semenanjung Balkan barat . Di Italia , pohon cemara perak merupakan komponen penting dari hutan campuran berdaun lebar-jenis pohon jarum di Pegunungan Apennine, terutama di Apennine utara. Cemara lebih menyukai iklim yang dingin dan lembab, di bagian utara eksposisi, dengan curah hujan yang tinggi (lebih dari 1500 mm per tahun). Di Pegunungan Alpen bagian timur Italia, cemara perak tumbuh di hutan campuran dengan pohon cemara Norwegia, beech, dan pohon lainnya.",
        "Jenis kaktus ini memiliki duri yang menutupi hampir keseluruhan bagian kaktus. Kaktus Mini Echinocactus grusonii memiliki bentuk yang menyerupai gentong yang mungil. Kaktus yang biasa digunakan untuk hiasan ini berasal dari Meksiko dan Texas. Sering juga disebut dengan golden barrel ( gentong emas ). Sebutan gentong emas ini selaras dengan warna durinya yang berwarna kening keemasan sehingga terlihat seperti gentong emas. Karena bentuk dan warnanya yang unik, Tanaman Hias kaktus Mini Echinocactus Grusonii menjadi salah satu kaktus favorit.",
        "Palem Washington adalah pohon palem yang sangat ramping, yang tingginya melebihi 10 m, dengan mahkota daun lebih tinggi dari lebar. Daunnya ditanggung oleh petiole yang sangat keras, diwarnai dengan merah (yang membedakannya dari Washintionia filifera), panjang dan dihiasi duri melengkung yang sangat tajam. Tungkai palmate dibulatkan. Stipe dari Washingtonia robusta sangat sempit, dengan lebar maksimum 30 cm, di pangkal bulat, terkadang sedikit melengkung oleh angin. Siluetnya sangat ramping ketika daun kering tua dipotong untuk melepaskan batang yang berdering, abu-abu dan halus. Jika tidak, daun tua yang kering cenderung tetap berada di bagasi selama bertahun-tahun, membentuk rok tebal.",
        "Bunga jenis ini terdiri dari 5 helai daun kelopak, yang dilindungi oleh kelopak tambahan (epicalyx), sehingga terlihat seperti dua lapis kelopak bunga. Mahkota bunga terdiri dari 5 lembar atau lebih jika merupakan hibrida. Tangkai putik berbentuk silinder panjang dikelilingi tangkai sari berbentuk oval yang bertaburan serbuk sari. Biji terdapat di dalam buah berbentuk kapsul berbilik lima. Pada umumnya tinggi tanaman sekitar 2 sampai 5 meter. Daun berbentuk bulat telur yang lebar atau bulat telur yang sempit dengan ujung daun yang meruncing. Di daerah tropis atau di rumah kaca tanaman berbunga sepanjang tahun, sedangkan di daerah subtropis berbunga mulai dari musim panas hingga musim gugur.",
        "Kaktus yang memiliki nama latin Parodia magnifica ini memiliki postur tanaman yang menggemaskan. Seperti bola berduri tajam namun terlihat halus, kaktus ini cocok dijadikan aksesori di ruang tamu.Tanaman hias ini memiliki warna duri kekuningan hingga keemasan, jika berbunga ia akan menghasilkan bunga kecil berwarna kuning. Selain itu, pemilik harus berhati-hati sebab kaktus ini memiliki karakteristik sangat kering dan tidak menoleransi suhu dan embun dingin atau salju."
    )

    private val GambarTanaman = intArrayOf(
        R.drawable.bunga_alamanda,
        R.drawable.cemara_laut,
        R.drawable.kaktus_ariocarpus,
        R.drawable.palem_raja,
        R.drawable.bunga_amarilis,
        R.drawable.cemara_perak,
        R.drawable.kaktus_echinocactus_grusoni,
        R.drawable.palem_washington,
        R.drawable.bunga_sepatu,
        R.drawable.kaktus_parodia
    )

    private val NamaLatin = arrayOf(
        "Allamanda cathartica",
        "Casuarina equisetifolia",
        "Ariocarpus",
        "Roystonea regia",
        "Amaryllis sp",
        "Abies alba",
        "Echinocactus grusonii",
        "Washingtonia robusta",
        "Hibiscus rosa-sinensis",
        "Parodia Magnifica"
    )

    private val HargaTanaman = arrayOf(
        "Rp. 20.000",
        "Rp. 28.500",
        "Rp. 975.000",
        "Rp. 23.500",
        "Rp. 20.000",
        "Rp. 28.000",
        "Rp. 22.000",
        "Rp. 45.500",
        "Rp. 23.400",
        "Rp. 38.000"
    )

    private val asalTanaman = arrayOf(
        "Kab. Tangerang",
        "Kota Batu",
        "Kota Denpasar",
        "Kota Batu",
        "Kota Malang",
        "Kota Batu",
        "Kota Batu",
        "Jakarta Timur",
        "Kab. Malang",
        "Jakarta Barat"
    )

    private val iklim = arrayOf(
        "Rendah",
        "Tinggi",
        "Rendah",
        "Tinggi",
        "Tinggi",
        "Tinggi",
        "Tinggi",
        "Rendah",
        "Tinggi",
        "Rendah"
    )

    private val matahari = arrayOf(
        "Penyinaran Sepanjang Hari",
        "Penyinaran Sepanjang Hari",
        "Dibawah Naungan",
        "Penyinaran Sepanjang Hari",
        "Penyinaran Sepanjang Hari",
        "Penyinaran Sepanjang Hari",
        "Dibawah naungan",
        "Penyinaran Sepanjang Hari",
        "Penyinaran Sepanjang Hari",
        "Dibawah naungan"
    )

    val listData: ArrayList<tanaman>
        get() {
            val list = arrayListOf<tanaman>()
            for (position in NamaTanaman.indices) {
                val Tanaman = tanaman()
                Tanaman.nama = NamaTanaman[position]
                Tanaman.detail = DetailNama[position]
                Tanaman.nama_latin = NamaLatin[position]
                Tanaman.photo = GambarTanaman[position]
                Tanaman.harga = HargaTanaman[position]
                Tanaman.asal = asalTanaman[position]
                Tanaman.iklim = iklim[position]

                list.add(Tanaman)
            }
            return list
        }
}
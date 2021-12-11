package com.ysp.responsippb

object DataProduct {

    private val namaProduct = arrayOf(
        "Rexus Headset Gaming Vonix F27 / F-27 - Biru",
        "SAGE Keyboard Gaming LED 104 keys type AK - 600",
        "Es Kopi Susu 500 gram",
        "Patriot P300 M.2 2280 PCI-e Gen.3 x 4 (NVMe 1.3) SSD 128 GB",
        "Keychron K4 (version 2) Hot-Swappable RGB Backlight",
        "SSD RX7 120GB",
        "Keyboard Gaming Membrane AULA S-2056 Round- New LED R -Macro Software",
        "Headset Gaming Wired 3 Power Up ARGON 200 3.5mm RGB Breathing Light",
        "Kopi Encore! 50/50 Blend 1kg Three Folks | Kopi Susu Espresso Blend - Biji Kopi",
        "Digital Alliance Delta Fighter RGB-Headset Gaming",
        "NVME 256GB 2242 M2 MIDASFORCE LIGHTNING MAX SSD NVME PCIE GEN3 X4",
        "PROMO BUNDLING Rexus Headset Wireless Daxa TS1 + Stand Bungee J3 - TS1 Putih, J3 Hitam"
    )

    private val hargaProduct = intArrayOf(
        200000,
        165000,
        50000,
        388000,
        1399000,
        196000,
        200000,
        110000,
        80000,
        185000,
        540000,
        929000
    )

    private val fotoProduct = intArrayOf(
        R.drawable.product_1,
        R.drawable.product_2,
        R.drawable.product_3,
        R.drawable.product_4,
        R.drawable.product_5,
        R.drawable.product_6,
        R.drawable.product_7,
        R.drawable.product_8,
        R.drawable.product_9,
        R.drawable.product_10,
        R.drawable.product_11,
        R.drawable.product_12
    )

    val listData: ArrayList<Product>
        get() {
            val list = arrayListOf<Product>()
            for (position in namaProduct.indices) {
                val produk = Product()
                produk.namaProduct = namaProduct[position]
                produk.hargaProduct = hargaProduct[position]
                produk.fotoProduct = fotoProduct[position]
                list.add(produk)
            }
            return list
        }

    val totalHarga = hargaProduct.sum()
    var jumlahTransaksi = hargaProduct.size

}
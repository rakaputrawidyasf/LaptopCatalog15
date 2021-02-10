package com.example.laptopcatalog15

object Catalogs {

    private val brandModels = arrayOf(
            "Apple MacBook Air",
            "Dell XPS 15",
            "HP Spectre x360",
            "Dell XPS 13",
            "LG Gram 17",
            "Acer Swift 3",
            "MacBook Pro",
            "Asus ROG Zephyrus G14",
            "Asus TUF A15",
            "HP Elite Dragonfly",
            "HP Envy x360 13",
            "Google Pixelbook Go",
            "Asus Chromebook Flip",
            "Asus VivoBook S15",
            "Microsoft Surface Laptop 3"
    )

    private val prices = arrayOf(
            "$989.66",
            "$1,199.99",
            "$874.99",
            "$1,058.99",
            "$1,257.28",
            "$670",
            "$2,199",
            "$1,099.99",
            "$826.95",
            "$1,799.96",
            "$722.99",
            "$649",
            "$598",
            "$699.99",
            "$799"
    )

    private val images = intArrayOf(
            R.drawable.img_apple_macbook_air,
            R.drawable.img_dell_xps_15,
            R.drawable.img_hp_spectre_x360,
            R.drawable.img_dell_xps_13,
            R.drawable.img_lg_gram_17,
            R.drawable.img_acer_swift_3,
            R.drawable.img_macbook_pro,
            R.drawable.img_asus_rog_zephyrus_g14,
            R.drawable.img_asus_tuf_a15,
            R.drawable.img_hp_elite_dragonfly,
            R.drawable.img_hp_envy_x360_13,
            R.drawable.img_google_pixelbook_go,
            R.drawable.img_asus_chromebook_flip,
            R.drawable.img_asus_vivobok_s15,
            R.drawable.img_microsoft_surface_3
    )

    private val descriptions = arrayOf(
            "The new Apple MacBook Air (M1, 2020) isn't just the best laptop Apple has ever made, it's the best laptop money can buy right now. This is the first time a MacBook has topped our best laptops list, but the MacBook Air (M1, 2020) is worthy of this spot. Thanks to the revolutionary ARM-based Apple M1 chip that powers the new MacBook Air (Apple has ditched Intel for these new laptops), this is a stunning achievement: a thin and light laptop that offers great performance, even with 4K video editing, while also offering incredible battery life. Easily managing over 11 hours on a single charge, this is a laptop you can easily carry around with you at work or school, and its price is incredibly competitive. Running both new and old Mac apps, the new MacBook Air can now also run iOS apps for iPhone and iPads, giving it access to hundreds of brilliant mobile applications and games as well.",
            """
                The Dell XPS 15 ticks pretty much every box when it comes to what we want from a laptop. It's got some of the latest, and best, mobile tech from Intel, and can even be configured with a discrete GPU, making it adept at images and as for video editing software, and even a spot of light gaming.
                
                It also features one of the finest designs we've seen in a laptop, and is arguably the most stylish Windows 10 laptop on the market right now. Battery life is also phenomenal, and the price, while high, isn't that bad considering what you get.
            """.trimIndent(),
            """
                The HP Spectre x360 2-in-1 laptop had a big refresh, and the boost in specs, with 10th-generation Intel Core processors and Intel Iris Plus graphics, along with the impeccable 2-in-1 design and pristine gem-cut chassis.
                
                While it's certainly pricey, you're getting some excellent extras, such as formidable security features and Bang &amp; Olufsen speakers. If you care about aesthetics as much as you do performance and overall quality, this is the laptop for you.
            """.trimIndent(),
            """
                At this point, we doubt that the Dell XPS line can do anything wrong. Its yearly updates have consistently made it to our best laptops list, and they’re only getting better. The Dell XPS 13 (2020) is not only a gorgeous piece of kit. It also comes, as expected, with excellent performance, a stunning display and long battery life, alongside a few others.
                
                Much like its predecessor, it’s a pricey investment – but that is barely reason enough for us to discourage Ultrabook fans. This is among the best laptops of 2021, and it’s worth every penny.
            """.trimIndent(),
            """
                Usually when you're going for a 17-inch laptop, you have to give up any notion of portability. Typically laptops of this size are these gigantic bulky things, packed with the most powerful components to attract creative professionals. However, while the LG Gram 17 abandons the full-fat H-series processors for Intel Ice Lake Ultrabook-class chips, it makes up for that by being a 17-inch laptop that's as light as a 13-inch one.
                
                This all means you can get a gorgeous 17-inch 1600p display in a laptop that weighs just 2.98 lbs (1.35kg). When you couple that lightweight design with the fact that the battery lasted more than 14 hours in our testing, you have the recipe for the perfect laptop for anyone that needs to get work done while traveling.
            """.trimIndent(),
            """
                Beyond the Acer Swift 3's modest exterior, you'll find an excellent laptop that boasts plenty of power for work and study. The Swift 3 (not to be confused with the Switch 3 another laptop from Acer) is an inexpensive laptop; however, that plain chassis is all-aluminum and packed with beefy components.
                
                In terms of performance, it gets surprisingly close to the far more expensive Microsoft Surface Laptop. Its display is a little lower-res, but the two are otherwise strikingly similar - other than the price.
                
                This laptop is incredible to use as well, with its roomy trackpad as well as its backlit keyboard that offers a comfortable typing experience with decent travel.
            """.trimIndent(),
            """
                While we are sad that the 15-inch MacBook Pro is no more, we’ve welcomed the MacBook Pro (16-inch) with open arms. As thin, light and sleek as ever, you wouldn’t think this was a 16-inch behemoth.
                
                Yet, you’re getting that extra real estate on that stunning display, as well as the latest and greatest components behind it. This is, without a doubt, the best MacBook for content creators, designers and other creative professionals. With amazing (and loud) speakers and a much, much better keyboard to boot.
            """.trimIndent(),
            "This is an absolute beast of a gaming laptop, delivering an incredible performance with its AMD Ryzen 4000 processors and Nvidia RTX 2060 graphics card while touting best-in-class battery life that will last you all day long, a fast display with a 120Hz refresh rate and a lightweight, ultra-thin design. The best part is that you’re getting all that without burning a hole in your pocket.",
            "Much of what we love about the Asus TUF A15 is down to the brilliant AMD Ryzen 4000 mobile processor inside. The Asus TUF A15, however, is not just fantastic gaming performance, but a great value gaming rig with a long battery life and military-grade durability as well. With the help of Nvidia’s best 1080p graphics card (the RTX 2060), this Ryzen 4000-powered laptop will see you through all your 1080p gaming demands without burning a hole in your pocket. Whether you play a lot of competitive esports, or need a rugged laptop, this one’s a winner.",
            """
                This laptop from HP is one of the best business laptop – put simply, this is one of the most stylish and slimline laptops you'll ever see, and it's also packed with some brilliant features and powerful components.
                
                While the HP Elite Dragonfly is primarily aimed at business users, don't let that put you off. Its incredible design and gorgeous screen makes this the best laptop for anyone who can afford it. Battery life is excellent, the keyboard is a joy to type on, and it also has LTE connectivity. This lets you plug in a SIM card and access mobile internet wherever you are, without having to connect to slow (and potentially compromised) Wi-Fi hotspots.
            """.trimIndent(),
            """
                Thanks to its sleek, 13-inch design, this 2-in-1 is leaner that you might have expected, which works in your favor when engaging it in tablet mode. There are other compelling reasons why the HP Envy x360 is worth considering when you’re on the lookout for the best laptops, especially in the 2-in-1 form factor.
                
                This HP beauty offers a premium build, boasts 9 hours of video playback and delivers a performance that will get you through most of your schoolwork and project, at a very reasonable price.
            """.trimIndent(),
            """
                Google's Pixelbook Go is the best Chromebook money can buy right now, with the company showing everyone else how it's done. Its previous Chromebook, the Pixelbook, was a brilliant Chromebook in its own way, but it cost a small fortune.
                
                The Pixelbook Go, on the other hand, is a more affordable Chromebook that retains a lot of its predecessor's premium features, while bringing some brilliant upgrades as well, including an astounding battery life and fantastic keyboard.
                
                It features some impressive specs for a Chromebook, which ensures that Chrome OS positively flies on this device, and puts its performance on par with many of the more expensive Windows laptops and MacBooks that grace the rest of this best laptops list. If you're looking for the ultimate Chromebook, then the Pixelbook Go is the one to get.
            """.trimIndent(),
            """
                For many people, Chromebooks are affordable laptops that are perfect for students, and the Asus Chromebook Flip C302 is easily one of the best Chromebooks, and one of the best laptops, money can buy.
                
                It comes with an Intel Core processor, full 1080p display, touchscreen, backlit keyboard and USB-C port.
            """.trimIndent(),
            """
                The new Asus VivoBook S15 hasn't been out for long, and it's made its way straight into our best laptops list. This is because it combines a thin and light design with great performance and an excellent price.
                
                If you're looking for a mid-range laptop that doesn't cost too much, but still performs brilliantly, then this is the best laptop for you.
                
                Thanks to its powerful Intel processor, 8GB of RAM and fast SSD storage, this is a laptop that can handle almost any task with ease – though gaming is out of the question. Its 15.6-inch screen is bright and vibrant, and it has loads of ports that makes it easy to hook up your favorite peripherals.
                
                However, it doesn't have the longest battery life for a laptop, and the ScreenPad, which replaces the traditional touchpad below the keyboard with a touchscreen, takes a bit of getting used to.
            """.trimIndent(),
            """
                With the third version of the Surface Laptop 3, Microsoft has made its best laptop yet. While it's not a huge leap over its predecessor, the Surface Laptop 3 does improve on almost every aspect.
                
                Best of all, with the 15-inch version you now get a choice of either Intel or AMD hardware. Previously, only Intel tech was included. Elsewhere, the Surface Laptop 3 continues the Surface Laptop's reputation for being a stunningly designed laptop.
                
                These are some of the most desirable laptops in the world that don't have a logo of an apple on them, with a new aluminum body that gives it a premium feel, while protecting it from knocks and drops. There are still a few niggles, like the continued lack of ports, but in general this is one of the best laptops in the world right now.
            """.trimIndent()
    )

    private val specifications = arrayOf(
            """
                CPU: Apple M1
                Graphics: Integrated 7-core/8-core GPU
                RAM: 8GB – 16GB
                Screen: 13.3-inch (diagonal) 2,560 x 1,600 LED-backlit display with IPS technology
                Storage: 256GB – 2TB SSD
                Dimensions: 11.97 x 8.36 x 0.63 inches (30.41 x 21.24 x 1.61cm; W x D x H)
            """.trimIndent(),
            """
                CPU: 10th-generation Intel Core i5 – i7
                Graphics: Intel Iris Plus Graphics - Nvidia GeForce GTX 1650 Ti
                RAM: 8GB – 64GB
                Screen: 15.6" FHD+ (1920 x 1200) IPS - UHD+ (3840 x 2400)
                Storage: 256GB – 1TB SSD
            """.trimIndent(),
            """
                CPU: 10th-generation Intel Core i5 – i7
                Graphics: Intel Iris Plus Graphics
                RAM: 8GB – 16GB
                Screen: 13.3" FHD (1920 x 1080) IPS BrightView micro-edge WLED-backlit multitouch – 13.3" diagonal 4K (3840 x 2160) UWVA BrightView micro-edge AMOLED multitouch
                Storage: 256GB – 2TB SSD
            """.trimIndent(),
            """
                CPU: Up to 11th Generation Intel Core i7-1165G7
                Graphics: Up to Intel Iris Xe Graphics
                RAM: Up to 32GB 4267MHz LPDDR4x
                Screen: 13.4" FHD+ (1920 x 1200) InfinityEdge Non-Touch Anti-Glare 500-Nit – 13.4" UHD+ (3840 x 2400) InfinityEdge Touch Anti-Reflective 500-Nit Display
                Storage: Up to 2TB M.2 PCIe NVMe
            """.trimIndent(),
            """
                CPU: Intel Core i7-1065G7
                Graphics: Intel Iris Plus
                RAM: 16GB
                Screen: 17-inch 1600p (2,560 x 1,600)
                Storage: 2 x 512GB SSD
            """.trimIndent(),
            """
                CPU: up to Intel Core i7-8565U
                Graphics: Nvidia GeForce MX150, Intel HD Graphics 620 or AMD Radeon Vega 8
                RAM: 4GB – 8GB
                Screen: 14-inch FHD (1,920 x 1,080) ComfyView IPS – 15.6" Full HD (1920 x 1080)
                Storage: 128GB – 1 TB HDD, 16 GB Intel Optane Memory
            """.trimIndent(),
            """
                CPU: 9th-generation Intel Core i7 – i9
                Graphics: AMD Radeon Pro 5300M – Radeon Pro 5500M
                RAM: 16GB – 64GB
                Screen: 16-inch Retina display with True Tone
                Storage: 512GB – 8TB SSD
            """.trimIndent(),
            """
                CPU: AMD Ryzen 7 4800HS – 9 4900HS
                Graphics: NVIDIA GeForce RTX 2060
                RAM: 16GB – 32GB
                Screen: 14-inch Non-glare Full HD (1920 x 1080) IPS-level panel, 120Hz – 14-inch Non-glare WQHD (2560 x 1440) IPS-level panel, 60Hz
                Storage: 512GB / 1TB M.2 NVMe PCIe 3.0
            """.trimIndent(),
            """
                CPU: AMD Ryzen 5 4600H – 7 4800H
                Graphics: NVIDIA GeForce GTX 1660TI – RTX 2060
                RAM: up to 32 GB SDRAM
                Screen: 15.6" (16:9) FHD (1920x1080) 60Hz Anti-Glare IPS-level Panel – 15.6" (16:9) FHD (1920x1080) 144Hz Anti-Glare IPS-level Panel
                Storage: 1TB 5400 rpm SATA HDD – 256GB/512GB/1TB PCIe Gen3 SSD
            """.trimIndent(),
            """
                CPU: 8th-generation Intel Core i5 – i7
                Graphics: Intel UHD Graphics 620
                RAM: 8GB - 16GB
                Screen: 13.3" diagonal Full HD touch display – Full HD touch Sure View display
                Storage: 256 GB SSD
            """.trimIndent(),
            """
                CPU: AMD Ryzen 3 3300U – AMD Ryzen 7 3700U
                Graphics: AMD Radeon Vega 6 – Radeon Vega 10
                RAM: 8GB – 16GB
                Screen: 13.3" diagonal FHD IPS (1,920 x 1,080)
                Storage: 256 GB – 1TB SSD
            """.trimIndent(),
            """
                CPU: Intel Core m3 - Intel Core i7
                Graphics: Intel UHD Graphics 615
                RAM: 8GB - 16GB
                Screen: 13.3-inch Full HD (1,920 x 1,080) or 4K LCD touchscreen
                Storage: 128GB - 256GB eMMC
            """.trimIndent(),
            """
                CPU: Intel Pentium – Core m7
                Graphics: Intel HD Graphics 510 – 515
                RAM: 4GB – 8GB
                Screen: 12.5-inch FHD (1,920 x 1,080) LED backlit anti-glare display
                Storage: 32GB – 128GB eMMC
            """.trimIndent(),
            """
                CPU: Intel Core i5 – i7
                Graphics: Intel UHD Graphics
                RAM: 8GB DDR4
                Screen: 15.6-inch full HD (1920 x 1080)
                Storage: 512GB SSD
            """.trimIndent(),
            """
                CPU: Intel Core i5 - i7 / AMD Ryzen 5 / AMD Ryzen 7
                Graphics: Intel Iris Plus Graphics / AMD Radeon Vega 9 / AMD Radeon RX Vega 11
                RAM: 8GB - 16GB
                Screen: 13.5-inch PixelSense (2,256 x 1,504) / 15-inch PixelSense (2,496 x 1,664)
                Storage: 128GB, 256GB, 512GB or 1TB SSD
            """.trimIndent()
    )

    val catalogList : ArrayList<Laptop>
        get() {
            val list = arrayListOf<Laptop>()
            for(position in brandModels.indices) {
                val laptop = Laptop(
                        brandModels[position],
                        descriptions[position],
                        specifications[position],
                        prices[position],
                        images[position]
                )
                list.add(laptop)
            }
            return list
        }
}
# CoolTexts: Developer-Centric Motivation Engine (Android)

Bu proje, yazılım geliştirme sürecindeki mental direnci artırmak ve disiplini teknolojiyle birleştirmek amacıyla geliştirilmiş bir **Android Live Wallpaper (Canlı Duvar Kağıdı)** çalışmasıdır. Sıradan bir "motivasyon uygulaması" olmanın ötesinde, kullanıcının kilit ekranını bir terminale ve disiplin merkezine dönüştürmeyi hedefler.

## 🧠 Projenin Felsefesi
Projenin temel motivasyonu, "Belli bir yıl sonra nerede olacağın, bugün attığın adımlara bağlıdır" düşüncesidir. Kod yazarken, antrenman yaparken veya sabahın ilk ışıklarında o yorgunluğu hissettiğinde, kilit ekranındaki "sıfır avans" anlayışıyla seni gerçeklerle yüzleştirir.

## 🛠️ Teknik Özellikler ve Mimari
Proje, Android'in düşük seviyeli servislerinden biri olan `WallpaperService` üzerine inşa edilmiştir.

- **Dinamik Render:** Yazılar, sistem kaynaklarını tüketmemek için sadece ekran görünür olduğunda `Canvas` üzerine çizilir.
- **Robust Layout Management:** Android cihazlardaki ekran genişliği hesaplama hatalarına (0-width crash) karşı kurşun geçirmez bir hata yönetim zırhı (Error Handling) içerir.
- **Dinamik Veri Seti:** 1000'den fazla metin; tarihsel figürler, antik diller ve modern disiplin ikonlarının sözlerinden oluşur.
- **Performans Odaklı:** `StaticLayout.Builder` kullanılarak metinlerin ekran hizalaması ve çizimi optimize edilmiştir, batarya dostudur.

## 🌍 Veri İçeriği (Multi-Language Support)
Uygulama, dünya tarihindeki en sert ve disiplin odaklı kültürlerden damıtılmış geniş bir kütüphaneye sahiptir:
- **Eski Türk Kağanları & Komutanlar:** Bilge Kağan'dan Atatürk'e savaş meydanı disiplini.
- **Antik Yunan (Sparta & Stoa):** Leonidas'tan Seneca'ya sarsılmaz irade.
- **Viking Destanları (Hávamál):** Kuzeyin acımasız hayat kanunları.
- **Uzak Doğu (Samuray & Çin Seddi):** Musashi ve Sun Tzu stratejileri.
- **Modern Disiplin:** David Goggins, Kobe Bryant ve Jocko Willink ekolü.
Dilerseniz "CoolTexts\app\src\main\java\com\example\cooltexts\MyWallpaperService.kt" dosyasından dilediğiniz sözleri ekleyip çıkartabilirsiniz.

## 🚀 Teknik Kurulum (Build from Source)
Bu bir son kullanıcı ürünü değil, bir **open-source projedir**. Kendi cihazınızda çalıştırmak için:

1. Depoyu klonlayın: `git clone https://github.com/emirhanyildirir/CoolTextsApp.git`
2. Projeyi **Android Studio** ile açın.
3. Gradle senkronizasyonunun bitmesini bekleyin.
4. `Run` (Shift+F10) butonuna basarak cihazınıza yükleyin.
5. Uygulama ikonuna dokunarak servisi aktifleştirin.

## 👨‍💻 Geliştirici Notu
> "Yorulduğunda değil, işin bittiğinde dur." - David Goggins


---
**Teknoloji Yığını:** Kotlin, Android SDK, WallpaperService, Canvas API.
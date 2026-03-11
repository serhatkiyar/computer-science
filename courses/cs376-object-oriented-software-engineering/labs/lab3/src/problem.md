## Lab Görevi: lab3.Vehicle Abstract Class ve Encapsulation Uygulaması

### 1. Temel Yapı: `lab3.Vehicle` Soyut Sınıfı

`lab3.Vehicle` adında bir **abstract class** oluşturulmalıdır. Bu sınıf, bir aracın temel fiziksel ve operasyonel özelliklerini tanımlar:

* **Özellikler (Fields):** `brand` (Marka), `speed` (Hız), `fuelLevel` (Depo Seviyesi) özellikleri **private** (veya miras alan sınıflar için **protected**) olarak tanımlanmalıdır.
* **Kapsülleme (Encapsulation):** Bu özelliklere yalnızca `getter` ve `setter` metodları üzerinden erişim sağlanmalıdır.
* **Limitler:** Aracın maksimum hızı **200 km/s**'yi aşmamalıdır.

### 2. Operasyonel Mantık ve Kısıtlamalar

Araç şu mantıksal kurallara göre çalışmalıdır:

* **Yakıt Kontrolü:** Eğer `fuelLevel <= 0` ise araç çalışmamalıdır.
* **Hızlanma Engeli:** Yakıtı bitmiş bir araç `accelerate()` fonksiyonunu tetikleyemez.
* **Abstract Metotlar:** `accelerate()`, `start()` ve belirtilen diğer operasyonlar soyut olarak tanımlanmalı ve alt sınıflarda gövdeleri yazılmalıdır.

### 3. Kalıtım: `lab3.Car` Sınıfı

`lab3.Vehicle` sınıfından türetilen (extend edilen) bir `lab3.Car` sınıfı oluşturulmalıdır:

* **Özelleştirme:** `accelerate()` işlemi her araç tipine göre farklılık göstermelidir. Örneğin, bir otomobil hızlanırken harcadığı yakıt ile bir traktörünki aynı olmamalıdır.
* **Yan Etkiler:** Hız artırıldığında `speed` artarken, `fuelLevel` belirlenen tüketim katsayısına göre azalmalıdır.

### 4. Test Case (lab3.Main Metodu)

`lab3.Main` sınıfı içerisinde bir `lab3.Car` nesnesi oluşturularak sistem test edilmelidir:

1. Önce `start()` fonksiyonu çağrılmalıdır.
2. Araçta yakıt olup olmadığı kontrol edilmeli, varsa çalışmaya başlamalıdır.
3. **Döngü Testi:** Örnek olarak **15 iterasyonluk** bir hızlanma döngüsü kurulmalıdır. Her iterasyonda mevcut hız ve yakıt seviyesi konsola yazdırılmalıdır.

---
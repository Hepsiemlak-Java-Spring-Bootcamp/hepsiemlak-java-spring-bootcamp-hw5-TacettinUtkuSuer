### Ödev 5 Soru 2
#### Tacettin Utku Süer



- ##### TDD



Bir uygulama geliştirilirken en yaygın olarak önce kod yazılır, çalıştığı düşünüldüğünde ise bir test yazılarak proje tamamlanır. TDD yani Test Driven Development'ta ise önce test yazılır ona göre proje kodları yazılır. İlk başta biraz garip gelse de bu tekniğin en büyük amacı maliyetleri düşürmektedir. Klasik yöntem ile kod yazıldığında test sırasında çıkan hataları gidermenin maliyeti çok daha fazladır. Buna ek olarak TDD bize kodlarımızın daha yalın ve basit olmasını da sağlar.



TDD yönteminin adımları ise, bir test yaz, test başarısız olur, testi başarılı hale getirecek proje kodlarını yaz, mevcut bütün testler için aynı döngüyü kullan ve hepsini başarılı olmasını sağla. Bu işlemler sonucunda çalışan yalın bir koda sahip olmuş oluyoruz. Bir çok yazılım mühendisinin testten kaçınması da böylece önüne geçilmiş olunuyor.



- ##### JUnit



Junit 5 Java 8 kodlama stilini uyarlamayı ve JUnit 4'ten daha sağlam ve esnek olmayı amaçlamaktadır. JUnit 4 tek bir jar dosyasında toplanmış iken JU5 ise JUnit Platform, JUnit Jupiter ve JUnit Vintage olmak üzere 3 alt projeden oluşmaktadır. JU4 Java 5 ve üstü, JU5 ise Java 8 ve üstü versiyonlar ile çalışmaktadır. JU5'te assert işlemlerinde ilk parametre her zaman expected değerdir fakat JU4'te bu böyle değildir. 



JU5'te test sınıf ve yöntemlerinin public olma zorunluluğu kalkmıştır. Protected olabilmektedir. JU test sınıflarını ve test yöntemlerini bulmak için reflection kullanmaktadır ve bu yüzden public olması gerekmemektedir. 



JU5'te 3. taraf eklentiler ve IDE entegrasyonlarına izin verilebilmektedir.



- Mock



Mock objesi, herhangi bir objenin yerine geçebilen gerçek olmayan objelerdir. Bu objeleri istediğimiz gibi davranmalarını sağlayabiliriz. Asıl görevi ise test ettiğimiz kısmın bağımlılıklarının akışımızı engellememesini sağlamaktır. Testin istediğimiz senaryoda ilerlemesini sağlar. Karmaşık objelerin yavaşlıklarının önüne geçilmiş olunur. Aşağıda bir örnek yer almaktadır.



```java
@RunWith(MockitoJUnitRunner.class)
public class SinifTest{
    // Mocklanan objeleri Sinif classına injecte ediyoruz.
	@InjectMock
    private Sinif sinif;
    
    //Sinif classı içinde bağımlılık yaratan nesneleri mockluyoruz
    @Mock
    private Obje obje;
    
    @Test
    public void methodTest(){
        mockito.when(burdaki_metot_çağırıldığında).thenReturn(bu_değer_döndürülecek);
        
    }
    
}
```



- Spring Profile



Uygulamalar farklı ortamlarda farklı konfigürasyonlara sahip olabilmektedir. Spring Profile bu farklı ortamları yönetebilmemizi sağlamaktadır. Temel olarak test ve prod olmak üzere iki ortam vardır. Databaselerin bağlantısı, servis adresleri, servis portu, security'si gibi özellikler farklılık gösterebilir. Ortam değişikliklerinde bu konfigürasyonları değiştirebilmemiz için profile kullanmaktayız. @Profile('Test')

[Kaynak: Cem Dırman]






















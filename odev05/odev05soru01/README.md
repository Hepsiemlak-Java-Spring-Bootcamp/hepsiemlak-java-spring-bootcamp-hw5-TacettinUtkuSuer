### Ödev 5 Soru 1
#### Tacettin Utku Süer



Monolitik mimari bir uygulamanın birden fazla özelliği olan tek bir servistir. Mikroservis mimarisi ise uygulamayı oluşturan her bir ayrı iş için ayrı bir servis oluşturularak birçok servisin bir arada çalışmasıdır. 



Monolitik mimari 3 kısımdan oluşmaktadır. Birinci kısım kullanıcı arayüzü olan client, ikinicisi işlerin yürütüldüğü sunucu kısmı ve son kısım veri işlemlerini yapan databasedir. Tek bir kod bloğundan oluştuğu için herhangi bir noktada oluşacak sorun programın tamamını etkileyerek sistemin çökmesine neden olmaktadır. Yapılacak olan herhangi bir güncellemede uygulamanın tümüne müdahale edilmesi gerekmektedir.



Mikroservis mimarisinde ise her biri kendi işini yapan servislerden oluştuğu ve aralarında olabildiğinde az bağımlılık olacak şekilde oluşturulmuş olmasından dolayı bakım ve güncelleme sırasında bütün servislere müdahale edilmesi gerekmemektedir. Bir servisin çökme durumunda sistemin geri kalanı çalışmaya devam edebileceğinden dolayı sistemin tamamı çökmez. Bir servisin çok yoğun olması durumunda, monolitikde ki gibi sistemin tamamının scale edilmesine gerek olmadan sadece yoğun olan servis klonlanarak kaynakların gereksiz kullanımının önüne geçilebilmektedir.



Monolitik bir uygulamada, uygulama içi haberleşme kullanmaya gerek kalmaz. Avantajları düşünülmediğinde mikroservis mimarisinde daha fazla kod yazmak gerekir. İnternet trafiği çok olmayan bir uygulamada gereksiz yere mikroservis kullanılmasında monolitik mimari kullanımı maliyetleri düşürür. Hata ayıklama ve uçtan uca test etme benzer şekilde daha kolaydır. Mikroservis mimarisindeki çokça servisin deploy edilmesindense monolitik mimaride tek bir servisin deploy edilmesi daha kolaydır.



Monolitik uygulamaların bu avantajlarının yanında getirdiği karmaşıklık, değişiklik yapma zorluğu, ölçeklenebilirliğin düşük olması ve yeni teknolojilerin projeye eklenme zorlukları vardır ve bu noktada mikroservis mimarisi ön plana çıkmaktadır.




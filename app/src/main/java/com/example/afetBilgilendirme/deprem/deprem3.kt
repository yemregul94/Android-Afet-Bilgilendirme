package com.example.afetBilgilendirme.deprem


import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.afetBilgilendirme.R


class deprem3 : Fragment() {

    lateinit var textView: TextView
    var icerik = "<b>Deprem hazırlıklarınızı tamamladınız, deprem anında sakinliğinizi koruyup kendinizi güvene aldınız ama işiniz henüz bitmedi. Deprem sonrasında yapacaklarınız da güvenliğinizi devam ettirmek için önemlidir.</b><br>" +

            "<h1><font color=red>Kapalı Alandaysanız:</font></h1>" +

            "<font color=black> &nbsp• Öncelikle sakin olun ve çevrenizdekileri de sakinleştirmeye çalışın. <br>" +
            " &nbsp• Önce kendinizde, daha sonra yakınlarınızdaki diğer kişilerde (evinizdeyseniz aileniz, işyerinde iş arkadaşları vb.) herhangi bir yaralanma olup olmadığını kontrol edin. Yaralanma tespit etmeniz halinde hemen ilk yardım uygulayın. Bulunduğu yerde daha fazla yara alma ihtimali ya da yaşamsal tehdit altında bulunmuyorsa, ağır yaralı birini hareket ettirmeye çalışmayın. Bilinç kaybı olan birinin taşınması söz konusu olursa, ilk yardım eğitimlerinde öğretildiği gibi boyun ve sırtı sabitleyerek yardım isteyin. Depremlerden sonra çıkan yangınlar oldukça sık görülen ikincil afetlerdir. Bu nedenle eğer gaz kokusu alırsanız, gaz vanasını kapatın. Camları ve kapıları açın. Hemen binayı terk edin. <br>" +
            " &nbsp• Eğer dökülmüşse kezzap, çamaşır suyu, tiner, yakıt ya da diğer yanıcı sıvıları temizleyin. Özellikle havalandırmanın zayıf olduğu ortamlarda, bu tür maddelerin buharından gelen bir koku alırsanız, dışarı çıkarken kapı ve pencereleri havalandırma amacıyla açarak binayı hemen tahliye edin. Yerinden oynayan telefon ahizelerini telefonun üstüne koyun. <br>" +
            " &nbsp• Yangın olup olmadığını kontrol edin. Eğer küçük yangınla mücadele etmek konusunda bilgili ve de gerekli malzemelere sahipseniz, müdahale edin; aksi takdirde herkesi de dışarı çıkararak acil durum setinizi alıp binayı tahliye edin. Tahliye sırasında geçtiğiniz tüm kapıları kapatın. <br>" +
            " &nbsp• Deprem sırası veya sonrasında elektrikler kesildiyse, kimyasal ışık çubukları, el feneri ışıldak gibi malzemeler kullanın. Olası bir gaz kaçağı ihtimaline karşı kapalı yerlerde kesinlikle çakmak/kibrit kullanmayın. <br>" +
            " &nbsp• Düşmüş ya da dökülmüş sıva, moloz ve cam parçalarının bulunabileceği tüm yerlerde sağlam tabanlı ayakkabı veya terlik giyerek yaralanma olasılığınızı azaltın. <br>" +
            " &nbsp• Artçı depremlere hazır olun. Artçı sarsıntılar, genellikle ana deprem kadar büyük olmamakla beraber, ana depremin zayıflattığı yapılara zarar verebilecek kadar güçlü olabilir. <br>" +
            " &nbsp• Binada yapısal bir hasar olup olmadığını kontrol edin. Eğer yapısal bir hasar tespit ederseniz ya da herhangi bir şekilde binada emniyetsiz bir durum fark ederseniz, inşaat mühendisi vb. bir yetkilinin görüşünü almadan geri girmeyin. <br>" +
            " &nbsp• Bacanızda bir hasar olup olmadığını tespit etmek için bina dışından gözle kontrol edin. Hasarlıysa yetkili bir kişiye kontrol ettirmeden soba, şömine gibi yerlerde ateş yakmayın. <br>" +
            " &nbsp• Tüm tesisat ve donatıları gözle kontrol ederek herhangi bir hasar olup olmadığını tespit etmeye çalışın. <br>" +
            " &nbsp• Gaz kokusu almanız ya da bir “tıslama”, “üfleme” sesi duymanız halinde; Doğal gaz için pencere açın, binayı terk edin ve dışarıdaki gaz vanasını kapatın. <br>" +
            " &nbsp• Mutfak tüpü (LPG) için gazı kesin, balkon ve pencere açın, binayı terk edin. Ortak yerleşim yeri olan apartman gibi bir ortamı terk etme halinde, tehlikeyi diğer kişilere de duyurun. Acilen gaz kokusunu ilgili kuruma bildirin ve kesinlikle binaya geri girmeyin. Unutmayın; gaz vanasını kapattıysanız, yalnızca ilgili kurumunun yetkilisi tarafından yeniden açılmalıdır. <br>" +
            " &nbsp• Elektrik sisteminde bir hasar olduğu biliniyor ya da şüpheleniliyorsa akım, ana şalterden (sigorta) kapatılmalıdır. <br>" +
            " &nbsp• Elektriği kapatmadan önce gaz vanasını kapatın. <br>" +
            " &nbsp• Bina içindeki su borularında herhangi bir hasar oluşması durumunda ana su vanasını kapatın. <br>" +
            " &nbsp• Atık su borularında herhangi bir hasar olup olmadığını kontrol etmeden tuvalet sifonunu çekmeyin. <br>" +
            " &nbsp• Eğer kapalı dolapları açmanız gerekiyorsa dikkatli açın. İçindeki cisimlerin raflardan kayarak düşebileceğini unutmayın. <br>" +
            " &nbsp• Yalnızca çok acil durumlarla ilgili telefon edin. <br>" +
            " &nbsp• Radyo ve televizyon gibi kitle iletişim araçlarıyla size yapılacak uyarıları dinleyin. <br>" +
            " &nbsp• Acil durum çantanızı yanınıza alın, mahalle buluşma noktanıza doğru harekete geçin. <br>" +
            " &nbsp• Cadde ve sokakların acil yardım araçları için boş bırakın. </font> <br>" +

            "<h1><font color=red>Açık alandaysanız:</font></h1>" +

            " <font color=black>&nbsp• Çevrenizdeki hasara dikkat ederek bunları not edin. <br>" +
            " &nbsp• Hasarlı binalardan ve enerji nakil hatlarından uzak durun. <br>" +
            " &nbsp• Önce hemen yakın çevrenizde acil yardıma gerek duyanlara yardım edin. <br>" +
            " &nbsp• Sonra mahalle toplanma noktanıza gidin. <br>" +
            " &nbsp• Yardım çalışmalarına katılın. Özel ilgiye ihtiyacı olan afetzedelere (yaşlılar, bebekler, özürlüler) yardımcı olun.</font> <br>" +

            "<h1><font color=red>Yıkıntı altında mahsur kaldıysanız:</font></h1>" +

            "<font color=black> &nbsp• Sakin kalmaya çalışın <br>" +
            " &nbsp• Kibrit/çakmak yakmayın. <br>" +
            " &nbsp• Gereksiz toz kaldıracak hareketlerde bulunmayın. <br>" +
            " &nbsp• Ağzınızı bir mendil ya da giysi parçasıyla örtün. <br>" +
            " &nbsp• Enkaz altındaki diğerleri ile irtibat kurmaya çalışın. <br>" +
            " &nbsp• Önce dışarı seslenin. Eğer dışarıdakiler sizi duymuyorsa bağırmakta ısrar etmeyin, bir boru ya da duvara taş ya da metalle vurarak dışarıdakilerin sizi bulabilmesini sağlayın. Son çare olarak bağırın. Sürekli bağırmak sizi tüketebilir, yüksek ve tehlikeli miktarlarda toz yutmanıza sebep olabilir. <br>" +
            " &nbsp• Hareket kabiliyetiniz kısıtlanmışsa çıkış için hayatınızı riske atacak hareketlere kalkışmayın. Biliniz ki kurtarma ekipleri en kısa zamanda size ulaşmak için çaba gösterecektir. Enerjinizi en tasarruflu şekilde kullanmak için hareketlerinizi kontrol altında tutun.</font> <br>"




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.deprem3, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.setText(Html.fromHtml(icerik))
    }
}

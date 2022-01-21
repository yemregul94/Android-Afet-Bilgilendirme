package com.example.afetBilgilendirme.yangin



import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.afetBilgilendirme.R


class yangin3 : Fragment() {

    lateinit var textView: TextView
    var icerik = "<font color=black>&nbsp• Telaşa kapılmadan çevrede yangın ihbar düğmesi varsa ona basılmalıdır.<br>" +
            "&nbsp• Herhangi bir olaya müdahale etmeden önce itfaiyeyi (110) arayın. Telefondaki görevliye; <b>yangının meydana geldiği yerin açık adresini, yanan binanın özelliklerini, yangının binanın hangi bölümünde olduğunu, yanan maddenin türünü, yangın anında bina içinde mahsur kalan olup olmadığını, size ulaşılabilecek bir telefon numarasını, görevlinin sizden isteyeceği diğer bilgileri verin. Adresin kolay bulunabilmesi için varsa herkes tarafından bilinen noktaları (alışveriş merkezi, postane gibi) bildirin.</b><br>" +
            "&nbsp• Yangın bulunduğunuz bölümde değil ise öncelikle elektrik ve gazı kesin, yangının hangi bölümde olduğunu tespit edin, kapı ve pencereleri kapatın.<br>" +
            "&nbsp• Eğer alevler çoğalmışsa ve binadan çıkış olanaksızsa, yatak altlarına dolaplara saklanılmamalı, pencereden dışarıdakilerle iletişim kurulmaya çalışılmalıdır.<br>" +
            "&nbsp• Dumandan boğulmamak için yardım gelene kadar eğilerek veya sürünerek hareket edilmeli, ağız ve burun ıslak bez ya da mendille kapatılarak nefes alınmalıdır.<br>" +
            "&nbsp• Duman ve yanık kokusu başka odadan geliyorsa kapılar açılmamalı, kapıya dokunulmamalıdır.<br>" +
            "&nbsp• Kıyafetiniz alev almışsa; koşmadan durup yere yatarak yuvarlanılmalıdır. Battaniye türü örtüler alınarak alevler boğulmaya çalışılmalıdır.<br>" +
            "&nbsp• Eğer vücudumuzda yanık varsa, hemen soğuk suya tutulmalıdır.<br>" +
            "&nbsp• Saklandığınız yerde kapı ve pencereleri açmayın, böylece duman size daha geç ulaşacaktır.<br>" +
            "&nbsp• Tanımadığınız bir binayı terk ederken acil yön levhalarını takip edin.<br>" +
            "&nbsp• Yetkililerin uyarılarını dikkate alın.<br>" +
            "&nbsp• Yaralı, engelli, yaşlı ve çocuklara  tahliye anında yardımcı olun. Yardım edemediğiniz kişiler ve durumları hakkında itfaiye yetkilisine bilgi verin.<br>" +
            "&nbsp• Tahliye anında ortam dumanlıysa dizlerinizin üzerinde tahliyeyi gerçekleştirin.</font><br>" +
            "<br>" +
            "<h1><font color=red>Yanan binanın dışında iseniz</font></h1>" +
            "<font color=black>&nbsp• İtfaiye 110'a haber verildiğinden emin olun. Tereddüt ederseniz itfaiyeyi  arayın.<br>" +
            "&nbsp• İtfaiye araçlarının olay yerine daha hızlı ulaşabilmesi için öncelikle hatalı park edilmiş araçlar olmak üzere sokaktaki bütün araçların kaldırılmasını sağlayın.<br>" +
            "&nbsp• Yangın, ilkyardım ve kurtarma eğitimi almış iseniz; itfaiye yetkililerine bildirin ve emniyet şeridinin dışında size verilebilecek görevler için bekleyin.<br>" +
            "&nbsp• Sizden yardım istenmediği müddetçe, itfaiye görevlilerinin çalışmalarına müdahale etmeyin.<br>" +
            "&nbsp• Bina ve dâhilinde mahsur kalanlar ile ilgili bilgi sahibi iseniz; itfaiye yetkililerine bu bilgiyi iletin.<br>" +
            "&nbsp• Binayı tanıtabilecek bilgilerin sahibi iseniz; itfaiye yetkililerine bu bilgileri iletin.<br>" +
            "&nbsp• İş yerlerinde yangın çıkması durumunda; 110’u arayarak İtfaiyeye haber verilmelidir. Yangın eğitimi almış yangın güvenlik sorumluları, kendilerini tehlikeye atmadan, alevlere ilk müdahaleyi gerçekleştirmeli, iş yerini tahliye etmeli ve personeli güvenli bölgelere çıkarmalıdır. Güvenlik personeli, olay yerine geldiklerinde itfaiye ekiplerine yangın hakkında gerekli bilgiyi vermelidir.<br>" +
            "Son olarak şunu unutmayın:</font> <font color=red>Yangınlarda meydana gelen yaralanma ve ölüm vakalarının çoğuna duman neden olmaktadır.</font><br>"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.yangin3, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.setText(Html.fromHtml(icerik))
    }
}

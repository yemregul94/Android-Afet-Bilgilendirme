package com.example.afetBilgilendirme.yangin


import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.afetBilgilendirme.R


class yangin2 : Fragment() {

    lateinit var textView: TextView


    var icerik = "<font color=black>&nbsp• Yapılarda yanmaz veya yanması güç yapı malzemeleri kullanılmalıdır.<br>" +
            "&nbsp• Ateşleyici ve yanıcı malzeme kaynakları birbirinden ayrı yerlerde depolanmalıdır.<br>" +
            "&nbsp• Yangın söndürme tüpü bulundurmalı, düzenli bakım yapılıp, son kullanma tarihine dikkat edilmeli ve nasıl kullanılacağı öğrenilmeli.<br>" +
            "&nbsp• Sabit elektrik tesisatı sık sık kontrolden geçirilmelidir.<br>" +
            "&nbsp• Sık sık yangın tatbikatları yapılmalıdır.<br>" +
            "&nbsp• Yangın çıkışları açık tutulmalı, acil ışıklandırma sistemleri kurulmalıdır.<br>" +
            "&nbsp• Çocukların ateşle oynamasına izin verilmemelidir.<br>" +
            "&nbsp• Soba, kalorifer ve mutfak ocakları dikkatli kullanılmalıdır.<br>" +
            "&nbsp• Yanıcı maddeler konutun uygun yerinde saklanılmalıdır.<br>" +
            "&nbsp• Elektrik tesisatından çıkabilecek yangınlara karşı tesisatın düzenli bakımı yaptırılmalıdır.<br>" +
            "&nbsp• Sıvasız, çatlak, hatalı inşa edilmiş ve dolmuş bacalar kullanılmamalıdır.<br>" +
            "&nbsp• Konutlarda da yangın söndürme tüpü bulundurulmalı, düzenli bakımları yaptırılmalı ve nasıl kullanılacağı öğrenilmelidir.<br>" +
            "&nbsp• Konut Yangınlarında tahliye zamanı çok kısıtlıdır, bu nedenle konutlar için tahliye planı yapılmalıdır.<br>" +
            "&nbsp• Yangınlarda erken uyarı çok önemlidir, bu nedenle her konutta mümkünse bir kaç tane duman detektörü bulundurulmalı, bunların düzenli olarak kontrolleri yapılmalıdır.<br>" +
            "&nbsp• Yangınlarla mücadele hakkında eğitim alın. Başta ailenizi olmak üzere çevrenizdekileri bu konuda bilinçlendirin.<br>" +
            "&nbsp• Acil telefon numaralarını öğrenin ve çocuklarınıza da öğretin.<br>" +
            "&nbsp• Çocuklarınıza yangın anında koltuk arkası, dolap gibi görünmeyen yerlere saklanmaması gerektiğini öğretin<br>" +
            "&nbsp• Çocuklarınıza itfaiye telefonlarının boş yere meşgul edilmeyeceğini öğretin.<br>" +
            "&nbsp• Çocuklarınızı asla evde yalnız bırakmayın.<br>" +
            "&nbsp• Kullanmadığınız cihazların fişini prizde bırakmayın.<br>" +
            "&nbsp• Üçlü priz ve benzeri ürünlerde fazla enerji tüketen elektrikli soba, ütü gibi cihazları aynı anda çalıştırmayın.<br>" +
            "&nbsp• Baca temizliğiyle birlikte kombi şofben gibi cihaz ve sistemlerin bakım ve tamiratlarını yetkili servislere yaptırın.<br>" +
            "&nbsp• Mutfak perdelerinin ocaktan uzak olmasına dikkat edin.<br>" +
            "&nbsp• Bulunduğunuz ortamda gaz kaçağı olduğunu fark ettiğinizde derhal gazı keserek 187 Doğal Gaz Acil hattını arayın. Gaz ortamı terk etmeden ateşle oynamayınız. Elektrikle çalışan cihazlara dokunmayın, cihazları prize takarken veya prizden çıkarken çıkabilecek olan kıvılcım yangına neden olabilir.<br>" +
            "&nbsp• Kullandığınız ısıtıcıların yakınında kesinlikle yanıcı madde bulundurmayın.<br>" +
            "&nbsp• Yatmadan önce sobanızı söndürün ve tüm ısıtıcıları kapatarak fişlerini prizden çekin.<br>" +
            "&nbsp• Araçlarınızı itfaiye ve ambulansların geçişlerini engelleyecek şekilde park etmeyin. Trafikte itfaiye araçlarına ve ambulanslara yol verin.</font><br>"



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.yangin2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.setText(Html.fromHtml(icerik))
    }
}

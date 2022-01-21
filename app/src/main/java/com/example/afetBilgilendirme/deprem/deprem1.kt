package com.example.afetBilgilendirme.deprem


import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.afetBilgilendirme.R

/**
 * A simple [Fragment] subclass.
 */
class deprem1 : Fragment() {

    /* var icerik = "<h1><font color=red>Başlık1</font></h1><br>" +
         "<h2>Başlık2</h2> <br>" +
         "<h2><i>Başlık2</i></h2> <br>" +
         "<p>Paragraf1</p> <br>" +
         "<p><b>Paragraf2</b></p> <br>"
*/

    lateinit var textView: TextView
    var icerik = "<b>En son teknoloji ile bile depremin ne zaman ve nerede olacağını bilmek mümkün değil. Durum böyle olunca her zaman deprem olabilirmiş gibi önlem almalıyız. Deprem öncesinde almamız gereken önemli önlemler aşağıda yer almaktadır.</b><br><br>" +

            "<font color=black>&nbsp• Öncelikle yaşadığımız coğrafyanın deprem riski olarak ne durumda olduğu öğrenilmelidir. Daha sonra da binanın depreme karşı ne kadar hazır olduğu öğrenilmelidir. Sonrasında varsa eksikleri zaman geçirmeden tamamlanmalıdır. <br>" +
            "&nbsp• Deprem sigortası ihmal edilmemelidir. Deprem sigortası, her ne kadar deprem öncesi için anlamı olmasa da deprem sonrası için hayati öneme sahiptir. <br>" +
            "&nbsp• Yatak ve oturma grupları, camlardan ve üzerine devrilebilecek dolap gibi cisimlerden uzak tutulmalıdır. <br>" +
            "&nbsp• Ağır cisimler dolapların en alt raflarına yerleştirilmelidir.  İçinde ağır eşya bulunan dolaplar ise sağlam şekilde kilitlenmelidir. <br>" +
            "&nbsp• Dolaplar ve beyaz eşyalar(özellikle buzdolabı) arkasındaki duvara sabitlenmelidir. Dolapların üzerindeki cisimlerin de dolaba yapıştırılarak kaymasını engellenmelidir. <br>" +
            "&nbsp• Soba, soba boruları, tüpler ve diğer ısıtıcılar iyice sabitlenmelidir.  <br>" +
            "&nbsp• Pencerelerin dışına sabitlenmemiş malzemeler konulmamalıdır. Bunlar deprem sırasında aşağıdaki inşalara zarar verebilir. <br>" +
            "&nbsp• Gaz kaçağı ve yangına karşı, gaz vanası ve elektrik sigortalarını otomatik hale getirilmelidir. <br>" +
            "&nbsp• Binadan acil çıkış yapmak için yol üzerindeki engeller temizlenmeli ve tüm acil çıkış yolları öğrenilmeli. <br>" +
            "&nbsp• Farklı konumlarda depreme yakalanılması ihtimaline karşı evdeki tüm bireyler için planlanma yapılmalı ve evdeki bireyler bilgilendirilmeli. <br>" +
            "&nbsp• Bebek varsa, beşiğin camdan ve sabitlenmemiş dolaplardan uzak olması sağlanmalıdır. Beşik ayrı bir odadaysa odadaki dolapların, odaya girişi engellememesi amacıyla sabitlenmesi gerekir. Deprem sonrasında kullanmak için bebek arabasının hazırda ve kolay ulaşılabilir yerde olması gerekir. <br>" +
            "&nbsp• Çocuk varsa, evdeki en güvenli noktalar ve acil çıkış yolları öğretilmelidir. Deprem sırasında ne yapması gerektiğine dair bilgilendirilmelidir. <br>" +
            "&nbsp&nbsp• <b>Deprem çantası hazırlanmalıdır. Deprem çantası içeriği örneği: </b><br>" +
            "&emsp o Su <br>" +
            "&emsp o Kolayca bozulmayacak yiyecek (konserve) <br>" +
            "&emsp o İlk yardım seti <br>" +
            "&emsp o Pilli radyo ve pilleri <br>" +
            "&emsp o El feneri (yedek pil ve ampulleri ile) <br>" +
            "&emsp o Battaniye <br>" +
            "&emsp o Nakit para <br>" +
            "&emsp o Kibrit/çakmak <br>" +
            "&emsp o Kalem, kâğıt <br>" +
            "&emsp o Düdük <br>" +
            "&emsp o Hijyenik ped vb. <br>" +
            "&emsp o Sigorta poliçeleri, bonolar, hisse senetleri, kontratlar, senetler vb.  <br>" +
            "&emsp o Kimlikler, pasaportlar, sigorta kartları, doktor kayıtları vb. <br>" +
            "&emsp o Değerli ev eşyalarının listesi, önemli telefon numaraları <br>" +
            "&emsp o Bebek malzemeleri (mama, ilaç vb.) <br>" +
            "&emsp o Devamlı kullanılan ilaçlar </font><br>"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?)

            : View? {
            return inflater.inflate(R.layout.deprem1, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.setText(Html.fromHtml(icerik))
    }
    }


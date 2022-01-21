package com.example.afetBilgilendirme.deprem


import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.afetBilgilendirme.R


class deprem2 : Fragment() {

    lateinit var textView: TextView


    var icerik = "<b>Deprem öncesinde tüm hazırlığımızı tamamlasak bile deprem sırasında ne yapacağımızı bilmemiz çok önemlidir.</b><br>" +

     "<h1><font color=red>Bina içindeyseniz:</font></h1>" +

            "<font color=black>&nbsp• Öncelikle sakin kalmanız ve etrafınızdakileri sakinleştirmeniz çok önemlidir. <br>" +
            "&nbsp• Öncelikle sakin kalmanız ve etrafınızdakileri sakinleştirmeniz çok önemlidir. <br>" +
            "&nbsp• Sabitlenmemiş dolaplardan ve pencerelerden uzak durulması gereklidir. <br>" +
            "&nbsp• Varsa sağlam sandalyelerle desteklenmiş masa altına veya dolgun ve hacimli koltuk, kanepe, içi dolu sandık gibi koruma sağlayabilecek eşya yanına çömelerek hayat üçgeni oluşturulmalıdır. Baş iki el arasına alınarak veya bir koruyucu (yastık, kitap vb.) malzeme ile korunmalıdır. Sarsıntı geçene kadar bu pozisyonda beklenmelidir. <br>" +
            "&nbsp• Büyük depremlerde ayakta durmak mümkün değildir, ayakta durmaya çalışırken salınma hareketi sonucu ciddi yaralanmalara yaşanabilir. Bu yüzden <b>“Yat/Çök – Korun/ Kapan – Tutun”</b> hareketi oluşturulmalıdır: <br>" +
            "&emsp o <b>Yat</b>: Yere yüzüstü yatma, ya da yan yatarak bacakları karına çekme (cenin) şeklindedir. <br>" +
            "&emsp o <b>Çök</b>: Özellikle masa altı gibi yerlerin tercih edildiği hallerde uygulanır. İki diz üzerine çökülerek vücut öne eğilir. <br>" +
            "&emsp o <b>Korun</b>: Özellikle baş bölgesinin korunması birinci önceliktir, yastık ya da başka bir cisimle başı “korumak” gibi. <br>" +
            "&emsp o <b>Kapan</b>: Başımızı kollarımızın arasına alarak “kapanmak”. <br>" +
            "&emsp o <b>Tutun</b>: Deprem sırasında salınan koltuk ve oturma grubu gibi ağır ve büyük cisimlere tutunarak onlarla beraber sallanabilir ve sizi ezmelerine engel olursunuz. <br>" +
            "&nbsp• Balkon, merdiven ve asansörler binaların en zayıf noktalarıdır buralardan uzak durmaya çalışın. <br>" +
            "&nbsp• Alışveriş merkezi gibi kalabalık alanlardaysanız ezilme riski olmayan yerlerde çök/kapan/tutun hareketini uygulayın eğer mümkün değilse oturarak veya ayakta dururken başınız koruyun. Oluşacak panikten dolayı çıkışlarda yığılma olacaktır buralardan uzak durmaya çalışın.</font> <br>"  +

     "<h1><font color=red>Dışarıdaysanız:</font></h1>" +

            "<font color=black>&nbsp• Dışarıda iseniz, binalardan, ağaçlardan, üst geçitlerden, köprülerden, elektrik direklerinden ve tellerinden uzak durun. Kaldırım ve bina kenarında bulunmanız halinde, yukarıdan düşebilecek kiremit, cam, tabela, sıva, mozaik, saksı gibi malzemelerden uzak durmaya çalışın. Açık bir noktada yere çökün/ oturun, yukarıdan düşebilecek cisimlere karşı başınızı koruyun. </font><br>" +

     "<h1><font color=red>Araç kullanıyorsanız:</font></h1>" +

            "<font color=black>&nbsp• Bulunduğunuz yer güvenli ise; yolu kapatmadan sağa yanaşıp durulmalıdır. Kontak anahtarı yerinde bırakılıp, pencereler kapalı olarak araç içerisinde beklenmelidir. Sarsıntı durduktan sonra açık alanlara gidilmelidir. <br>" +
            "&nbsp• Araç güvenli bir yerde değilse(ağaç ya da enerji hatları veya direklerinin yanında, köprü üstünde vb.); durdurulmalı, terk edilmeli ve trafikten uzak açık alanlara gidilmelidir. <br>" +
            "&nbsp• Sarsıntı sırasında bir tünelin içinde iseniz ve çıkışa yakın değilseniz; araç durdurulup aşağıya inilmeli ve yanına yan yatarak ayaklar karına çekilip, ellerle baş ve boyun korunmalıdır. <b>(ÇÖK-KAPAN-TUTUN)</b> <br>" +
            "&nbsp• Kapalı bir otoparkta iseniz; araç dışına çıkılıp, yanına yan yatarak, ellerle baş ve boyun korunmalıdır. Yukarıdan düşebilecek tavan, tünel gibi büyük kitleler aracı belki ezecek ama yok etmeyecektir. Araç içinde olduğunuz takdirde, üzerine düşen bir parça ile aracın içinde ezilebilirsiniz. </font><br>" +

    "<h1><font color=red>Metro ve Toplu taşıma içindeyseniz:</font></h1>" +

            "<font color=black>&nbsp• Gerekmedikçe, kesinlikle metro ve trenden inilmemelidir. Elektriğe kapılabilirsiniz veya diğer hattan gelen başka bir metro yada tren size çarpabilir. <br>" +
            "&nbsp• Sarsıntı bitinceye kadar metro ya da trenin içinde, sıkıca tutturulmuş askı, korkuluk veya herhangi bir yere tutunmalı, metro veya tren personeli tarafından verilen talimatlara uyulmalıdır.</font> <br>"



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.deprem2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.setText(Html.fromHtml(icerik))
    }
}

package com.example.afetBilgilendirme.yangin


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
class yangin1 : Fragment() {

    lateinit var textView: TextView
    var icerik = "<h1><font color=red>Yangın çıkmasının nedenleri</font></h1>" +
            "<font color=black>&nbsp• Yangın çıkma sebepleri<br>" +
            "&nbsp• Koruma önlemlerinin olmaması<br>" +
            "&nbsp• Sabotaj<br>" +
            "&nbsp• İhmal, dikkatsizlik<br>" +
            "&nbsp• Doğa olayları<br>" +
            "&nbsp• Yangın konusunda bilgi eksikliği<br>" +
            "&nbsp• Kazalar ve sıçramalar</font><br>" +
            "<h1><font color=red>Evlerde çıkan yangınların başlıca nedenleri</font></h1>" +
            "<font color=black>&nbsp• Isıtıcılar<br>" +
            "&nbsp• Elektrik kablolamasında hatalar, elektrik kontağı<br>" +
            "&nbsp• Ocak<br>" +
            "&nbsp• Küçük çocukların çakmak, kibrit vb. ile oynaması<br>" +
            "&nbsp• Şömine<br>" +
            "&nbsp• Sigara, kibrit ve çakmak</font><br>" +
            "<h1><font color=red>Orman Yangınlarının Nedenleri</font></h1>" +
            "<font color=black>&nbsp• İhmal ve dikkatsizlik nedeniyle çıkan orman yangınları:<br>" +
            "&nbsp• Ormanda güvenlik tedbiri alınmadan ateş yakılması<br>" +
            "&nbsp• Yakılan ateşin söndürmeden bırakılması<br>" +
            "&nbsp• Sönmemiş sigara izmariti ve kibritin yere atılması<br>" +
            "&nbsp• Orman içinde veya bitişiğindeki tarlalarda istenmeyen ot veya anızın yakılması<br>" +
            "&nbsp• Gece aydınlatma için ormanda ateşle dolaşılması<br>" +
            "&nbsp• Cam ve cam kırıklarının ormanda bırakılması<br>" +
            "&nbsp• Çocukların orman içinde ateşle oynamaları<br>" +
            "&nbsp• Kasıtlı çıkarılan orman yangınları:<br>" +
            "&nbsp• Tarla veya otlakları genişletmek için ormanın bilerek yakılması<br>" +
            "&nbsp• Orman içinde yapılan kanunsuz işleri gizlemek için yangın çıkarılması<br>" +
            "&nbsp• Birilerinden intikam almak veya bir şeyi sabote etmek için yangın çıkarılması<br>" +
            "&nbsp• Yabani hayvanları uzaklaştırmak için yangın çıkarılması.</font><br>"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?)

            : View? {
            return inflater.inflate(R.layout.yangin1, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.setText(Html.fromHtml(icerik))
    }
    }


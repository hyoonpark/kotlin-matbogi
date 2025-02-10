package com.example.wisesaying

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("웃음은 거부할 수 없다. 웃음이 올 때는 당신은 가장 아끼는 의자에 털썩 앉아 웃음고 싶은 만큼 머문다.")
        sentenceList.add("시간 엄수는 비즈니스의 영혼이다.")
        sentenceList.add("유명한 원로 과학자가 어떤 것이 가능하다고 하면 그의 말은 틀림없이 맞을 것이다. 하지만 그가 어떤 것이 불가능하다고 말한다면 그는 틀릴 확률이 높다.")
        sentenceList.add("두려움을 있는 그대로 친구로 삼기 위해서 우리는 스스로를 재교육하고 재프로그래밍해야 한다… 힘과 경각심을 선물하는 두려움으로 인해 새로운 상황에서 최선을 다하고 최대한 배울 수 있다고 끊임없이 자신을 설득해야 한다.")
        sentenceList.add("용기가 나지 않을 때 할 수 있는 가장 용기 있는 행동은 용기를 천명하고 그대로 행동하는 것이다.")
        sentenceList.add("20년 후 당신은, 했던 일보다 하지 않았던 일로 인해 더 실망할 것이다. 그러므로 돛줄을 던져라. 안전한 항구를 떠나 항해하라. 당신의 돛에 무역풍을 가득 담아라. 탐험하라. 꿈꾸라. 발견하라.")
        sentenceList.add("많은 사람이 용기가 충분했다면 겁쟁이가 되었을 것이다.")
        sentenceList.add("좋은 아이디어가 저절로 채택되지는 않는다. 용기있게 인내심을 가지고 밀어붙여 실행되도록 해야한다.")
        sentenceList.add("우리가 어떤 형태로든 '될대로 되라지!'라고 할 때 마다 무슨 일이 생긴다.")
        sentenceList.add("남에게 이기는 방법의 하나는 예의범절로 이기는 것이다.")
        sentenceList.add("우정이 바탕이 되지 않는 모든 사랑은 모래 위에 지은 집과 같다.")

        val adapter = ListViewAdapter(sentenceList)
        val listview =  findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = adapter

    }
}
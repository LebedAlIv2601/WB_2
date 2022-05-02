package com.example.wb_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.wb_2.databinding.ActivityMainBinding

/**
 * Отличия жизненного цикла фрагмента от жизненного цикла активити:
 * - Жизненный цикл фрагмента имеет больше методов, чем жизненный цикл активности.
 * - Большая часть ЖЦ фрагмента совпадает с ЖЦ активности, но добавляются еще методы, такие как
 * onCreateView, onViewCreated, onDestroyView, onAttach, onDetach.
 * Эти отличия возникли в частности из-за того, что фрагмент не может существовать независимо от
 * активности. Поэтому в его ЖЦ присутствуют такие методы, как onAttach и onDetach, которые
 * информируют о том, что фрагмент прикреплен или, наоборот, откреплен от активности. К тому же,
 * экземпляр представления пользовательского интерфейса фрагмента не создается в методе onCreate,
 * как в активности, он создается в методе onCreateView. Метод onViewCreated сообщает о том, что
 * представление пользовательского интерфейса создано, и мы можем не боясь работать с этим
 * интерфейсом.
 *
 * Умение работать с ЖЦ необходимо для грамотного построения взаимодействия пользователя и системы
 * с приложением без каких-либо проблем. С его помощью обеспечивается грамотное поведение приложения
 * при сворачивании приложения, выходе из приложения, повороте экрана, входящем звонке и тп. Так же
 * с помощью методов жизненного цикла в нужный момент можно занулить переменные, связанные с
 * разметкой во избежание утечек памяти.
 *
 * Примеры использования ЖЦ в реальных приложениях:
 * 1) При сворачивании приложения останавливается проигрывание видео(например, YouTube)
 * 2) Сохранение состояния экрана при повороте(например, VK)
 * 3) Остановка воспроизведение аудио или видео при входящем звонке(например, Яндекс.Музыка)
 */

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity lifecycle", "onCreate()")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonGoToSecondActivity?.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart() {
        Log.d("MainActivity lifecycle", "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MainActivity lifecycle", "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity lifecycle", "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d("MainActivity lifecycle", "onStop()")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("MainActivity lifecycle", "onRestart()")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("MainActivity lifecycle", "onDestroy()")
        binding = null
        super.onDestroy()
    }
}
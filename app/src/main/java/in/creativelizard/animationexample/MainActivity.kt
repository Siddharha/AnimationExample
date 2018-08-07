package `in`.creativelizard.animationexample

import android.animation.Animator
import android.net.sip.SipAudioCall
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var i:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
        onActionPerform()
    }

    private fun initialize() {
        btnItem.text = "ITEM - "+i
    }

    private fun onActionPerform() {
        btnItem.setOnClickListener { v ->
            v.animate().translationX(v.width.toFloat()).setDuration(1000).setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator?) {
                    //
                }

                override fun onAnimationRepeat(animation: Animator?) {
                    //
                }

                override fun onAnimationEnd(animation: Animator?) {
                    //
                    i++
                    btnItem.text = "ITEM - "+i
                    v.translationX = -v.width.toFloat()
                    v.clearAnimation()
                    v.animate().translationX(0f).setDuration(1000).setListener(null)
                }

                override fun onAnimationCancel(animation: Animator?) {
                    //
                }
            })

        }
    }
}

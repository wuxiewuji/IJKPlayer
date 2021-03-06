package com.tools.xxf.ijkplayer.ui.ijkplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tools.xxf.ijklib.common.MediaController
import com.tools.xxf.ijklib.common.PlayerManager
import com.tools.xxf.ijklib.media.IjkVideoView

import com.tools.xxf.ijkplayer.R
import com.tools.xxf.ijkplayer.ui.utils.Constant

/**
 * TODO: 播放器简单案例
 * @author XXF
 * Create Time : 2017/11/1 15:12
 */
class SimpleActivity : AppCompatActivity() {
    private var videoView: IjkVideoView? = null
    private var player: PlayerManager? = null
    private var mediaController: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        videoView = findViewById(R.id.video_view)

        player = PlayerManager(this, videoView)
        player?.play(Constant.url1)
        player?.start();

    }

    override fun onResume() {
        super.onResume()
        player?.onResume()
    }

    override fun onPause() {
        super.onPause()
        player?.onPause()
    }

    override fun onBackPressed() {
        player?.onBackPressed()
    }

    override fun onDestroy() {
        super.onDestroy()
        player?.onDestroy()
    }
}

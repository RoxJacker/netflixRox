package com.example.nefis

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import android.net.Uri
import android.view.View
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView

class PlayActivity : FragmentActivity() {

    companion object {
        const val MOVIE_EXTRA = "extra:movie"
    }

    private lateinit var videoView: VideoView
    private lateinit var titleTextView: TextView
    private lateinit var subtitleTextView: TextView
    private lateinit var descriptionTextView: TextView
    private var isControlsVisible = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        // Inicializar vistas
        videoView = findViewById(R.id.videoView)
        titleTextView = findViewById(R.id.videoTitle)
        subtitleTextView = findViewById(R.id.videoSubtitle)
        descriptionTextView = findViewById(R.id.videoDescription)

        // Obtener datos del video
        val video: Video? = intent.getParcelableExtra(PlayActivity.MOVIE_EXTRA)

        if (video != null) {
            // Configurar información del video
            titleTextView.text = video.title
            subtitleTextView.text = video.subtitle
            descriptionTextView.text = video.description

            // Configurar reproducción del video
            val path = "android.resource://$packageName/${video.video}"
            val uri = Uri.parse(path)

            val mediaController = MediaController(this)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)

            videoView.setVideoURI(uri)
            videoView.requestFocus()

            // Listener para cuando el video esté preparado
            videoView.setOnPreparedListener { mp ->
                // Auto-ocultar controles después de 5 segundos
                videoView.postDelayed({
                    hideControls()
                }, 5000)
            }

            // Listener para detectar cuando el usuario interactúa con el video
            videoView.setOnTouchListener { _, _ ->
                toggleControls()
                true
            }

            videoView.start()
        }
    }

    private fun toggleControls() {
        if (isControlsVisible) {
            hideControls()
        } else {
            showControls()
            // Auto-ocultar después de 5 segundos
            videoView.postDelayed({
                hideControls()
            }, 5000)
        }
    }

    private fun hideControls() {
        titleTextView.visibility = View.GONE
        subtitleTextView.visibility = View.GONE
        descriptionTextView.visibility = View.GONE
        isControlsVisible = false
    }

    private fun showControls() {
        titleTextView.visibility = View.VISIBLE
        subtitleTextView.visibility = View.VISIBLE
        descriptionTextView.visibility = View.VISIBLE
        isControlsVisible = true
    }

    override fun onPause() {
        super.onPause()
        if (::videoView.isInitialized && videoView.isPlaying) {
            videoView.pause()
        }
    }

    override fun onResume() {
        super.onResume()
        if (::videoView.isInitialized && !videoView.isPlaying) {
            videoView.start()
        }
    }
}
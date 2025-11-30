package com.example.nefis

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.OnItemViewClickedListener

class MainFragment: BrowseSupportFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title = "Netflix Pirata"

        val categories = ArrayObjectAdapter(ListRowPresenter())

        // Categoría 1: Acción
        val accionVideos = ArrayObjectAdapter(Card())
        accionVideos.addAll(0, listOf(
            Video(
                "Misión Imposible",
                "Acción · 2023",
                R.mipmap.acc1,
                "Un agente secreto debe detener una conspiración global antes de que sea demasiado tarde. Acción trepidante y efectos especiales de primer nivel.",
                R.raw.v1
            ),
            Video(
                "Persecución Extrema",
                "Acción · 2023",
                R.mipmap.acc2,
                "Una carrera contra el tiempo en las calles de una metrópolis. Explosiones, persecuciones y mucha adrenalina.",
                R.raw.v2
            ),
            Video(
                "Comando Especial",
                "Acción · 2023",
                R.mipmap.acc3,
                "Un equipo de élite es enviado a una misión suicida tras las líneas enemigas. Solo los más valientes sobrevivirán.",
                R.raw.v3
            ),
            Video(
                "Zona de Peligro",
                "Acción · 2023",
                R.mipmap.acc4,
                "En un mundo postapocalíptico, un guerrero solitario debe enfrentarse a bandas de saqueadores para proteger a los inocentes.",
                R.raw.v4
            ),
            Video(
                "Operación Rescate",
                "Acción · 2023",
                R.mipmap.acc5,
                "Un ex-militar debe rescatar a su familia de las manos de un cartel peligroso. No hay margen para el error.",
                R.raw.v5
            )
        ))
        categories.add(ListRow(HeaderItem(1, "Acción"), accionVideos))

        // Categoría 2: Comedia
        val comediaVideos = ArrayObjectAdapter(Card())
        comediaVideos.addAll(0, listOf(
            Video(
                "Risas Garantizadas",
                "Comedia · 2023",
                R.mipmap.comedia1,
                "Una comedia romántica llena de enredos y situaciones hilarantes. Te hará reír de principio a fin.",
                R.raw.v6
            ),
            Video(
                "La Oficina Loca",
                "Comedia · 2023",
                R.mipmap.comedia2,
                "El día a día en una oficina donde todo puede salir mal. Personajes excéntricos y diálogos ingeniosos.",
                R.raw.v7
            ),
            Video(
                "Vacaciones Desastrosas",
                "Comedia · 2023",
                R.mipmap.comedia3,
                "Una familia intenta disfrutar de unas vacaciones perfectas, pero todo sale mal de la manera más divertida posible.",
                R.raw.v8
            ),
            Video(
                "El Vecino Peculiar",
                "Comedia · 2023",
                R.mipmap.comedia4,
                "La llegada de un vecino extraño cambia la vida tranquila de un suburbio. Situaciones absurdas y humor inteligente.",
                R.raw.v9
            ),
            Video(
                "Fiesta Sorpresa",
                "Comedia · 2023",
                R.mipmap.comedia5,
                "Organizar la fiesta de cumpleaños perfecta se convierte en un caos total. Una comedia fresca y entretenida.",
                R.raw.v10
            )
        ))
        categories.add(ListRow(HeaderItem(2, "Comedia"), comediaVideos))

        // Categoría 3: Drama
        val dramaVideos = ArrayObjectAdapter(Card())
        dramaVideos.addAll(0, listOf(
            Video(
                "Caminos Cruzados",
                "Drama · 2023",
                R.mipmap.dra1,
                "Tres historias que se entrelazan en una ciudad grande. Un drama emotivo sobre la vida, el amor y las segundas oportunidades.",
                R.raw.v11
            ),
            Video(
                "La Última Promesa",
                "Drama · 2023",
                R.mipmap.dra2,
                "Un hombre lucha por cumplir la promesa que le hizo a su padre antes de morir. Un viaje emocional inolvidable.",
                R.raw.v12
            ),
            Video(
                "Sueños Rotos",
                "Drama · 2023",
                R.mipmap.dra3,
                "Una bailarina debe enfrentarse a una lesión que amenaza con terminar su carrera. Superación y sacrificio.",
                R.raw.v13
            ),
            Video(
                "Secretos de Familia",
                "Drama · 2023",
                R.mipmap.dra4,
                "Una familia aparentemente perfecta esconde secretos oscuros que finalmente salen a la luz.",
                R.raw.v14
            ),
            Video(
                "El Último Adiós",
                "Drama · 2023",
                R.mipmap.dra5,
                "Una historia conmovedora sobre la despedida, el perdón y la reconciliación. Actuaciones memorables.",
                R.raw.v15
            )
        ))
        categories.add(ListRow(HeaderItem(3, "Drama"), dramaVideos))

        // Categoría 4: Ciencia Ficción
        val sciFiVideos = ArrayObjectAdapter(Card())
        sciFiVideos.addAll(0, listOf(
            Video(
                "Galaxia Perdida",
                "Ciencia Ficción · 2023",
                R.mipmap.cifi1,
                "Una nave espacial debe encontrar su camino de regreso a casa después de un salto hiperespacial fallido. Aventura cósmica épica.",
                R.raw.v16
            ),
            Video(
                "Inteligencia Artificial",
                "Ciencia Ficción · 2023",
                R.mipmap.cifi2,
                "En un futuro cercano, las IA desarrollan conciencia propia. Una reflexión sobre la humanidad y la tecnología.",
                R.raw.v17
            ),
            Video(
                "Crononautas",
                "Ciencia Ficción · 2023",
                R.mipmap.cifi3,
                "Un grupo de científicos viaja al pasado para evitar una catástrofe. Pero cambiar el tiempo tiene consecuencias.",
                R.raw.v18
            ),
            Video(
                "Planeta Desconocido",
                "Ciencia Ficción · 2023",
                R.mipmap.cifi4,
                "Los primeros colonos humanos llegan a un planeta alienígena lleno de misterios y peligros desconocidos.",
                R.raw.v19
            ),
            Video(
                "Revolución Cibernética",
                "Ciencia Ficción · 2023",
                R.mipmap.cifi5,
                "En un mundo donde la realidad virtual es más real que la vida misma, un hacker descubre la verdad oculta.",
                R.raw.v20
            )
        ))
        categories.add(ListRow(HeaderItem(4, "Ciencia Ficción"), sciFiVideos))

        // Categoría 5: Terror
        val terrorVideos = ArrayObjectAdapter(Card())
        terrorVideos.addAll(0, listOf(
            Video(
                "La Casa Maldita",
                "Terror · 2023",
                R.mipmap.terror1,
                "Una familia se muda a una casa antigua sin saber que está habitada por espíritus vengativos. Sustos garantizados.",
                R.raw.v21
            ),
            Video(
                "Pesadillas Nocturnas",
                "Terror · 2023",
                R.mipmap.terror2,
                "Lo que comienza como sueños extraños se convierte en una pesadilla de la que no se puede despertar.",
                R.raw.v22
            ),
            Video(
                "El Ritual",
                "Terror · 2023",
                R.mipmap.terror3,
                "Un grupo de amigos descubre un antiguo ritual en el bosque. Invocar fuerzas oscuras fue un grave error.",
                R.raw.v23
            ),
            Video(
                "Sonidos en la Oscuridad",
                "Terror · 2023",
                R.mipmap.terror4,
                "Una familia sorda debe sobrevivir a una entidad que caza por el sonido. Terror psicológico intenso.",
                R.raw.v24
            ),
            Video(
                "El Último Exorcismo",
                "Terror · 2023",
                R.mipmap.terror5,
                "Un sacerdote enfrenta su caso de posesión más difícil. Basada en hechos reales que te dejarán sin aliento.",
                R.raw.v25
            )
        ))
        categories.add(ListRow(HeaderItem(5, "Terror"), terrorVideos))

        adapter = categories

        onItemViewClickedListener = OnItemViewClickedListener { _, video, _, _ ->
            val intent = Intent(requireContext(), PlayActivity::class.java).apply {
                putExtra(PlayActivity.MOVIE_EXTRA, video as Video)
            }
            startActivity(intent)
        }
    }
}
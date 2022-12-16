package com.example.moviecatalog

import com.example.moviecatalog.models.DataPattern

class DataSource {
    companion object {
        fun mockUpData(): ArrayList<DataPattern> {

            val listMovies = ArrayList<DataPattern>()

            listMovies.add(
                DataPattern(
                    "Blade Runner",
                    "Sci-Fi",
                    "1982",
                    R.drawable.blade,
                    SecondScreen()
                )
            )
            listMovies.add(
                DataPattern(
                    "300",
                    "Action, War",
                    "2006",
                    R.drawable.esparta,
                    SecondScreen()
                )
            )
            listMovies.add(
                DataPattern(
                    "Gangs of New York",
                    "Crime, Drama",
                    "2002",
                    R.drawable.gangs,
                    SecondScreen()
                )
            )
            listMovies.add(
                DataPattern(
                    "The Last Samurai",
                    "Action, War",
                    "2003",
                    R.drawable.samurai,
                    SecondScreen()
                )
            )
            return listMovies
        }
    }
}


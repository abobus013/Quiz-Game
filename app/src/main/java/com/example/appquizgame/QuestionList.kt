package com.example.quizgame

import com.example.appquizgame.R

object QuestionList {

    fun getQuestions(): MutableList<Question> {
        val list = mutableListOf<Question>()
        list.add(
            Question(
                0,
                1,
                "Сколько океанов в мире?",
                "3 океанов" ,
                "5 океанов",
                "2 океанов",
                "6 океанов",
                R.drawable.earth,
                2
            )
        )

        list.add(
            Question(
               1,
                2,
               "Какой герой мультфильма живет в ананасе под водой?",
                "Немо",
                "Губка Боб",
                "Рик и Морти",
                "Мистер Крабс",
                R.drawable.question,
                2
            )
        )

        list.add(
            Question(
                2,
                3,
                "Как называется колокол часов Вестмисторского двордца в Лондоне?",
                "Броненосец",
                "Мумия",
                "Калабаш",
                "Биг Бен",
                R.drawable.question,
                4
            )
        )

        list.add(
            Question(
                3,
                4,
                "В какой стране находится Прага?",
                "Англия",
                "Бразилия",
                "Чехия",
                "Испания",
                R.drawable.earth,
                3
            )
        )

        list.add(
            Question(
                4,
                5,
                "Какая служба электронной почты принадлежит компании Microsoft?",
                "Outlook",
                "Gmail",
                "Yahoo mail",
                "iCloud",
                R.drawable.email,
                1
            )
        )

        return list
    }
}
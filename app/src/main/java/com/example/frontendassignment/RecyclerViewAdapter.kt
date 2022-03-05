package com.example.frontendassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val itemQuesProfile = intArrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user16,
        R.drawable.user15,
        R.drawable.user14,
        R.drawable.user13,
        R.drawable.user12,
        R.drawable.user11,
    )

    private val itemAnsProfile = intArrayOf(
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user10,
        R.drawable.user9,
        R.drawable.user8,
        R.drawable.user7,
        R.drawable.user6,
        R.drawable.user5,
    )

    private val QuesName = arrayOf(
        "Mohit Kumar",
        "Peterson Jacob",
        "Sandy Mandor",
        "Abhijeet Walia",
        "Meghna Sharma",
        "Josiphene Holie",
        "Ramesh Kumar",
        "Madiline David"
    )

    private val AnsName = arrayOf(
        "Riddhima Thakur",
        "Anjelia Mandy",
        "Julia British",
        "Smith Warner",
        "Peter Washington",
        "Abdullah Ahmad",
        "Iqbal Khan",
        "Sir David Boshe"
    )

    private val QueLocation = arrayOf(
        "Mumbai", "Kolkata", "New Delhi", "Lucknow", "Tamil Nadu", "New Delhi", "New Delhi",
        "Hyderabad"
    )

    private val QueTime = arrayOf(
        "3 days ago",
        "1 week ago",
        "2 hours ago",
        "1 day ago",
        "13 hours ago",
        "4 hours ago",
        "2 days ago",
        "1 day ago"
    )

    private val AnsTime = arrayOf(
        "1 day ago",
        "4 hours ago",
        "30 mins ago",
        "12 hours ago",
        "4 hours ago",
        "1 hour ago",
        "1 day ago",
        "14 hours ago"
    )

    private val Questions = arrayOf(
        "Who is the richest man in the whole world as of now?",
        "What is the best place to eat Kebabs in Lucknow? ",
        "Which is the India's largest city by population?",
        "What is the best architectural building in New Delhi which is opened during the month of December and is near to Hauz Khas Metro Startion?",
        "What is the best online place for the preparation of JEE Mains Exam?",
        "The Olympic torch is a tribute to the fire that burned throughout the ancient Greek Olympic games honoring which goddess?",
        "How many countries boycotted the 1980 Moscow Olympics?",
        "The only event in the first-known ancient Greek Olympics was a footrace of what length?",
        "Wrestlers covered their bodies in what in the ancient Greek Olympics?"
    )

    private val Answers = arrayOf(
        "Elon Musk"
        "Tunde Kebab",
        "Mumbai",
        "It is Red Fort and you can also visit Jama Masjid",
        "You can study at places like Byju's and Unacademy",
        "Hestia",
        "66",
        "192 meters",
        "Oil"
    )

    private val numOfAnswers = arrayOf(
        "3 Answers",
        "1 Answer",
        "4 Answers",
        "2 Answers",
        "1 Answer",
        "2 Answers",
        "1 Answer",
        "2 Answers"
    )


    inner class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        //User asking Question
        var ivQuesProfile: ImageView
        var tvQuesName: TextView
        var tvQuesLocation: TextView
        var tvQuesTime: TextView
        var tvQuestion: TextView

        //User giving Answers
        var ivAnsProfile: ImageView
        var tvAnsName: TextView

        var tvAnswTime: TextView
        var tvAnswer: TextView

        var numOfAnswers: TextView

        init {
            ivQuesProfile = itemview.findViewById(R.id.ivQueProfile)
            tvQuesName = itemView.findViewById(R.id.tvQueName)
            tvQuesLocation = itemview.findViewById(R.id.tvQueLocation)
            tvQuesTime = itemview.findViewById(R.id.tvQueTime)
            tvQuestion = itemView.findViewById(R.id.tvQuestion)

            ivAnsProfile = itemView.findViewById(R.id.ivAnsProfile)
            tvAnsName = itemView.findViewById(R.id.tvAnsName)
            tvAnswer = itemView.findViewById(R.id.tvAnsName)
            tvAnswTime = itemview.findViewById(R.id.tvAnsTime)
            numOfAnswers = itemView.findViewById(R.id.tvNoOfAnswers)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_model, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvQuesName.text = QuesName[position]
        holder.tvQuesLocation.text = QueLocation[position]
        holder.tvQuesTime.text = QueTime[position]
        holder.tvQuestion.text = Questions[position]
        holder.ivQuesProfile.setImageResource(itemQuesProfile[position])

        holder.ivAnsProfile.setImageResource(itemAnsProfile[position])
        holder.tvAnsName.text = AnsName[position]
        holder.tvAnswer.text = Answers[position]
        holder.tvAnswTime.text = AnsTime[position]


        holder.itemView.setOnClickListener { v->
            Toast.makeText(v.context, "Clicked the item", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return itemQuesProfile.size
    }

}
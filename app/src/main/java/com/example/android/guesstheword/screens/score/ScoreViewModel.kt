package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _eventPlayagain = MutableLiveData<Boolean>()
    val eventPlayagain : LiveData<Boolean>
        get() = _eventPlayagain

    private val _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    init {
        Log.i("ScoreViewModel", "Final Score is $finalScore")
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _eventPlayagain.value = true
    }

    fun onPlayAgainComplete() {
        _eventPlayagain.value = false
    }

}
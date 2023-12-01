package com.dicoding.habitapp.ui.random

import androidx.lifecycle.*
import com.dicoding.habitapp.data.Habit
import com.dicoding.habitapp.data.HabitRepository

//class RandomHabitViewModel (habitRepository: HabitRepository) : ViewModel() {
//    val priorityLevelHigh: LiveData<Habit> = habitRepository.getRandomHabitByPriorityLevel("High")
//    val priorityLevelMedium: LiveData<Habit> = habitRepository.getRandomHabitByPriorityLevel("Medium")
//    val priorityLevelLow: LiveData<Habit> = habitRepository.getRandomHabitByPriorityLevel("Low")
//}

class RandomHabitViewModel(habitRepository: HabitRepository) : ViewModel() {
    val priorityLevelHigh: LiveData<Habit?> = habitRepository.getRandomHabitByPriorityLevel("High") as LiveData<Habit?>
    val priorityLevelMedium: LiveData<Habit?> = habitRepository.getRandomHabitByPriorityLevel("Medium") as LiveData<Habit?>
    val priorityLevelLow: LiveData<Habit?> = habitRepository.getRandomHabitByPriorityLevel("Low") as LiveData<Habit?>
}


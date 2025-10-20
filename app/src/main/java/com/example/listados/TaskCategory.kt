package com.example.listados;

sealed class TaskCategory{
    object Futbol : TaskCategory()
    object Tennis : TaskCategory()
    object Rugby : TaskCategory()
    object Other : TaskCategory()
}
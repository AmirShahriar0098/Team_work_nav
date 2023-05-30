package com.example.teamwork_shrk

interface Destinations
{
    val route : String
}

object Home : Destinations
{
    override val route: String = "Home"
}

object Second : Destinations
{
    override val route: String = "Second"
}
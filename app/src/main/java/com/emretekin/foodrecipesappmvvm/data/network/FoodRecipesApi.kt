package com.emretekin.foodrecipesappmvvm.data.network

import com.emretekin.foodrecipesappmvvm.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET

interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    fun getRecipes(): Response<FoodRecipe> //TODO add queries

}
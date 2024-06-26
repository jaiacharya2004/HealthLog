package com.example.healthlog.core

import androidx.navigation.NavHostController



// Class which handles app navigation
class NavigationManager(private val navController: NavHostController) {

    fun navigateToLogin() {
        navController.navigate(Screen.Login.route)
        navController.popBackStack(Screen.Login.route, inclusive = true)

    }

    fun navigateToSignup() {
        navController.popBackStack(Screen.Signup.route, inclusive = false)
        navController.navigate(Screen.Signup.route)
    }



    fun navigateToEmailInput() {
        navController.popBackStack(Screen.EmailInput.route, inclusive = false)
        navController.navigate(Screen.EmailInput.route)
    }

    fun navigateToFeatureScreen(){
        navController.popBackStack(Screen.FeatureScreen.route, inclusive = false)
        navController.navigate(Screen.FeatureScreen.route)
    }

    fun navigateToHomeScreen(){
        navController.navigate(Screen.HomeScreen.route)
        navController.popBackStack(Screen.HomeScreen.route, inclusive = false)

    }

    fun navigateToInterestsScreen(){
        navController.navigate(Screen.InterestsScreen.route)
        navController.popBackStack(Screen.InterestsScreen.route, inclusive = false)

    }

    fun navigateToBackStack(){
        navController.popBackStack()
    }

    fun navigateToNewVaccineScreen(){
        navController.navigate(Screen.NewVaccineScreen.route)
        navController.popBackStack(Screen.NewVaccineScreen.route, inclusive = false)
    }

    fun navigateToAllergyScreen(){
        navController.navigate(Screen.AllergyScreen.route)
        navController.popBackStack(Screen.AllergyScreen.route, inclusive = false)
    }

    fun navigateToOxygenScreen(){
        navController.navigate(Screen.OxygenScreen.route)
        navController.popBackStack(Screen.OxygenScreen.route, inclusive = false)
    }

    fun navigateToBloodPressureScreen(){
        navController.navigate(Screen.BloodPressureScreen.route)
        navController.popBackStack(Screen.BloodPressureScreen.route, inclusive = false)
    }
}
package com.example.tip_curator

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CalculatorTests {
//    launching the MainActivity using ActivityScenarioRule
    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

//    test logic
    @Test
    fun calculate_20_percent_tip(){

    }
}
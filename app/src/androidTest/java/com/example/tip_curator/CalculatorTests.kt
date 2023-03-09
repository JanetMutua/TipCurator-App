package com.example.tip_curator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.containsString
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

//    test logic
        onView(withId(R.id.cost_of_service_edit_text))
            .perform(typeText("50.00"))
            .perform(ViewActions.closeSoftKeyboard())

//    clicking the Calculate button

        onView(withId(R.id.calculate_button))
            .perform(click())

//    creating an assertion that the correct tip is displayed

        onView(withId(R.id.tip_result))
            .check(matches(withText(containsString("$10.00"))))
    }
}
package com.example.customtestapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public  class ClickButtonInstrumentedTest{

    //Launch the main activity
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

//Test that the text is displayed in the MainActivity
    @Test
    public void testMainActivityShowsText(){

        onView(withId(R.id.pageOnetTitle)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(withId(R.id.pageOneButton)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

    }


    //test the button clicks
    @Test
    public void testClickButton(){
        //find the button id

        onView(withId(R.id.pageOneButton)).perform(ViewActions.click());
        //check that the new activity is showing
        onView(withId(R.id.add_numbers_activity)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

    }


}
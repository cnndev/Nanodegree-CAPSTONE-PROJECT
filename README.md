I-Transmit
======

This is the Capstone Project of Udacity's Android Developer Nanodegree.

iTransmit helps you organize your business and personal trips by recording your expenses, budget and the places you want to visit.    
• Record travel expenses: Add new expenses with a press of a button, using the app or the home screen widget. Select the currency, the date, the category and add photos to an expense.  
• Stop overspending: Create different budgets for each currency or category. It automatically converts it to your home country currency.  
• Manage your itinerary: Never get lost again! Add places you want to visit for each trip and easily get directions to it.  
• Never lost your data again: All your trip data is securely saved in the cloud


Features 
======
● Store travel expenses with currency, image and location data  
● Create individual budgets for each currency  
● Create and manage multiple trips  
● Automatically converts expenses to home country currency  
● Create a travel itinerary and get directions to places when needed  


Instructions
======

1. Create a Firebase project and add a new app with the following package name: `com.chihurumnanya.itransmit`.
2. Enable Firebase Authentication with e-mail and Google account sign-in.
3. Create a Realtime Database and set the rules in the section below.
4. Download your `google-services.json` file and put it inside the app folder.
5. Go to your Google API console and enable Google Maps and Places API for Android.
6. Put the API Key on your user's `gradle.properties` file: `google_geo_api_manifest_key=<API_KEY>`.
7. You are good to go now.

Firebase Realtime Database rules
======

```
{
  "rules": {
    "trips": {
      "$uid": {
        ".read": "$uid === auth.uid",
        ".write": "$uid === auth.uid"
      }
    },
    "attributions": {
      "$uid": {
        ".read": "$uid === auth.uid",
        ".write": "$uid === auth.uid"
      }
    },
    "expenses": {
      "$uid": {
        ".read": "$uid === auth.uid",
        ".write": "$uid === auth.uid"
      }
    },
    "budgets": {
      "$uid": {
        ".read": "$uid === auth.uid",
        ".write": "$uid === auth.uid"
      }
    },
    "places": {
      "$uid": {
        ".read": "$uid === auth.uid",
        ".write": "$uid === auth.uid"
      }
    }
  }
}
```

Google Map Api 
======
google_geo_api_manifest_key=<AIzaSyCNtvJ_tuYlyJKPBxeKIjBFlV31i0Tn0lU>

License
------

> Copyright 2017 Chihurumnanya Nwanevu

> Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

> http://www.apache.org/licenses/LICENSE-2.0

> Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

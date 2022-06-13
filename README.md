# QuizApp
In this app which is made of android where there are 10 questions which has 4 options - one correct. This app includes ---

First at starting screen user has to type his/her name (otherwise it shows message "Please Enter Your Name") then only they can enter to the home screen where there are two option quiz and news.
In quiz section , Users should see questions one by one like some general knowledge questions, images and give them 4 options.
When user selects an Incorrect option, that options becomes red and correct option shows up in green and there is message "Sorry, This is Wrong Answer :(" and change the question.
When user selects a correct option ,that option becomes green and show a message "Bravo Right Answer :)" and move on the next question.
When user has made the 10 attempts, show them their score.
In news section , user can see latest news which I called using news API.
When clicked to certain news , that news will open where it is published in that screen only.
In this app I have integrate Requestly Android Debugger , which make easy for me to debug API traffic.
We can integrate this debugger in very easy steps -

We have to first copy
dependencies {
debugImplementation "io.requestly.rqinterceptor:library:1.+"
releaseImplementation "io.requestly.rqinterceptor:library-no-op:1.+"
} in our build.gradle

Then we have to add requestly interceptor in our okhttp/Retrofit Client which includes following code -
val collector = RQCollector(context=appContext, sdkKey=" ")
val rqInterceptor = RQInterceptor.Builder(appContext).collector(collector).build()
val client = OkHttpClient.Builder().addInterceptor(rqInterceptor).build()

Then we can test integration and see how our app runs and its processes.

This app is made using android

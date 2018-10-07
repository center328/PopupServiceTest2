# PopupServiceTest2
به نام خدا


برای استفاده از ماژول PopupService ابتدا می بایست فایل aar را به پروژه خود ضمیمه نمایید. بدین منظور می توانید از لینک زیر استفاده نمایید.  Help Link

اطلاعات لازم برای استفاده از فایل aar:

این ماژول از تنظیمات زیر بهره گرفته است.
compiler     minSdkVersion 19     targetSdkVersion 28

برای استفاده از این ماژول نیازمند پیش نیاز های زیر است:
dependencies     implementation 'com.android.support:appcompat-v7:28.0.0'     implementation 'com.android.support:design:28.0.0'

برای استفاده از این ماژول نیازمند به دسترسی های زیر است:
 <uses-permission android:name="android.permission.INTERNET" /> <uses-permission android:name="android.permission.READ_SMS" /> <uses-permission android:name="android.permission.RECEIVE_SMS" /> <uses-permission android:name="android.permission.SEND_SMS" />

برای راه اندازی ماژول در پروژه باید در فایل Application و در تابع onCreate دستور زیر اجرا گردد.
PopUpService.getInstance(this);

or …

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//      ...
        PopUpService.getInstance(this);
//      ..   
    }
}
سپس می بایست کارهای لازم برای استفاده از CloudMessaging مربوط به سرویس FireBase را در پروژه خود راه اندازی نمایید و در کلاس MyFirebaseMessagingService دستورات زیر را جایگذاری نمایید.

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage != null)
PopUpService.getInstance(getApplication()).checkPushNotificationMessage(remoteMessage.getData());
//      ...
    }
}
شمای داده ای لازم برای ارسال پیام در Firebase:

نام داده ها در زیر آمده است:

page1_img_url
page1_text
page2_text
pages_button_text
sms_head_number
sms_text

تصویر لازم برای درک بهتر:



برای راحتی کار شما کد نمونه به صورت پروژه Test2 در فایلی زیپی با همین نام در اختیار شما قرار گرفته است.

لینک پروژه
لینک فایل aar


با تشکر
مهدی آرزومندی

نسخه ۱

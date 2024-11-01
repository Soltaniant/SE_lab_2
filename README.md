# پیام‌رسان قزمیت

## گام اول: افزودن یک روش پیام رسانی دیگر
<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>EmailMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage و بدنه خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>SMSMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage و بدنه خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن توابع ارسال پیام‌های تلگرامی، SMS و ایمیل</p>
</td>
<td width="292">
<p>افزودن توابع void‌ sendSmsMessage و sendEmailMessage با بدنه خالی و sendTelegramMessage برای ارسال پیام تلگرامی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع صحت سنجی شماره تلفن</p>
</td>
<td width="292">
<p>افزودن تابع boolean با عنوان validatePhoneNumber</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن متغیر شماره تلفن مبدا</p>
</td>
<td width="292">
<p>افزودن متغیر string با عنوان sourcePhoneNumber</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن متغیر شماره تلفن مقصد</p>
</td>
<td width="292">
<p>افزودن متغیر string با عنوان targetPhoneNumber</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع برای دریافت شماره تلفن مبدا</p>
</td>
<td width="292">
<p>افزودن تابع string باعنوان getSourcePhoneNumber</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۹</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع برای تنظیم شماره تلفن مبدا</p>
</td>
<td width="292">
<p>افزودن تابع void باعنوان setSourcePhoneNumber</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۰</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع برای دریافت شماره تلفن مقصد</p>
</td>
<td width="292">
<p>افزودن تابع string باعنوان getTargetPhoneNumber</p>
</td>
</tr>


<tr>
<td width="64">
<p><strong>۱۱</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع برای تنظیم شماره تلفن مقصد</p>
</td>
<td width="292">
<p>افزودن تابع void باعنوان setTargetPhoneNumber</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۲</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن خطی برای نشان دادن انتخاب گزینه Telegram message</p>
</td>
<td width="292">
<p>افزودن System.out.println("In order to send Telegram message enter 3");</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۳</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن گزینه ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک case به Switchcase برای ساخت object TelegramMessage و دریافت اطلاعات لازم</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۴</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن چند خط برای چک کردن نوع پیام </p>
</td>
<td width="292">
<p>افزودن یک else if‌ برای چک کردن instance message</p>
</td>
</tr>


</tbody>
</table>

مجموع تعداد تغییرات: ۱۴ تغییر
## گام دوم: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول 

###  راهکار رفع هر یک از نقض‌ها 

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation</p>
</td>
<td width="246">
سرویس‌ها نیازمندی پیاده‌سازی متود‌هایی از واسط MessageService هستند که در واقع نیازی به آن‌ها نیست و بدنه آن‌ها خالی رها شده است.</p>
</td>
<td width="284">
<p>یک متود sendMessage به صورت جامع در واسط MessageService تعریف شود که وظیفه ارسال پیام (Message) را داراست. سپس هر یک از فرزندان سرویس این متود را به دلخواه خودشان پیاده‌سازی کنند.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Open-Close Principle</p>
</td>
<td width="246">
<p>به ازای اضافه کردن یک  نوع جدید از پیام لازم است MessageService و نیز سوییچ‌های Main بروزرسانی شوند. در نتیجه تغییر واسط MessageService تمامی دیگر پیاده‌سازی‌های آن نیز باید بروز شوند و متود جدید را با بدنه خالی پیاده کنند.</p>
</td>
<td width="284">
<p>لازم است پیام‌ها از یک واسط مشترک استفاده کنند و توابع مورد نیاز را هر یک به شیوه مناسب خود پیاده‌سازی کنند. در این حالت واسط ارسال پیام می‌تواند متود sendMessage را به گونه‌ای جامع تعریف کند تا قابلیت ارسال هرگونه پیام را داشته باشد. کافیست در ادامه هر نوع پیام جدیدی که به سیستم اضافه می‌شود واسط Message را پیاده‌سازی کند. در این صورت نیازی به تغییر در دیگر کلاس‌ها نمی‌باشد. (البته که در این میان برخی از کلاس‌های خاص که در پروژه ما به معنایی وظیفه inject کردن instance ها را دارند قاعدتا دستخوش تغییر می‌شود، اما این تغییرات متفاوت از تغییرات مورد نظر ما در OCP است)</p>
</td>
</tr>
<tr>
<td width="168">
<p>Liskov Substitution Principle</p>
</td>
<td width="246">
<p>شاید عدم رعالت این اصل را بتوان در همان مشکلات ناشی از ISP مشاهده کرد. به این صورت که اگرچه هر شیوه‌پیام‌رسانی خود یک فرزند از MessageService است اما توابع، یا به عبارت بهتر رفتار‌های مورد انتظار این کلاس لزوما در فرزندان قابل رویت نیست.</p>
</td>
<td width="284">
<p>مطابق پیشنهاد ارائه شده در ISP عمل کنیم. کلاس Message به عنوان پدر انواع پیام‌ها تعریف شود و سپس واسط MessageService تابع ارسال پیام‌ را به صورت کلی تعریف کند تا هر سرویس به طور مجزا برای خودش پیاده‌سازی این رفتار را انجام دهد. در این صورت با رابطه is-A میان تمامی پدر و فرزندان به صورت معتبر وجود خواهد داشت.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Single Responsibility Principle</p>
</td>
<td width="246">
<p>مطابق صورت سوال قرار نیست در این مورد مشکلی را گزارش کنیم، اما به عنوان نمونه
می‌توان به وجود سوییچ در کلاس Main اشاره کرد. همچنین مواردی از قبیل نوشتن در کنسول نیز از نمونه‌های نقض اصل SRP است.</p>
</td>
<td width="284">
<p>ساخت پیام و سرویس پیام بر عهده AbstractFactory باشد. این الگو از تولید سوییچ‌های متعدد برای مصارف مختلف نیز جلو‌گیری خواهد کرد. در این حالت یک کلاس مشخص به عنوان factory وظیفه ساخت instance ها را برعهده می‌گیرد.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Dependency Inversion Principle</p>
</td>
<td width="246">
<p>رعایت این اصل پیش‌نیاز رعایت OCP بوده است که پیشتر نمونه‌های نقض آشکار آن‌را بیان داشتیم. به وضوح می‌توان در پروژه، استفاده‌های متعدد از کلاس‌های concrete را مشاهده کرد، در حالیکه می‌بایست تا حد امکان از واسط‌ها به این منظور استفاده می‌شد.</p>
</td>
<td width="284">
<p>راه‌حل‌هایی که در قسمت‌های قبلی بیان کردیم تا حد زیادی این مسئله را حل کرده‌اند. به این صورت که در حالت جدید، ما به طور کلی فقط با واسط Message به عنوان پیام و نیز با MessageService به عنوان واسط پیام‌رسانی سر و کار داریم (همچنین این اصل درمورد AbstractFactory نیز رعایت شده است). در نتیجه ما وابستگی‌ای میان اجزای concrete ایجاد نکرده‌ایم و وابستگی‌ها از طریق interface ها ایجاد شده‌اند.</p>
</td>
</tr>
</tbody>
</table>

## گام سوم: اصلاح موارد نقض 

##  گام چهارم: بررسی مجدد تغییرات مورد نیاز
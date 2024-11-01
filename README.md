# پیام‌رسان

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

<table dir='rtl'>
  <tbody>
    <tr>
      <td rowspan="2" width="240"><p>اصل 1</p><p>Single Responsibility</p></td>
      <td width="95"><p><strong>موارد تحقق</strong></p></td>
      <td width="454"><p>افزودن کلاس‌های جداگانه برای سرویس‌های پیام‌رسانی (EmailMessageService، SMSMessageService، TelegramMessageService) به منظور رعایت مسئولیت واحد هر کلاس.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>واسط MessageService بیش از یک دلیل برای تغییر دارد. همچنین کلاس Main وظایف متعددی را بر عهده دارد.
      </p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 2</p><p>Open-Close Principle (OCP)</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>کلاس TelegramMessageService: اضافه کردن یک کلاس جدید برای ارسال پیام تلگرامی بدون تغییر در کلاس‌های دیگر.<br>Main: استفاده از الگوی Factory برای ایجاد سرویس‌های مختلف پیام‌رسانی که به گسترش بدون تغییر کد کمک می‌کند.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>افزودن سرویس پیام رسانی جدید سبب تغییر در واسط MessageService و تمام پیاده سازی های دیگر شد.</p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 3</p><p>Liskov Substitution Principle</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>رابطه بین واسط MessageService و دیگر پیام ها از همین نوع پیام هستند.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>واسط MessageService رفتارهای اضافی به فرزندان خود سرایت کرده و بدنه ها خالی است</p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 4</p><p>Interface Segregation Principle</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>واسط MessageService تفکیک متدها به واسط‌های جداگانه برای سرویس‌های مختلف (validatePhoneNumber برای تلگرام) باعث می‌شود که کلاس‌ها تنها متدهایی را پیاده‌سازی کنند.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>واسط MessageService شامل متدهایی باشد که همه سرویس‌ها به آن نیاز نداشته باشند، این اصل نقض می‌شود. در این صورت باید واسط‌ها را کوچک‌تر و تخصصی‌تر کنیم.</p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 5</p><p>Dependency Inversion Principle</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>کلاس Main: وابستگی‌های High-level module به واسط MessageService بجای کلاس‌های خاص (EmailMessageService، SMSMessageService) باعث می‌شود که وابستگی‌ها به صورت معکوس و بر اساس Abstraction باشند.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>کلاس Main به طور مستقیم به کلاس‌های خاص سرویس پیام‌رسانی وابسته باشد، این اصل نقض می‌شود. باید از تزریق وابستگی یا الگوهایی مانند Factory استفاده کرد تا وابستگی‌ها به واسط‌ها باشند.</p></td>
    </tr>
  </tbody>
</table>

### راهکار رفع هر یک از نقض‌ها

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
<p>
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

مواردی که دربالا بیان شد همه در قالب کد نیز پیاده‌سازی و عملیاتی شد. همچنین از یک Enum برای مشخص کردن نوع پیام‌ استفاده شد. چنانچه پیام جدیدی به سیستم اضافه شود لازم است این قسمت نیز بروز شود.

## گام چهارم: بررسی مجدد تغییرات مورد نیاز

با انجام اصلاحات بیان‌شده چنانچه بخواهیم پیام جدیدی را به سیستم اضافه کنیم کافیست کلاس جدید پیام را به عنوان فرزند واسط Message بسازیم و نیز سرویس پیام‌رسانی آن را بر اساس واسط MessageService اضافه کنیم.
تا به اینجا تغییری در کد‌های موجود انجام نشده است و فقط به آن افزوده‌‌ایم. در ادامه اما لازم است کلاس MessageFactroyImpl را گسترش دهیم تا به ازای MessageType جدیدمان، سرویس و پیام مورد نظر را تولید کند.
طبیعی است برخی متون ui نیز نیازمند تغییر هستند.

در نهایت تغییرات زیر بایستی داده شود:

1. ساخت پیام جدید
2. ساخت سرویس پیام‌رسانی جدید
3. افزودن MessageType
4. تغییر MessageFacoryImpl
5. تغییرات متون ui

در نتیجه ۵ تغییر مورد نیاز است و تغییرات ۱، ۲، ۳، ۴، ۵، ۱۳ و ۱۴ نیاز نخواهد بود.

## گام پنجم: جمع‌بندی

رعایت اصول شی‌گرایی سبب شد که تعداد تغییرات بخش‌های مختلف کد به حداقل برسد و بخش کمی از کد موجود دستخوش تغییر شود. همچنین رعایت هر یک از اصول برنامه‌نویسی به نوعی به رعایت دیگر اصول کمک می‌کند تا در نهایت کد‌ها خوانا‌تر و تمیز‌تر نیز بشوند. در این صورت خواندن، فهم و ویرایش پروژه ساده‌تر خواهد بود. درنتیجه، هزینه توسعه و نگه‌داری آن کمتر خواهد بود.

## پاسخ به سوالات

<table dir='rtl'>
  <tbody>
    <tr>
      <td><p><strong>سوال اول</strong></p></td>
      <td><p>اگر اصول شی گرایی از ابتدا برقرار بود و شما سرویس جدید را به پروژه اضافه می‌کردید، چند مورد از تغییرات ثبت شده در جدول مرحله دوم حذف می‌شد؟ و در نهایت با چند تغییر در سطح کد، این سرویس اضافه می‌شد؟ (عدد آن را حتما اعلام کنید)</p></td>
    </tr>
    <tr>
      <td><p><strong>پاسخ</strong></p></td>
      <td>
        <p>اگر اصول شی گرایی از ابتدا برقرار بود، بسیاری از تغییرات ثبت شده در جدول مرحله دوم حذف می‌شد. با در نظر گرفتن اصول SOLID:</p>
        <p><strong>موارد تحقق:</strong></p>
        <ul>
          <li>ایجاد کلاس‌های جدید و جداگانه برای سرویس‌های مختلف (مثل TelegramMessageService) بدون نیاز به تغییر در کلاس‌های موجود.</li>
          <li>استفاده از الگوی Factory برای مدیریت سرویس‌های مختلف.</li>
        </ul>
        <p><strong>تعداد تغییرات حذف شده:</strong></p>
        <p>اکثر تغییرات مربوط به اضافه کردن متدهای جدید در کلاس‌های موجود، حذف می‌شد. به طور دقیق، از ۱۴ تغییر ثبت شده، حداقل ۸ تغییر حذف می‌شد.</p>
        <p><strong>تعداد تغییرات جدید:</strong></p>
        <p>تنها با اضافه کردن ۶ تغییر، این سرویس جدید اضافه می‌شد:
          <ul>
            <li>ایجاد کلاس TelegramMessageService</li>
            <li>پیاده‌سازی متد validatePhoneNumber</li>
            <li>پیاده‌سازی متد sendTelegramMessage</li>
            <li>ایجاد متغیرهای sourcePhoneNumber و targetPhoneNumber</li>
            <li>افزودن توابع getter و setter برای متغیرها</li>
          </ul>
        </p>
      </td>
    </tr>
    <tr>
      <td><p><strong>سوال دوم</strong></p></td>
      <td><p>با توجه به آنچه که انجام دادید، در دو خط توضیح دهید که رعایت اصول شی گرایی، چه مزایایی را برای پروژه شما فراهم می‌کند؟</p></td>
    </tr>
    <tr>
      <td><p><strong>پاسخ</strong></p></td>
      <td>
        <p>رعایت اصول شی‌گرایی باعث می‌شود کدها خواناتر، قابل نگهداری و توسعه‌پذیرتر باشند. همچنین، امکان اضافه کردن ویژگی‌های جدید بدون تغییر در کدهای موجود و کاهش احتمال بروز خطاهای جدید را فراهم می‌کند.</p>
      </td>
    </tr>
  </tbody>
</table>

Messenger

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

Part 3 SOLID PRINCIPLES TABLE

<table dir='rtl'>
  <tbody>
    <tr>
      <td rowspan="2" width="240"><p>اصل 1</p><p>Single Responsibility</p></td>
      <td width="95"><p><strong>موارد تحقق</strong></p></td>
      <td width="454"><p>افزودن کلاس‌های جداگانه برای سرویس‌های پیام‌رسانی (EmailMessageService، SMSMessageService، TelegramMessageService) به منظور رعایت مسئولیت واحد هر کلاس.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>اگر یک کلاس چندین مسئولیت داشته باشد، این اصل نقض می‌شود.</p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 2</p><p>Open-Close Principle (OCP)</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>TelegramMessageService: اضافه کردن یک کلاس جدید برای ارسال پیام تلگرامی بدون تغییر در کلاس‌های دیگر.<br>Main: استفاده از الگوی Factory برای ایجاد سرویس‌های مختلف پیام‌رسانی که به گسترش بدون تغییر کد کمک می‌کند.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>هر گونه تغییر در متدهای موجود که ممکن است برای اضافه کردن قابلیت‌های جدید نیاز باشد، می‌تواند باعث نقض OCP شود.</p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 3</p><p>Liskov Substitution Principle</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>ServiceMessage Interface: تمام سرویس‌های پیام‌رسانی (EmailMessageService، SMSMessageService، TelegramMessageService) به واسط ServiceMessage ارث‌بری می‌کنند و متدهای آن را پیاده‌سازی می‌کنند. این باعث می‌شود که هر کلاس بتواند به جای دیگری استفاده شود بدون این که کارایی سیستم مختل شود.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>اگر TelegramMessageService به طور کامل متدهای ServiceMessage را پیاده‌سازی نکند یا رفتارهای متفاوتی داشته باشد، این اصل نقض می‌شود.</p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 4</p><p>Interface Segregation Principle</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>ServiceMessage Interface: تفکیک متدها به واسط‌های جداگانه برای سرویس‌های مختلف (مانند validatePhoneNumber برای تلگرام) باعث می‌شود که کلاس‌ها تنها متدهایی را پیاده‌سازی کنند که واقعاً نیاز دارند.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>اگر واسط ServiceMessage شامل متدهایی باشد که همه سرویس‌ها به آن نیاز نداشته باشند، این اصل نقض می‌شود. در این صورت باید واسط‌ها را کوچک‌تر و تخصصی‌تر کنیم.</p></td>
    </tr>
    <tr>
      <td rowspan="2"><p>اصل 5</p><p>Dependency Inversion Principle</p></td>
      <td><p><strong>موارد تحقق</strong></p></td>
      <td><p>Main: وابستگی‌های High-level module به واسط ServiceMessage بجای کلاس‌های خاص (مانند EmailMessageService، SMSMessageService) باعث می‌شود که وابستگی‌ها به صورت معکوس و بر اساس Abstraction باشند.</p></td>
    </tr>
    <tr>
      <td><p><strong>موارد نقض</strong></p></td>
      <td><p>اگر کلاس Main به طور مستقیم به کلاس‌های خاص سرویس پیام‌رسانی وابسته باشد، این اصل نقض می‌شود. باید از تزریق وابستگی یا الگوهایی مانند Factory استفاده کرد تا وابستگی‌ها به واسط‌ها باشند.</p></td>
    </tr>
  </tbody>
</table>

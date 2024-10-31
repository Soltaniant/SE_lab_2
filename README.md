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

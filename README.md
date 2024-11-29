# Лабораторная работа №6. Уведомления.
- Код приложения написан на языке Java и использует Android SDK.

## Инструкция по использованию приложения
Данное приложение позволяяет устанавливать напоминания.
- [Добавление](#добавление)
- [Уведомление](#уведомление)
- [Удаление](удаление)

## Добавление
Напоминания вводятся на главном экране и сохраняются в базу данных. Также через главный экран можно просмотреть установленные уведомления.
<p align="center">
<img src="https://sun9-40.userapi.com/impg/K4ms3lK7wnMZOpirpV68VLKGbCSzaa2Cq5XcAA/QD6tSG7v-rQ.jpg?size=720x1520&quality=95&sign=6a88ef995576388c0e434a10c9f8698f&type=album" width="250" height="500"> 
<img src="https://sun9-9.userapi.com/impg/lX9uBWaxA-SA7kwXXYzL31vnS2-fuyIgVP876w/j4NkNv_sguk.jpg?size=720x1520&quality=95&sign=b24cb2e4a74fb9c5c0ed3ea5d4651a49&type=album" width="250" height="500">
<img src="https://sun9-50.userapi.com/impg/MQtTPwrU30dcEX3tTiUhwcWug4AJ_WS3-ZSQpA/ticXwlpy80s.jpg?size=720x1520&quality=95&sign=4ad9fb7d37413c9e7f42c4d8ef458ae5&type=album" width="250" height="500"> 
<img src="https://sun9-60.userapi.com/impg/KNVTDlLBnIS_UUxxL9H7gfYvFzTzMeAbvy0p-g/lUf8GPE73SE.jpg?size=720x1520&quality=95&sign=205183e91aa9f50d122c85148d855b53&type=album" width="250" height="500">
<img src="https://sun9-74.userapi.com/impg/gzSfSpUsPWMFGr10dmGQPCvZMzH4Rr9dDf-5VQ/8DyGFI2tGeE.jpg?size=720x1520&quality=95&sign=a86d4eeb5ac38bffcbae68bb6abd54c4&type=album" width="250" height="500">
</p> 
В БД хранятся: заголовок, текст уведомления и дата 
уведомления).

```java
public static final String TABLE_NAME = "reminder_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "TITLE";
    public static final String COL_3 = "MESSAGE";
    public static final String COL_4 = "DATE";
```

##Уведомление
Уведомление приходит в назначенную дату и время.
<p align="center">
<img src="https://sun9-58.userapi.com/impg/auPoMh2Ctk1y9cA5M_S3Vs-uN0Lpr9qpAh8LHA/BHCw2BmUMrA.jpg?size=720x1520&quality=95&sign=830900730e2715b69703f9911d370b20&type=album" width="250" height="500"> 
</p> 

##Удаление
При нажатии на упоминание - оно удаляется.
<p align="center">
<img src="https://sun9-47.userapi.com/impg/4FgLpZYMevxLxWOBAR8dhp17dcF2K1CNOK-qwA/5emwb_yMbDw.jpg?size=720x1520&quality=95&sign=73969c9a348e6595ce9111438d1fd60b&type=album" width="250" height="500"> 
</p>

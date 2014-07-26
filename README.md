CreditCardEditText
==================

A very simple custom view based on EditText that lets you validate credit card numbers.

# USAGE

Simply add the `CreditCardNumberEditText` module into your app and add it as a dependency.

Place the view in your layout example like this

```
<com.sathley.customviews.creditcardedittext.CcnEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Enter credit card number here..."
        android:id="@+id/CcnEditText"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="26dp"></com.sathley.customviews.creditcardedittext.CcnEditText>
```
You are free to customize it as you wish or extend it further.

Then from your activity code, you can call the `validate()` function on the view anytime to check the validity of the text entered into it. It returns an enum value depicting the credit card type or if its an invalid number.

```
CcnEditText editText = (CcnEditText) findViewById(R.id.CcnEditText);
CcnTypeEnum type = editText.validate();
```
P.S. : *Ccn* is short for credit card number.

# SUPPORTED CARD TYPES

The view identifies the folowing credit card types -

 -   VISA
 -   MASTERCARD
 -   DISCOVER
 -   JAPANESE_CREDIT_BUREAU
 -   AMERICAN_EXPRESS
 -   CHINA_UNIONPAY
 -   MAESTRO

Kindly let me know your feedback or any feature requests. I'm available at **sathley90@gmail.com**

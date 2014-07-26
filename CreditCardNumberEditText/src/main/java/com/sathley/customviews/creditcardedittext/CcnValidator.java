package com.sathley.customviews.creditcardedittext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sathley on 7/26/2014.
 */
public class CcnValidator {

    private static final Map<CcnTypeEnum, String> regexes = new HashMap<CcnTypeEnum, String>(){{
        put(CcnTypeEnum.VISA, "^4\\d{3}([\\ \\-]?)(?:\\d{4}\\1){2}\\d(?:\\d{3})?$");
        put(CcnTypeEnum.MASTERCARD, "^5[1-5]\\d{2}([\\ \\-]?)\\d{4}\\1\\d{4}\\1\\d{4}$");
        put(CcnTypeEnum.AMERICAN_EXPRESS, "^3[47]\\d\\d([\\ \\-]?)\\d{6}\\1\\d{5}$");
        put(CcnTypeEnum.CHINA_UNIONPAY, "^62[0-5]\\d{13,16}$");
        put(CcnTypeEnum.DISCOVER, "^6(?:011|22(?:1(?=[\\ \\-]?(?:2[6-9]|[3-9]))|[2-8]|9(?=[\\ \\-]?(?:[01]|2[0-5])))|4[4-9]\\d|5\\d\\d)([\\ \\-]?)\\d{4}\\1\\d{4}\\1\\d{4}$");
        put(CcnTypeEnum.JAPANESE_CREDIT_BUREAU, "^35(?:2[89]|[3-8]\\d)([\\ \\-]?)\\d{4}\\1\\d{4}\\1\\d{4}$");
        put(CcnTypeEnum.MAESTRO, "^(?:5[0678]\\d\\d|6304|6390|67\\d\\d)\\d{8,15}$");
    }};

    public CcnTypeEnum validate(String cardNumber)
    {
        for(Map.Entry<CcnTypeEnum, String> entry : regexes.entrySet())
        {
            if(cardNumber.matches(entry.getValue()))
                return entry.getKey();
        }
        return CcnTypeEnum.INVALID;
    }
}

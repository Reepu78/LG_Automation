package base;

import java.util.Map;

public class GlobalTestData {
    public static String GLOBAL_CUSTOMER_FIRST_NAME;
    public static String GLOBAL_CUSTOMER_LAST_NAME;
    public static String GLOBAL_ALT_CUSTOMER_FIRST_NAME;
    public static String GLOBAL_ALT_CUSTOMER_LAST_NAME;
    public static String GLOBAL_CUSTOMER_EMAIL;
    public static String GLOBAL_EXISTING_CUSTOMER_EMAIL;
    public static String GLOBAL_CUSTOMER_PASSWORD = "Test$1234";
    public static String GLOBAL_CUSTOMER_DIFFERENT_PASSWORD = "QA12345";
    public static String GLOBAL_CUSTOMER_BRAND_NEW_EMAIL;
    public static String GLOBAL_CUSTOMER_BRAND_NEW_EMAIL_USER_ID;
    public static String GLOBAL_CUSTOMER_BRAND_NEW_EMAIL_DOMAIN;
    public static String GLOBAL_CUSTOMER_PHONE_NUMBER = "(213) 621 0002";
    public static String GLOBAL_CUSTOMER_ALT_PHONE_NUMBER = "(213) 633 0112";
    public static String GLOBAL_KLARNA_SSN_INPUT = "1111";
    public static String GLOBAL_KLARNA_SSN_DOB = "12/12/1990";
    public static String GLOBAL_GNB_USER_ID = "hassan.bhuiyan";
    public static String GLOBAL_GNB_PASSWORD = "Lgcns$prod1";
    public static String GLOBAL_GNB_EMAIL_ID = "qalgcns@gmail.com";
    public static String GLOBAL_GNB_EMAIL_PASSWORD = "Test1234$";
    
    
    
    // Product
    public static String OMV_Subscription;
    public static String OMV_Non_Subscription;
    public static String OMD_HE_Innovel;
    public static String OMD_HE_Non_Innovel;
    public static String OMD_HA_Innovel;
    public static String OMD_HA_Non_Innovel;
    public static String OMD_KLARNA;
    public static String VISA_CARD_NO;
    public static String VISA_EXP_NO;
    public static String VISA_EXP_INVALIDDATE;
    public static String VISA_CVV;
    public static String MASTER_CARD_NO;
    public static String JCB_CARD_NO;
    public static String MASTER_EXP_NO;
    public static String MASTER_CVV;
    public static String AMEX_CARD_NO;
    public static String AMEX_EXP_NO;
    public static String AMEX_CVV;
    public static String OMV_Non_Subscription_With_Accessories;
    public static String HA_OMD_KLARNA;
    public static String HE_OMD_KLARNA_PROMO;
    public static String HE_OMD_KLARNA;
    public static String HE_OMD_NON_INNOVEL_KLARNA;

    //PromoCode
    public static String PROMO_CODE;
    public static String INVALID_PROMO_CODE;
    
    
    public static String[] GLOBAL_STATES_INSEARCHORDER = {"NY", "NJ", "CA", "TX", "HI"};
    public static String ZIPCODES(String key) {
    	switch (key) {
    	  case "NY":
    		  return "11416";
    	  case "NJ":
    		  return "08048";
    	  case "CA":
    		  return "94111";
    	  case "TX":
    		  return "75023";
    	  case "HI":
    		  return "96816";	
    	  default:
    		  return "94111";
    	}
    }
    public static String  ADDRESS(String key) {
    	switch (key) {
    	  case "NY":
    		  return "97-30 80TH STREET";
    	  case "NJ":
    		  return "36 Amaryllis Ln";
    	  case "CA":
    		  return "52 California Street";
    	  case "TX":
    		  return "1104 Cherokee Trl";
    	  case "HI":
    		  return "1252 Arron Smith Drive";	
    	  default:
    		  return "52 California Street";
    	}
    }  
    public static String  CITY(String key) {
    	switch (key) {
    	  case "NY":
    		  return "QUEENS";
    	  case "NJ":
    		  return "Lumberton";
    	  case "CA":
    		  return "San Francisco";
    	  case "TX":
    		  return "PLANO";
    	  case "HI":
    		  return "HONOLULU";	
    	  default:
    		  return "San Francisco";
    	}
    }  
    public static String  STATE(String key) {
    	switch (key) {
    	  case "NY":
    		  return "NEW YORK";
    	  case "NJ":
    		  return "NEW JERSEY";
    	  case "CA":
    		  return "CALIFORNIA";
    	  case "TX":
    		  return "TEXAS";
    	  case "HI":
    		  return "HAWAII";	
    	  default:
    		  return "CALIFORNIA";
    	}
    }  
    public static String ALTERNATE_ADDRESS(String key) {
    	switch (key) {
    	  case "NY":
    		  return "76-40 170th St";
    	  case "NJ":
    		  return "101 Stonebrook Dr";
    	  case "CA":
    		  return "511 1/2 Capp St";
    	  case "TX":
    		  return "920 Cross Bend Rd";
    	  case "HI":
    		  return "801 Kaheka St";	
    	  default:
    		  return "511 1/2 Capp St";
    	}
    }  
    

}

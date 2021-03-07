package sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSms {

	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
	public static final String CELL_NUMBER = System.getenv("cell_number");
	public static final String TWILIO_NUMBER = System.getenv("twilio_number");

	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(new PhoneNumber(CELL_NUMBER), new PhoneNumber(TWILIO_NUMBER),
				"1st Message from Twilio. Enjoy.").create();

		System.out.println(message.getSid());
	}
}